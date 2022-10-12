package com.java.capsule;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(3.14);
		//t.hour = 48; // 0 ~ 23 시
		System.out.println(t.P1);
		
		t.setHour(23);
		System.out.print(t.getHour() + "시 ");
		
		t.setMinute(59);
		System.out.print(t.getMinute() + "분 ");
		
		t.setSecond(36);
		System.out.print(t.getSecond() + "초");
	}

}
