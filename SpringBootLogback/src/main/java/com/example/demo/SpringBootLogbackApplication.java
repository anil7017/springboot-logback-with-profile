package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.LogbackController;

@SpringBootApplication
public class SpringBootLogbackApplication {

	static Logger logger = LoggerFactory.getLogger(LogbackController.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLogbackApplication.class, args);
		
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
		
	}

}
