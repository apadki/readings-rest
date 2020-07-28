package org.mukta.readings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync

public class ReadingsRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingsRestServiceApplication.class, args);
	}

}
