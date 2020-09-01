package com.demo.utils;

import java.io.*;
import java.sql.*;
import java.util.HashMap;

public class TextUtils {

    public static void DbToTxt(String table_name, String out_path) {
        String project_path;
        project_path = TextUtils.class.getProtectionDomain().getCodeSource().getLocation().getFile();
        String out_path1 = project_path + "export.txt";
        System.out.println("路径：" + out_path1);

        if (table_name == "" || table_name == null) {
            System.out.println("数据库名称不能为空！！");
            return;
        }
        if (out_path == "" || out_path == null) {
            project_path = TextUtils.class.getProtectionDomain().getCodeSource().getLocation().getFile();
            out_path = project_path + "export.txt";
            System.out.println("路径：" + out_path);
        }

        File out_file = new File(out_path);
        try {
            if (out_file.exists()) {
                out_file.delete();
            } else {
                out_file.createNewFile();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //数据库名称、用户名、密码
        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; //数据库链接地址(WWW-8E98D3889CA是本机地址，根据实际情况改写)
        String name = "audit"; //用户名，根据实际情况写
        String pwd = "888888"; //密码
        //字符缓冲区
        StringBuffer sb = new StringBuffer();
        try {
            //先链接数据库
            //1.加载驱动
            Class.forName(driver);
            //2.得到连接
            Connection ct = DriverManager.getConnection(url, name, pwd);
            //从下面开始和sql server 一模一样
            Statement sm = ct.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            //执行sql语句得到数据集
            String sql = "select * from " + table_name;  //  查询sql
            ResultSet rs = sm.executeQuery(sql);
            ResultSetMetaData rsm = null;//获取 列信息
            rsm = rs.getMetaData();
            int columns = rsm.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columns; i++) {
                    if (i < columns) {
                        sb.append(rs.getString(i) + " ");
                    } else {
                        sb.append(rs.getString(i));
                    }
                }
                sb.append("\n");
                System.out.println("是否为最后一行：" + rs.isLast());
            }
            String data = sb.toString();
            rs.close();
            sm.close();

            //将数据库数据写入指定的txt文件
            File file = new File(out_path);  //自定义文件路径
            OutputStreamWriter write;
            write = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            BufferedWriter writer = new BufferedWriter(write);
            writer.write(data);  // 输出流写入到文件中
            writer.close();
            write.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void setDataSourceFromDB(HashMap<String, String> dataSource, ResultSet rst) throws Exception {
        ResultSetMetaData rsmd = rst.getMetaData();
        int numberOfColumns = rsmd.getColumnCount();
        String sKey = "";
        String sValue = "";
        if (dataSource != null) {
            for (int i = 1; i <= numberOfColumns; i++) {
                sKey = (rsmd.getColumnName(i)).trim();
                String tString = rst.getString(i);
                if (tString == null) sValue = "";
                else{
                    sValue = tString.trim();
                    if (sValue == null) sValue = "";
                }
                dataSource.put(sKey, sValue);
            }
        }
        else{
            throw new Exception("dataSource object is null.");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println("输出"+"\n"+"测试");
        //System.out.println("目录："+Export_Data.class.getProtectionDomain().getCodeSource().getLocation().getFile());
//        TextUtils daochu = new TextUtils();
        TextUtils.DbToTxt("task_status", "F:\\bbbbbbb\\export.txt");

    }
}
