package com.app.customException;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String mgs) {
		super(mgs);
	}

}
