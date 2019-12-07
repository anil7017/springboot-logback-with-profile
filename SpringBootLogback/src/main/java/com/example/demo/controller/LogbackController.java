package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.NameDetails;

@RestController
public class LogbackController {

	@Autowired
	NameDetails nameDetails;
	
	Logger logger = LoggerFactory.getLogger(LogbackController.class);
	
	@GetMapping("/welcome")
	public NameDetails getDataBaseConnectionDetails(){
		
		System.out.println("data  "+nameDetails);
		
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
		
		return nameDetails ;
	}	
}
