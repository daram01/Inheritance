package com.package2;

import com.package3.F; // 상속

public class B extends F {
	public int b;

	public B(int b) {
		super(10);
		this.b = b;
	}
	
	public void printB() {
		System.out.println(b);
		System.out.println(f);
		printF(); // 메서드 호출
	}
	
	
}
