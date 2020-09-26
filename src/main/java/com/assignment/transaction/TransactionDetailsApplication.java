package com.assignment.transaction;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "com.assignment.transaction.controller"
})
public class TransactionDetailsApplication {

	public static void main(String[] args) {

        System.out.println("starting app...");
		SpringApplication app = new SpringApplication(TransactionDetailsApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "9090"));
        app.run(args);

	}

}
