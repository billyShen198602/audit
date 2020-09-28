package com.demo.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SimpleDocument {

    public static void main(String[] args) throws Exception {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("@1@", "huangqiqing");
        param.put("@2@", "信息管理与信息系统");
        param.put("@3@", "男");
        param.put("@4@", "山东财经大学");
        param.put("@5@", new Date().toString());

        Map<String, Object> header = new HashMap<String, Object>();
        header.put("width", 100);
        header.put("height", 150);
        header.put("type", "jpg");
        header.put("content", WordUtils.inputStream2ByteArray(new FileInputStream("./src/new.jpg"), true));
//        header.put("content", WordUtils.inputStream2ByteArray(new FileInputStream("E:\\billy\\word\\new.jpg"), true));
        param.put("@6@", header);


        CustomXWPFDocument doc = WordUtils.generateWord(param, ".\\src\\1.docx");
//        CustomXWPFDocument doc = WordUtils.generateWord(param, "F:\\code\\yuxin_code\\src\\src\\1.docx");
        FileOutputStream fopts = new FileOutputStream("./src/2.docx");
        doc.write(fopts);
        fopts.close();
    }
}