package com.package5;

import com.package4.Time;

public class TimeChild extends Time { // 상속
	
	//private < default < protected < public
	//public : 모든 패키지 경로에서 사용 가능
	//protected : 같은 패키지 또는 상속 관계에 있는 다른 패키지에서 사용 가능
	//default : 같은 패키지에서 사용 가능
	//private : 클래스 내에서만 사용 가능
	
	void printAll() {
		//System.out.println(hour); //private : 클래스 내에서만 사용 가능
		//System.out.println(nanosec); //default : 같은 패키지에서 사용 가능
		System.out.println(min); //protected : 같은 패키지 또는 상속 관계에 있는 다른 패키지에서 사용 가능
		System.out.println(sec); //public : 모든 패키지 경로에서 사용 가능
	}

}
