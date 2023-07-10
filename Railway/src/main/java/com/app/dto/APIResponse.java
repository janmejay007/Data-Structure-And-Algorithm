package com.app.dto;

import java.time.LocalDateTime;

public class APIResponse {
	
	private String mesg;
	private LocalDateTime date;
	public APIResponse(String mesg) {
		super();
		this.mesg = mesg;
		this.date = LocalDateTime.now();
	}
	
	

}
