package com.accenture;

public class Employee {
	private String name;
	private String address;
	
//	public void displayEmployeeInfo() {
//		System.out.println("Name of employee: " + name + "Address : " + address.getLocation());
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
