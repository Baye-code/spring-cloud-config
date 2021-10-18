package com.bogal.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bogal.app.config.LimitConfig;
import com.bogal.app.entity.LimitEntity;


@RestController
@RequestMapping("limits-service")
public class LimitController {
	
	@Autowired
	private LimitConfig limitConf;
	
//	@Value("${limits-service.minimum}")
//	private int minimum;
//	
//	@Value("${limits-service.maximum}")
//	private int maximum;
	
	@GetMapping("/")
	public LimitEntity retrieveLimits() {
		return  new LimitEntity(1, 1000);
	}
	
	
	@GetMapping("/thelimits")
	public LimitEntity retrieveAllLimits() {
		return  new LimitEntity(limitConf.getMinimum(), limitConf.getMaximum());
	}
	

}