package com.spring.eureka.client.sentence.eurekaclientsentence.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaClientSentenceController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	//using ribbon
	@Autowired 
	RestTemplate restTemplate;
	
	@GetMapping("/sentence")
	  public @ResponseBody String getSentence() {
	    return 
	      getWord("eureka-client-subject") + " "
	      + getWord("eureka-client-verb") + " "
	      + getWord("eureka-client-article") + " "
	      + getWord("eureka-client-adjective") + " "
	      + getWord("eureka-client-noun") + "." ;
	  }
	
	/* Using Eureka discovery client
	 * public String getWord(String service) {
		List<ServiceInstance> list = discoveryClient.getInstances(service);
		if (list != null && list.size() > 0) {
			URI uri = list.get(0).getUri();
			if (uri != null) {
				return (new RestTemplate()).getForObject(uri, String.class);
			}
		}
		return null;
	}*/
	
	/**
	 *  Using the Ribbon client template created in the application class
	 * @param service
	 * @return
	 */
	public String getWord(String service) {
		  return restTemplate.getForObject("http://" + service, String.class);
	}
}
