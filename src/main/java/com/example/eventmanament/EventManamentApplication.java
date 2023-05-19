package com.example.eventmanament;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.eventmanament")
public class EventManamentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventManamentApplication.class, args);
	}

}
