package com.spring.eureka.client.sentence.eurekaclientsentence.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-adjective")
public interface AdjectiveClient {

	@GetMapping("/")
	public String getWord();
}