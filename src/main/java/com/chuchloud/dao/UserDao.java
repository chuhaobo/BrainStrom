package com.chuchloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.chuchloud.entity.demo.User;

@Mapper
public interface UserDao {
	@Select("SELECT * FROM user")
	public List<User> ListUser();
}
