package com.bank.bankmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bank.bankmanagementsystem.*")
public class BankmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankmanagementsystemApplication.class, args);
	}

}
