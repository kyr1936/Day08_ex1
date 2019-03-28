package com.yr.car;

public class Car {
	
	Engine engine;
	Wheel[] wheels;    // wheel의 개수대로
	String color;
	
	public void info(String color) {
		System.out.println(color);
		System.out.println(this.color);
		info2();
	}
	public void info2() {
		System.out.println("car!!!!!!!!!!!");
	}
	
	
	
}
