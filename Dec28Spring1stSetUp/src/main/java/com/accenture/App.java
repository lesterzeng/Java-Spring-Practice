package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("!------------------!");
		Airtel obj1 = context.getBean("airtel", Airtel.class);
		
		
		Vodaphone obj2 = context.getBean("vodaphone", Vodaphone.class);
		obj1.test();
		System.out.println("***");
		obj2.test();

	}
}
