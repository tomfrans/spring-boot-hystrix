package com.frans.hystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class EventService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod="getDefaultEvents")
	public String getDubaiEvents() {
		String events = this.restTemplate.getForObject("http://localhost:9000/service/events", String.class);
		return events;

	}
	
	@SuppressWarnings("unused")
	private String getDefaultEvents(){
		return "This is fallback method";
	}
}
