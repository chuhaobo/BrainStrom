package com.chuchloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chuchloud.dao")
public class UserMainApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserMainApplication.class, args);
	}
}
