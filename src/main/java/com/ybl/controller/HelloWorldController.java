package com.ybl.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
public class HelloWorldController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	@ResponseBody
	public String sayHello(){
		//hello world abc
		return "hello world!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}
}
