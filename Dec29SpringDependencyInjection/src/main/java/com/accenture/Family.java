package com.accenture;

public class Family {
	public Family(int number, String father, String mother) {
		super();
		this.number = number;
		this.father = father;
		this.mother = mother;
	}
	private int number;
	private String father;
	private String mother;
	
	public void displayFamilyInfo() {
		System.out.println("Number of family members: " + number + " Name of father: " + father + " Name of mother: "+mother);
	}

	@Override
	public String toString() {
		return "Family [number=" + number + ", father=" + father + ", mother=" + mother + "]";
	}
}
