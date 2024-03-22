package com.app.cons.dto;

import com.app.cons.enums.EventType;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class MyDto {
//	@NotNull(message = "Please provide a valid eventTYpe.")
	private EventType eventType;

//	@NotNull(message = "Please provide a valid message.")
	private String message;
}
