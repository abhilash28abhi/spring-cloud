package com.spring.eureka.client.sentence.eurekaclientsentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class EurekaClientSentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientSentenceApplication.class, args);
	}

	/*This "LoadBalanced" RestTemplate is automatically hooked into Ribbon:
	@Bean annotation indicates that a method produces a bean that should be managed by the Spring container*/
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
