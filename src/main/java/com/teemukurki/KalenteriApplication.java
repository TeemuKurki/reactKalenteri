package com.teemukurki;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.teemukurki.domain.Event;
import com.teemukurki.domain.EventRepository;
import com.teemukurki.domain.User;
import com.teemukurki.domain.UserRepository;

@SpringBootApplication
public class KalenteriApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalenteriApplication.class, args);
	}
	
	@Bean
	
	public CommandLineRunner demo(EventRepository erepo, UserRepository urepo) {
		return (args) -> {
			User user = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User admin = new User("admin", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			urepo.save(user);
			urepo.save(admin);
			erepo.save(new Event("Tilaisuus1","05/03/2017","Hauskaa", user));
			erepo.save(new Event("Tilaisuus2","07/03/2017","Kivaa", user));
			erepo.save(new Event("Tilaisuus2","09/03/2017","Mukavaa", admin));
		};
	}
}
