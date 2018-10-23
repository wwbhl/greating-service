package com.bhl.ehotel.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.bhl.ehotel.service.GreetingService;
import com.bhl.ehotel.service.SayHelloService;


@RestController
public class GreetingController {

	@Autowired
	private SayHelloService sayHelloService;
	
	@Value("${server.port}")
	private String port;
	
	@Value("${name}")
	private String defaultName;
	
	@RequestMapping("/greeting")
	public String greeting(@RequestParam String name) {
		String result = null;
		if(name != null && !"".equals(name)) {
			result = sayHelloService.sayHello(name);
		}else {
		
			result = "hello, this is default name: " + defaultName;
		}
		result += " , through greeting service from port: " + port;
		
		return result;
	}
}
