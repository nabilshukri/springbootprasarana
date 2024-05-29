package com.prasarana.springbootprasarana;

import com.prasarana.springbootprasarana.model.MyUser;
import com.prasarana.springbootprasarana.model.MyUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@SpringBootApplication
public class SpringbootprasaranaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootprasaranaApplication.class, args);
	}

	@Bean
	CommandLineRunner run(MyUserRepository myUserRepository, PasswordEncoder passwordEncoder) {

		return args ->{
			MyUser user = new MyUser();
			user.setUsername("admin");
			user.setPassword(passwordEncoder.encode("admin"));
			user.setRole("ADMIN");
			myUserRepository.save(user);
		};
	}

}
