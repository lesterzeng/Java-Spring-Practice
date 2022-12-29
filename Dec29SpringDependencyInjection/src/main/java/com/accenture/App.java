package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Without using beans.xml. Instead, use BeanConfig class
		ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfig.class);

		System.out.println("!------------------!");
		
//		Typical way of inputing directly by developer
//		Student student = new Student();
//		student.name="James";
//		student.displayStudentInfo();
		
		
		//Constructor Based Injection
		Student student = context.getBean("student", Student.class);
		System.out.println(student+" from App");
		student.displayStudentInfo();
		
		Family family = context.getBean("family", Family.class);
		System.out.println(family + " from App");
		family.displayFamilyInfo();
		
		Address address = context.getBean("address", Address.class);
		System.out.println(address);
		
		Address add1 = new Address();
		Address add2 = new Address();
		Address add3 = new Address();
		System.out.println(add1);
		System.out.println(add2);
		System.out.println(add3);
		
//		Employee employee = context.getBean("employee", Employee.class);
//		System.out.println(employee + " from App");
//		employee.displayEmployeeInfo();
		
		// Injection Based Injection
//		Student st = new Student("Eugene", "Singapore");
		
		
		
	}
}
