package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class AuthReqDTO {
	@NotBlank(message = "Email can't be blank")
	@Email(message = "Invalid emial format")
	private String email;
	@NotBlank(message = "Password is required")
	private String password;

}
