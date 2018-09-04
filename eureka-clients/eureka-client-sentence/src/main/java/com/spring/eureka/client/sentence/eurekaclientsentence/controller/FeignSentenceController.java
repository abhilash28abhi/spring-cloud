package com.spring.eureka.client.sentence.eurekaclientsentence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.eureka.client.sentence.eurekaclientsentence.service.SentenceService;

@RestController
public class FeignSentenceController {
	
	@Autowired
	SentenceService sentenceService;
	
	
	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
	  return 
		"<h3>Some Sentences</h3><br/>" +	  
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>";
	}
}
