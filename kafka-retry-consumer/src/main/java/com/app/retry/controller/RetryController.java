package com.app.retry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetryController {
	@GetMapping("/retry")
	public String retryTest() {
		return "Success..";
	}

}
