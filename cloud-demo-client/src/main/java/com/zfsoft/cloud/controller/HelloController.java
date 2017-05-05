package com.zfsoft.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloController {

	@Autowired
    RestTemplate restTemplate;
	
	@RequestMapping(value = "/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/login")
    public String login() {
        return "login";
    }
	
	@RequestMapping(value = "/hello")
	public String hello(){
		return "hello";
	}
	
//    @RequestMapping(value = "/hello")
//    public ResponseEntity<String> home() {
//    	System.out.println("client home execute");
//        return restTemplate.getForEntity("http://CLOUD-DEMO-SERVICE/hello", String.class);
//    }
}
