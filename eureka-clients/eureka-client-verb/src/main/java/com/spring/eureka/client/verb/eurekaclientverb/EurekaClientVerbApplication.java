package com.spring.eureka.client.verb.eurekaclientverb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientVerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientVerbApplication.class, args);
	}
}
