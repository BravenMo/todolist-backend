package com.backend.todolistbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistbackendApplication {

	public static void main(String[] args) {
		System.out.println("Starting Application: ");
		System.out.println("🔍 DB_HOST: " + System.getenv("DB_HOST"));
		System.out.println("🔍 JDBC URL: " + System.getenv("DB_HOST") + ":" + System.getenv("DB_PORT") + "/" + System.getenv("DB_NAME"));
		SpringApplication.run(TodolistbackendApplication.class, args);
	}

}
