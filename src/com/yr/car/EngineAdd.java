package com.yr.car;

public class EngineAdd {
	
	public Car setEngine(Car car) {	// setEngine 을 할  car 필요
		Engine engine = new Engine(); 
		engine.hp=100;
		engine.cc=1000;
		engine.fuel="gas";
		car.engine = engine;	// car에 engine을 넣어줌
		return car;		//엔진 장착 후 차 return
	}
}
