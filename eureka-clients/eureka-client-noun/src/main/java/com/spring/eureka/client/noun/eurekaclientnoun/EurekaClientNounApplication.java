package com.spring.eureka.client.noun.eurekaclientnoun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientNounApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientNounApplication.class, args);
	}
}
