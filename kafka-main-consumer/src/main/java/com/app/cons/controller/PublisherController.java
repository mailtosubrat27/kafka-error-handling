package com.app.cons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.cons.dto.MyDto;
import com.app.cons.publisher.KafkaPublisher;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PublisherController {

	@Autowired
    KafkaPublisher publisher;
	
	@GetMapping("/test")
	public String testApi() {
		return "Success..";
	}
	
    @PostMapping(value = "/publish")
    public void publish(@RequestBody MyDto dto) {
        log.info("Publishing the event {}", dto);
        publisher.publish(dto);
    }
}
