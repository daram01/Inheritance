package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {
		//일반적인 객채 생성 방식
		//FireEngine fe = new FireEngine();
		//Ambulance ab = new Ambulance();
		
		//다형성을 적용한 객채 생성
		//참조형의 형변환 (참조할 수 있는 멤버의 갯수가 변한다.)
//		Car car = null; // 부모변수를 초기화
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null; // 참조형 변수라서 초기화값을 null로
//		
//		fe.water();
//		car = fe; // 자동형변환 Car = FireEngine 타입이 일치하지 않아도 상속관계라서 가능함 (참조형의 형변환)
//				  // 주소값은 넘겨주지만 FireEngine 가 Car 타입으로 바뀌면서  Car에 정의된 멤버에게만 접근할 수 있다.
//		// car.water(); // 오류
//		car.stop();
//		
//		fe2 = (FireEngine)car; // 강제 형변환
//		fe2.water();
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		Car car = new Car();
		
		car.doWork(fe);
		car.doWork(ab);
		
	}

}
