package com.frans.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frans.hystrix.service.EventService;

@RestController
public class EventsController {
	
	@Autowired
	EventService eventService;

	@RequestMapping(value="/dubai/events")
	public String getDubaiEvents(){
		return eventService.getDubaiEvents();
	}
}
