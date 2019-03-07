package com.chuchloud.contreller.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chuchloud.entity.demo.User;
import com.chuchloud.service.demo.UserService;

@RestController
@RequestMapping(value = "/CRUD", method = { RequestMethod.GET, RequestMethod.POST })
public class UserController {
	@Autowired
	private UserService userservice;

	@RequestMapping("/ListUser")
	@ResponseBody
	public List<User> ListUser() {
		return userservice.ListUser();
	}
}
