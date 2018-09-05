package com.spring.eureka.client.sentence.eurekaclientsentence.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//client name should match the eureka client name
@FeignClient("eureka-client-noun")
public interface NounClient {

	@GetMapping("/")
	public String getWord();
}
