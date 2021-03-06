package com.lym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LymConfigServerApp {
	public static void main(String[] args) {
		SpringApplication.run(LymConfigServerApp.class, args);
	}
}