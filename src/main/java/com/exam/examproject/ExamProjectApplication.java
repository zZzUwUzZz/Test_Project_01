package com.exam.examproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ExamProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamProjectApplication.class, args);
	}

}
