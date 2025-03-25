package com.example.devops_github_action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsGithubActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsGithubActionApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "Welcome to Github Actions";
	}

	@RequestMapping("/create")
	public String create(){
		return "Successfully created";
	}
}
