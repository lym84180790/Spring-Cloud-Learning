package com.lym.service.a.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lym.service.a.entity.User;

@RestController
@RequestMapping(value = "/service")
public class ServiceController {

	private static Logger log = LoggerFactory.getLogger(ServiceController.class);
	@Value("${server.port}")
    String port;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name) {
		return "Hello " + name + ",I am from serviceA,port:" + port;
	}
	
	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public User getUser(@RequestBody User user) {
		log.info("user===>" + user.getId() + "," + user.getName() + "," + user.getUserId() + "," + user.getUserName());
		return user;
	}
	
	@Value("${lym}")
	String lym;
	
	@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
	public String test() {
		return "test:lym====>" + lym;
	}
	

}
