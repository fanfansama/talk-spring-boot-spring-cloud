package com.talanlabs.talk.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringCloudApplication
@EnableZuulServer
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}