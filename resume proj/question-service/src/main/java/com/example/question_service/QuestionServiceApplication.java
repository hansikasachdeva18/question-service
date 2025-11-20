package com.example.question_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// main class
// entry point
@SpringBootApplication
public class QuestionServiceApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(QuestionServiceApplication.class, args);
	}
}
