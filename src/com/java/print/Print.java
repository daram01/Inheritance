package com.java.print;

//public -> 접근제어자
public class Print {
	public int x;
	public int y;
	
	//원래 있어야 하는데 생략 된 것임
//	Print(){
//		super(); // 부모인 Object 클래스의 생성자 호출
//	}
	
	public Print(int x,int y){ // 생성자 - iv 초기화
		this.x = x;
		this.y = y;
	} 
	
	public String getLocation() {
		return " x : " + x + " y : " + y;
	}

}
