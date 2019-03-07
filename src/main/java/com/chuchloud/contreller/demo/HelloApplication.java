package com.chuchloud.contreller.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 启动类注解
@SpringBootApplication
@EnableAutoConfiguration
public class HelloApplication {

	public static void main(String[] args) {
		// 真正的启动代码, 会执行一些初始化什么的, 启动内置监听等....
		SpringApplication.run(HelloContoller.class, args);
		// SpringApplication.run(CRUD.class, args);
	}
}
