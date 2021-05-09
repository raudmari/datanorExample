package com.example.datanorExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DatanorExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatanorExampleApplication.class, args);
	}

	@Bean
	public RestTemplate restTempale(){
		return new RestTemplate();
	}
}
