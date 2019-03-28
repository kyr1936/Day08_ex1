package com.yr.car;

public class WheelAdd {

		public Car setWheel(Car car) { //바퀴 장착할  car 필요
			Wheel[] wheels = new Wheel[4];   // 바퀴 4개 필요
			for(int i=0; i<wheels.length;i++) {
				Wheel w = new Wheel();
				w.color="black";
				w.size=32;
				w.use="Snow";
				
				wheels[i] = w;	// 바퀴 1개 생산
			}
			
			car.wheels=wheels;		// 차에 바퀴 장착
			return car;
		} 
}
