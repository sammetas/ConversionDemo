package com.conversion.ConversionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ConversionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionDemoApplication.class, args);
	}


	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConversionDemoApplication.class);
	}

	/*@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}*/
}


