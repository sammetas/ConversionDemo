package com.conversion.ConversionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConversionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionDemoApplication.class, args);
	}


	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConversionDemoApplication.class);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}


