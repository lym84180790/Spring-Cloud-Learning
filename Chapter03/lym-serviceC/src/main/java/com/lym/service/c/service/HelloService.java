package com.lym.service.c.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "lym-serviceA")
public interface HelloService {

	@RequestMapping(value = "/service/hello", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name);
}
