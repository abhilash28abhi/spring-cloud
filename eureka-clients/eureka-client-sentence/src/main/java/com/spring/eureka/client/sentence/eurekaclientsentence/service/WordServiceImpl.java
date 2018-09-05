package com.spring.eureka.client.sentence.eurekaclientsentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.eureka.client.sentence.eurekaclientsentence.feignclients.AdjectiveClient;
import com.spring.eureka.client.sentence.eurekaclientsentence.feignclients.ArticleClient;
import com.spring.eureka.client.sentence.eurekaclientsentence.feignclients.NounClient;
import com.spring.eureka.client.sentence.eurekaclientsentence.feignclients.SubjectClient;
import com.spring.eureka.client.sentence.eurekaclientsentence.feignclients.VerbClient;

@Service
public class WordServiceImpl implements WordService{
	
	@Autowired VerbClient verbClient;
	@Autowired SubjectClient subjectClient;
	@Autowired ArticleClient articleClient;
	@Autowired AdjectiveClient adjectiveClient;
	@Autowired NounClient nounClient;
	
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackSubject")
	public String getSubject() {
		return subjectClient.getWord();
	}
	
	@Override
	public String getVerb() {
		return verbClient.getWord();
	}
	
	@Override
	public String getArticle() {
		return articleClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public String getAdjective() {
		return adjectiveClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="getFallbackNoun")
	public String getNoun() {
		return nounClient.getWord();
	}	

	public String getFallbackSubject() {
		return new String("Someone");
	}
	
	public String getFallbackAdjective() {
		return new String("");
	}
	
	public String getFallbackNoun() {
		return new String("something");
	}
}
