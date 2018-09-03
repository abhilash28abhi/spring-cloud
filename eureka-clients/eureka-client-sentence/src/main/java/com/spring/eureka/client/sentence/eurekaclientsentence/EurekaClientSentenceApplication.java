package com.spring.eureka.client.sentence.eurekaclientsentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientSentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientSentenceApplication.class, args);
	}
}
