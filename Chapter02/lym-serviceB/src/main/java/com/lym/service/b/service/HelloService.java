package com.lym.service.b.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;
	
	public String hello(String name) {
		return restTemplate.getForObject("http://lym-serviceA/service/hello?name=" + name, String.class);
	}
}
