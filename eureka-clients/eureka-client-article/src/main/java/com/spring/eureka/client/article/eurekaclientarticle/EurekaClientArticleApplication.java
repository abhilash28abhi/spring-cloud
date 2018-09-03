package com.spring.eureka.client.article.eurekaclientarticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientArticleApplication.class, args);
	}
}
