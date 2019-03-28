package com.yr.car;

public class CarFactory {
	
	public void makeCar() {
		EngineAdd en = new EngineAdd();
		WheelAdd wa = new WheelAdd();
		CarView cv = new CarView();
		ColorPaint cp = new ColorPaint();
		
		Car car = new Car();   // 차 1대
		car = en.setEngine(car);	//엔진 장착된  return car를 받음   = en.setEngine(car);
		car = wa.setWheel(car);
		
		cp.setColor(car);
		//cv.view(car);	
		car.info("Blue");
		Car car2 = new Car();
		car2.color="Red";
		car2.info("green");
		
	}
}
