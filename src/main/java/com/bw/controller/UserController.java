package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.entity.User;
import com.bw.service.UserService;

@Controller
public class UserController {
	
	@Resource
	public UserService service;
	
	@RequestMapping("/queryUserAll")
	public String list(Model model){
		List<User>list=service.queryUserAll();
		model.addAttribute("list", list);
		return "list";
	}
}
