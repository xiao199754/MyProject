package com.gupaoedu.controller;

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

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/23 15:47
 */
@RestController
public class UserController {

    @RequestMapping("/user/upload")
    public String upload(MultipartFile upload,String username) throws IOException {
        System.out.println("userName:" + username + " 文件名称:" + upload.getOriginalFilename());
        upload.transferTo(new File("d:/" ,upload.getOriginalFilename()));
        return "success ...";
    }

    @RequestMapping("/user/download")
    public void downloadFile(HttpServletRequest request, HttpServletResponse response){
        File file = new File("d://1.png");
        // 设置响应的头和客户端保存的文件名
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName=" + file.getName());
        InputStream in = null;
        ServletOutputStream out = null;
        try {
            // 文件的复制
            in = new FileInputStream(file);
            out = response.getOutputStream();
            // 循环读取
            byte[] b = new byte[1024];
            int length = 0;
            while((length = in.read(b)) > 0){
                out.write(b,0,length);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
