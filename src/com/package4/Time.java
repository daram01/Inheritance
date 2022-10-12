package com.package4;

public class Time {
	
	//private < default < protected < public
	//public : 모든 패키지 경로에서 사용 가능
	//protected : 같은 패키지 또는 상속 관계에 있는 다른 패키지에서 사용 가능
	//default : 같은 패키지에서 사용 가능
	//private : 클래스 내에서만 사용 가능
	
	
	private int hour;
	int nanosec;
	protected int min;
	public int sec;
	
	

}
