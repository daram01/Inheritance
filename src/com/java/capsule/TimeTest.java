package com.java.capsule;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(3.14);
		//t.hour = 48; // 0 ~ 23 ��
		System.out.println(t.P1);
		
		t.setHour(23);
		System.out.print(t.getHour() + "�� ");
		
		t.setMinute(59);
		System.out.print(t.getMinute() + "�� ");
		
		t.setSecond(36);
		System.out.print(t.getSecond() + "��");
	}

}
