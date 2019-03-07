package com.chuchloud.contreller.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 是@Controller 和 @ResponseBody的集合
@RestController
@EnableAutoConfiguration
public class HelloContoller {

	// 请求路径
	@RequestMapping("/")
	public String sayHello() {
		return "hello spring boot!";
	}
}
