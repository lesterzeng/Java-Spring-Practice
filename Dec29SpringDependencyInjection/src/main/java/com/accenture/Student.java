package com.accenture;

public class Student {
	private String name;
	private String address;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void displayStudentInfo() {
		System.out.println("Student name : "+name+ " Address : "+address+ " Age : "+age);
	}
	//Constructor Based Injection
	public Student(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}

	//Setter Base Injection
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	//Setter Base Injection
	public void setAddress(String address) {
		this.address = address;
	}
}
