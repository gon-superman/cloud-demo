package com.zfsoft.cloud.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationServer {
	
	public static void main(String[] args) {
        SpringApplication.run(ApplicationServer.class, args);
    }
}
