package com.app.retry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaRetryConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaRetryConsumerApplication.class, args);
	}

}
