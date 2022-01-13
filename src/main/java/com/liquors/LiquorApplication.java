package com.liquors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping
public class LiquorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiquorApplication.class, args);
	}

}
