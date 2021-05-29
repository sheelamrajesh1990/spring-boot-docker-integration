package com.springboot.docker.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDockerJenkinsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerJenkinsIntegrationApplication.class, args);
		System.out.println("Test");
	}

}
