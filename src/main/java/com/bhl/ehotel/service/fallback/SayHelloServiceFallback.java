package com.bhl.ehotel.service.fallback;

import org.springframework.stereotype.Component;

import com.bhl.ehotel.service.SayHelloService;

@Component
public class SayHelloServiceFallback implements SayHelloService {
	
	public String sayHello(String name) {
		return "error, " + name;
	}

}
