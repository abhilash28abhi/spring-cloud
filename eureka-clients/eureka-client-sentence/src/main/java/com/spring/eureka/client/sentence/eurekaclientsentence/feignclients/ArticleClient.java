package com.spring.eureka.client.sentence.eurekaclientsentence.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-article")
public interface ArticleClient {
	
	@GetMapping("/")
	public String getWord();
}
