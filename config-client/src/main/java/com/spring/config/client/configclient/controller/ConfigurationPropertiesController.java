package com.spring.config.client.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationPropertiesController {
	
	@Autowired
	private ConfigurationPropertyHolder configProperties;
	
	@GetMapping("/configuration")
	public String getConfigValue() {
		return configProperties.getPreamble() + ": " + configProperties.getLuckyWord();
	}
}
