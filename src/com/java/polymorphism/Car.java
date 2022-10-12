package com.java.polymorphism;

public class Car {
	String color;
	int door;
	
	void driver() {
		System.out.println("drive gogo!");
	}
	
	void stop() {
		System.out.println("stop");
	}
	
	//매개변수가 Car타입으로 정의
	//Car -> Car, FireEngine, Ambulance 매개변수로 사용 가능
	
	void doWork(Car c /*매개변수*/) { // 매개변수를 활용한 객체의 다형성
		//instanceof 연산자
		//객체의 타입을 확인한다.
		if(c /*참조변수*/ instanceof FireEngine /*클래스이름(알고싶은타입)*/ ) {
			FireEngine fe = (FireEngine)c;
			fe.water(); 
			}else if(c instanceof Ambulance) {
				Ambulance ab = (Ambulance)c;
				ab.siren();
			}
	}

	
}
