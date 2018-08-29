package com.spring.config.client.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudConfigClientController {
	
	@Value("${config-word}")
	private String configValue;
	
	@GetMapping("/config")
	public String getConfigValue() {
		return "The value from config server is " + configValue;
	}
}
