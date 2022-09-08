package com.fmontalvoo.springboot.error.app.errrors;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String id) {
		super("Usuario con id: ".concat(id).concat(" no encontrado"));
	}

}
