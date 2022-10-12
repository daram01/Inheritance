package com.java.capsule;

public class Time {

	// 상속 : extends
	// 다형성 : 오버로딩, 오버라이딩, 상속을 활용
	// 캡슐화(데이터보호) : 접근제어자(private)

	private int hour; // 클래스 내에서만 사용 가능
	private int minute;
	private int second;
	final double P1; //final을 붙이면 상수이고, 이름은 대문자로 하기
					 //생성자를 통한 초기화를 해야함.
	
	public Time(double p1) { //생성자를 통한 초기화
		super();
		P1 = p1;
	}
	
	
	
	// getter / setter
	
	public int getHour() { // 읽어오는 것
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) { 
			System.out.println("유효하지 않은 값 입니다.");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("유효하지 않은 값 입니다.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			System.out.println("유효하지 않은 값 입니다.");
			return;
		}
		this.second = second;
	}
	
	
	
}
