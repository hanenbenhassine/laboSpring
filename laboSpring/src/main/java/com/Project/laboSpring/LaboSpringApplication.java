package com.Project.laboSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaboSpringApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(LaboSpringApplication.class, args);
	}

}
