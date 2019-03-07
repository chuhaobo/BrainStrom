package com.chuchloud.service.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuchloud.dao.UserDao;
import com.chuchloud.entity.demo.User;

@Service
public class UserService {
	@Autowired
	private UserDao userMapper;

	public List<User> ListUser() {
		return userMapper.ListUser();
	}
}
