package com.java.ticketbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TicketBookerApplication
//extends SpringBootServletInitializer 
{

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(TicketBookerApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(TicketBookerApplication.class, args);
	}

}
