package com.teemukurki;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.teemukurki.domain.EventRepository;

@SpringBootApplication
public class KalenteriApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalenteriApplication.class, args);
	}
	
	@Bean
	
	public CommandLineRunner demo(EventRepository repo) {
		return (args) -> {
			//repo input tänne
		};
	}
}
