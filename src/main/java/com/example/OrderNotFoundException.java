package com.example;

public class OrderNotFoundException extends RuntimeException {

	OrderNotFoundException(Long id) {
		super("Employee with ID " + id + " not found!");
	}

}
