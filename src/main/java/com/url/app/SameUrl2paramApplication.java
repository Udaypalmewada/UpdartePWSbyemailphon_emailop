package com.url.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.url.app")
public class SameUrl2paramApplication {

	public static void main(String[] args) {
		SpringApplication.run(SameUrl2paramApplication.class, args);
	}

}
