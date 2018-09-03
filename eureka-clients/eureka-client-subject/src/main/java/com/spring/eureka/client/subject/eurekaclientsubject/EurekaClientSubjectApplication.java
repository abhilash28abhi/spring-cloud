package com.spring.eureka.client.subject.eurekaclientsubject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientSubjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientSubjectApplication.class, args);
	}
}
