package com.parkingmanager.parkingmanagerweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
public class ParkingmanagerwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingmanagerwebApplication.class, args);
	}

}
