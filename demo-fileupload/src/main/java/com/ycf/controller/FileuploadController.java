/**
 * Copyright 2017 超凡. All rights reserved
 * Project Name:springboot-demo
 * Module Name:Core
 */
package com.ycf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * what:   文件上传controller. <br/>
 *
 * @author 杨超凡 created on 2017/12/25
 */
@Controller
public class FileuploadController {

    @RequestMapping("/file")
    public String file() {
        return "/file";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file")MultipartFile file){
        if(!file.isEmpty()) {
            /*
               * 这段代码执行完毕之后，图片上传到了工程的跟路径；
               * 大家自己扩散下思维，如果我们想把图片上传到 d:/files大家是否能实现呢？
               * 等等;
               * 这里只是简单一个例子,请自行参考，融入到实际中可能需要大家自己做一些思考，比如：
               * 1、文件路径；
               * 2、文件名；
               * 3、文件格式;
               * 4、文件大小的限制;
               */
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return"上传失败,"+e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return"上传失败,"+e.getMessage();
            }
            return"上传成功";
         }else{
            return"上传失败，因为文件是空的.";
        }
    }
}
