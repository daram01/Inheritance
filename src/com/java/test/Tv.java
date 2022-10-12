package com.java.test;

public class Tv extends Product {
	Tv(){
		super(100);
	}

	@Override // 
	public String toString() { //toString -> 그 객체를 설명해주는 문자열을 리턴
		return "Tv ";
	}
	
	
}
