package com.bw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.User;
import com.bw.mapper.UserDao;
import com.bw.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Resource
	public UserDao dao;
	
	public List<User> queryUserAll() {
		return dao.queryUserAll();
	}

}
