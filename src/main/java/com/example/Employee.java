package com.example;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {

	@Id
	@GeneratedValue
	@Column(name = "EMPLOYEE_ID")
	private Long id;

	private String firstName;
	private String lastName;
	private String role;

	Employee() {}
	
	Employee(String name, String role) {
		String[] nameParts = name.split(" ");
		this.firstName = nameParts[0];
		this.lastName = nameParts[1];
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee{" + id + " " + firstName + " " + lastName + " " + role + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee empl = (Employee) obj;
		return Objects.equals(this.id, empl.id) 
				&& Objects.equals(this.firstName, empl.firstName)
				&& Objects.equals(this.lastName, empl.lastName)
				&& Objects.equals(this.role, empl.role);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public void setName(String name) {
		String[] nameParts = name.split(" ");
		this.firstName = nameParts[0];
		this.lastName = nameParts[1];
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
