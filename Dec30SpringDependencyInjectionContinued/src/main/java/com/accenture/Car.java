package com.accenture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.p1.Tyre;


@Component("carbean")
public class Car {

	@Autowired
	Tyre tyre;
	// Options are creating setter / constructor
	
	public Car(Tyre tyre) {
		this.tyre = tyre;
	}
	
	public void inf() {
		System.out.println("Tyre Obj" + tyre);
	}
}
