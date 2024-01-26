package com.mbalem.demodeliveryapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.mbalem.demodeliveryapi")
public class DemoDeliveryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDeliveryApiApplication.class, args);
	}

}
