package com.package5;

import com.package4.Time;

public class TimeTest {

	public static void main(String[] args) {
	
		Time t = new Time();
		//t.hour = 10; //private : 클래스 내에서만 사용 가능
		//t.min = 10; //default : 같은 패키지에서 사용 가능
		//t.nanosec = 10; //protected : 같은 패키지 또는 상속 관계에 있는 다른 패키지에서 사용 가능
		t.sec = 10; //public : 모든 패키지 경로에서 사용 가능
		

	}

}
