package com.cache.secondlevel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cache.secondlevel")
public class SecondlevelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondlevelApplication.class, args);
	}
}
