package com.lym.service.b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lym.service.b.service.HelloService;

@RestController
@RequestMapping(value = "/service")
public class ServiceController {

	@Autowired
	HelloService helloService;
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name) {
		return helloService.hello(name);
	}
	
}
