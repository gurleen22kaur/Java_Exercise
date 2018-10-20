package com.example.demo.demo.spring;

import com.example.demo.demo.spring.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EntityScan(basePackages = "com.example.demo.demo.spring.entity")
@EnableJpaRepositories(basePackages ="com.example.demo.demo.spring.repository")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	User user(){
		return new User();
	}
}
