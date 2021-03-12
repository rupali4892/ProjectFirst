package com.rtj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rtj")
public class ApplicationHiber {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationHiber.class, args);

	}

}
