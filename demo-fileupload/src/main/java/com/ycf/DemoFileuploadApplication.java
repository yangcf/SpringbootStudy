package com.ycf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
public class DemoFileuploadApplication {

	/**
	 * 注入文件上传限制
	 * @return
	 */
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory multipartConfigFactory = new MultipartConfigFactory();
		//设置上传文件的大小
		multipartConfigFactory.setMaxFileSize("1KB");
		//设置总上传数据总大小
		multipartConfigFactory.setMaxRequestSize("256KB");
		//设置文件存储地址
//		multipartConfigFactory.setLocation("路径地址");
		return multipartConfigFactory.createMultipartConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoFileuploadApplication.class, args);
	}
}
