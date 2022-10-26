package com.esprit.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VoitureeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureeApplication.class, args);
	}

}
