package com.example.auth;

import com.example.auth.user.User;
import com.example.auth.user.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialUserData(UserRepository userRepository) {
		return (args) -> {
			User user = new User("ocky@gmail.com", "ocky", "123456", "ADMIN");
			userRepository.save(user);

			user = new User("galih@gmail.com", "galih", "123456", "USER");
			userRepository.save(user);

			user = new User("pratama@gmail.com", "pratama", "123456", "USER");
			userRepository.save(user);
		};
	}

}
