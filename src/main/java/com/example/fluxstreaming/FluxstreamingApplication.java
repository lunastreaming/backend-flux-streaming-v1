package com.example.fluxstreaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FluxstreamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FluxstreamingApplication.class, args);
	}

}
