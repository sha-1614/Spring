package com.java.ticketbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TicketBookerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookerApplication.class, args);
	}

}
