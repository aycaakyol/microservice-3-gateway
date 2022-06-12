package com.aa.microservice3gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Microservice3GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice3GatewayApplication.class, args);
	}
}
