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
public class ReadConfigureFile3 {

    public void readFile() {
        //创建远程连接，默认连接端口为22，如果不使用默认，可以使用方法
        //new Connection(ip, port)创建对象
        String ip = "47.93.199.61";
        String usr = "root";
        String pwd = "1984SSxx..";
        //int     port=22;
        ch.ethz.ssh2.Connection conn = null;
        String date = "";
        String path="";
        try {
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
                Vector<?> v = sft.ls("path");
                for (int i = 0; i < v.size(); i++) {
                    SFTPv3DirectoryEntry s = new SFTPv3DirectoryEntry();
                    s = (SFTPv3DirectoryEntry) v.get(i);
                    //文件名
                    String filename = s.filename;
                    if (filename.length() > 17) {
                        String substring = filename.substring(7, 17);
                        if (substring.equals(date)) {
                            System.out.println(filename);

                            Session ss=null;
                            ss=conn.openSession();
                            ss.execCommand("cat ".concat("path"+filename));
                            InputStream    is = new StreamGobbler(ss.getStdout());
                            BufferedReader bs = new BufferedReader(new InputStreamReader(is));
                            while(true){
                                String line = bs.readLine();
                                if(line==null){
                                    break;
                                }else{
                                    System.out.println("abc........................"+line);
                                }
                            }
                            bs.close();
                            ss.close();
                            conn.close();
                        }
                    }
                }

            }
        } catch (IOException e) {
            System.err.printf("用户%s密码%s登录服务器%s失败！", usr, pwd, ip);
            e.printStackTrace();
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://47.93.199.61:3306/test";
        String username = "root";
        String password = "root";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }


        File file = new File("F:/bbbbbbb");//得到所选择文件夹
        String path = file.getAbsolutePath();//得到选择文件夹的全路径
        String[] files = file.list();//取得文件夹下的所有文件
        try {
            conn.setAutoCommit(false);//设置数据手动提交，自己管理事务
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }//

        for (int i = 0; i < files.length; i++) {//遍历文件夹下所有文件
            String fileName = files[i].substring(0, files[i].lastIndexOf("."));//取得所选文件名
//            String province = fileName.substring(0, fileName.length() - 2);
//            String cardType = fileName.substring(fileName.length() - 2);
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(path + "\\" + files[i]);
                InputStreamReader input = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(input);
                String line = null;
                String sql = null;
                String info[] = null;
                try {
                    while ((line = br.readLine()) != null) {
                        info = line.split(" ");
//                        log.info(  "******55555555555*****************" +info[5] + "***************************************************");
//                        log.info(  "******666666666666*****************" +info[6] + "***************************************************");
//                        log.info(  "******77777777777777*****************" +info[7] + "***************************************************");
//                        log.info(  "******888888888888888*****************" +info[8] + "***************************************************");
//                        log.info(  "******99999999999*****************" +info[9] + "***************************************************");
//                        sql = sql = "insert into task_rec(task_rec_id,task_id,task_name,promoter_user,task_assign,create_time,until_time,task_status_change_before,task_status_change_after,task_status_change_time)values" +
//                                "('" + info[0] + "','" + info[1] + "','" + info[2] + "','" + info[3] + "','" + info[4] + "','\"+info[5]+\"','\"+info[6]+\"','\"+info[7]+\"','\"+info[8]+\"','\"+info[9]+\"')";
                        //stmt.executeUpdate(sql);
                        for (String in : info){
                            log.info("******************" + in + "******************");
                        }
//                        sql = "insert into task_status(task_status_code,task_status_name) values ('"info[0] + "')"
                        log.info(info[0]);
                        log.info(info[1]);
                        sql = sql = "insert into task_status(task_status_code,task_status_name)values('"+ info[0] +"','"+info[1]+"')";
                        stmt.addBatch(sql);
                    }
                    stmt.executeBatch();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                //提交事务
                conn.commit();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void importODS(String fileName){

    }
}
