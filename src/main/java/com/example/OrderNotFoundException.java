package com.example;

public class OrderNotFoundException extends RuntimeException {

	OrderNotFoundException(Long id) {
		super("Order with ID " + id + " not found!");
	}

}
