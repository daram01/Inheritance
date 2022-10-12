package com.java.test;

public class Buyer { 
	int money = 1000;
	int bonusPoint = 0;
	
	//메소드의 오버로딩 - 물건의 갯수가 많아지면 적절하지 않음
//	void buy(Tv t) {
//		System.out.println(t.price);
//	}
//	void buy(Computer c) {
//		System.out.println(c.price);
//	}
//	void buy(Audio a) {
//		System.out.println(a.price);
//	}
	
	void buy(Product p) { //부모타입으로 선언 // Product와의 포함관계 //Tv,Computer,Audio 의 객체를 받기 위하여.
		if(money < p.price) {
			System.out.println("금액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString() + "구매완료!");
	}
}

//Tv tv = new Tv(); // 가장 일반적인 방식
// 접근할 수 있는 멤버의 갯수 - 2개 (앞에 선언된 변수의 타입만큼 가능하기 때문에)
//Product p = new Tv(); // 부모타입으로 자식의 객체를 받는 건 문제가 없음. 상속관계이기 때문이다.
// 접근할 수 있는 멤버의 갯수 - 2개 (앞에 선언된 변수의 타입만큼 가능하기 때문에)


