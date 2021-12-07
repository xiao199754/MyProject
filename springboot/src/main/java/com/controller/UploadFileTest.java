package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class UploadFileTest {

    @RequestMapping("/upload")
    public String upload(MultipartFile multipartFile,String username) throws IOException {
        System.out.println("username:"+username+" 文件名:"+multipartFile.getOriginalFilename());
        multipartFile.transferTo(new File("d:/",multipartFile.getOriginalFilename()));
        return "上传成功";
    }

    @RequestMapping("/download")
    public void downloadFile(HttpServletRequest request, HttpServletResponse response) {
        File file = new File("D://adc.jpg");
        System.out.println(file.getName());
        // 设置响应的头和客户端保存的文件名
        response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition","attachment;fileName="+file.getName());

        InputStream inputStream = null;
        ServletOutputStream outputStream = null;

        try{
            // 文件的复制
            inputStream = new FileInputStream(file);
            outputStream = response.getOutputStream();

            // 循环读取
            byte[] b = new byte[1024];
            int length = 0;
            while((length = inputStream.read(b)) > 0){
                outputStream.write(b,0,length);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
