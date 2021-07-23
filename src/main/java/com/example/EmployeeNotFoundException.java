package com.example;

class EmployeeNotFoundException extends RuntimeException {

	EmployeeNotFoundException(Long id) {
		super("Employee with ID " + id + " not found!");
	}
}
