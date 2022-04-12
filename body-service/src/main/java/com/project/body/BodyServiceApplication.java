package com.project.body;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BodyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodyServiceApplication.class, args);
	}
	
}
