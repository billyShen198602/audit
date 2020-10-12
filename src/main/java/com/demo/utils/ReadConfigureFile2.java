package com.demo.utils;

import ch.ethz.ssh2.SFTPv3Client;
import ch.ethz.ssh2.SFTPv3DirectoryEntry;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

@Slf4j
public class ReadConfigureFile2 {

    public static void readFile() {
        //创建远程连接，默认连接端口为22，如果不使用默认，可以使用方法
        //new Connection(ip, port)创建对象
        String url = "jdbc:mysql://47.93.199.61:3306/test";
        String username = "root";
        String password = "root";
        String ip = "47.93.199.61";
        String usr = "root";
        String pwd = "1984SSxx..";
        Statement stmt = null;
        //int     port=22;
        ch.ethz.ssh2.Connection conn = null;
        Connection conn_ = null;
        String date = "";
        String path = "/usr/local/citic_etl/";
        try {
            conn_ = DriverManager.getConnection(url, username, password);
            stmt = conn_.createStatement();
            //连接远程服务器
            // 连接部署服务器
            conn = new ch.ethz.ssh2.Connection(ip);
            conn.connect();
            //使用用户名和密码登录
            boolean b = conn.authenticateWithPassword(usr, pwd);
            if (!b) {
                throw new IOException("Authentication failed.");
            } else {
                SFTPv3Client sft = new SFTPv3Client(conn);
                Vector<?> v = sft.ls("/usr/local/citic_etl");
                for (int i = 0; i < v.size(); i++) {
                    SFTPv3DirectoryEntry s = new SFTPv3DirectoryEntry();
                    s = (SFTPv3DirectoryEntry) v.get(i);
                    //文件名
                    String filename = s.filename;
                    if (filename.startsWith(".")){
                        return;
                    }
                    log.info(filename);
                    Session ss = null;
                    ss = conn.openSession();
                    ss.execCommand("cat ".concat(path + filename));
                    InputStream is = new StreamGobbler(ss.getStdout());
                    BufferedReader bs = new BufferedReader(new InputStreamReader(is));
                    String info[] = null;
                    String sql = null;
                    while (true) {
                        String line = bs.readLine();
                        if (line == null) {
                            break;
                        } else {
                            info = line.split(" ");
                            log.info("abc........................" + line);
                            for (String in : info) {
                                log.info("******************" + in + "******************");
                            }
                            log.info(info[0]);
                            log.info(info[1]);
                            log.info("Info[0]((((((((((((((((((((((((" + String.valueOf(info[0].length()) + "))))))))))))))))))))))))");
                            log.info("Info[1]((((((((((((((((((((((((" + String.valueOf(info[1].length()) + "))))))))))))))))))))))))");
                            sql = sql = "insert into task_status(" +
                                    "task_status_code,task_status_name)values('" + info[0] + "','" + info[1] + "')";
                            stmt.addBatch(sql);
                        }
                    }
                    stmt.executeBatch();
                    bs.close();
                    ss.close();
                    conn.close();
                }

            }
        } catch (IOException e) {
            System.err.printf("用户%s密码%s登录服务器%s失败！", usr, pwd, ip);
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            //提交事务
            conn_.commit();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        readFile();
    }
}
