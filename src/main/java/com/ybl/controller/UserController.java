package com.ybl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ybl.pojo.User;
import com.ybl.repository.UserRepository;

@Controller
@EnableAutoConfiguration
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/user/getUserById")
	@ResponseBody
	public User getUserById(@RequestParam Long id){
		System.out.println("您好，用户");
		User u = userRepository.findOne(id);
		System.out.println(userRepository);
		System.out.println(u);
		return u;
	}
	
	@RequestMapping(value="/user/findUserByName")
	@ResponseBody
	public User findUserByName(@RequestParam String name){
		System.out.println("您好，用户");
		User u = userRepository.findUserByName(name);
		System.out.println(u);
		return u;
	}


	@RequestMapping(value="/user/findUserBySex")
	@ResponseBody
	public User findUserBySex(@RequestParam String sex){
		System.out.println("您好，用户");
		User u = userRepository.findUserBySex(sex);
		System.out.println(u);
		return u;
	}
}
