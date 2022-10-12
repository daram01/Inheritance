package com.package3;

public class D {
	C c = new C(10);
	// E e = new E(20);
	// 생성자를 private 로 바꾸면 같은 클래스여도 error가 난다.
	F f = new F(30);
	
	void printD() {
		System.out.println(c.c);
		f.printF();
		f.f = 30;
	}

	

}
