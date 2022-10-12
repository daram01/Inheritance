package com.java.tv;
//import com.java.print.Print; // print 객체를 가져다 사용한다는 뜻 (맨 뒤는 클래스이름)
//import com.java.print.Print3d;
//import com.java.print.*;
//ctrl + shift + o // 자동 import

import com.java.print.Print3d;

public class Tv {
	
//	Print print = new Print(10,20); // 인스턴스 멤버변수, 포함관계
	Print3d print = new Print3d(500, 600, 700);
	
	
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
	
}
