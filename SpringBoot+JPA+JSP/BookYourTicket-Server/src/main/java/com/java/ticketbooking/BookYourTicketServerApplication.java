package com.java.ticketbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BookYourTicketServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookYourTicketServerApplication.class, args);
	}

}
