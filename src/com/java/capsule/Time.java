package com.java.capsule;

public class Time {

	// ��� : extends
	// ������ : �����ε�, �������̵�, ����� Ȱ��
	// ĸ��ȭ(�����ͺ�ȣ) : ����������(private)

	private int hour; // Ŭ���� �������� ��� ����
	private int minute;
	private int second;
	final double P1; //final�� ���̸� ����̰�, �̸��� �빮�ڷ� �ϱ�
					 //�����ڸ� ���� �ʱ�ȭ�� �ؾ���.
	
	public Time(double p1) { //�����ڸ� ���� �ʱ�ȭ
		super();
		P1 = p1;
	}
	
	
	
	// getter / setter
	
	public int getHour() { // �о���� ��
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) { 
			System.out.println("��ȿ���� ���� �� �Դϴ�.");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("��ȿ���� ���� �� �Դϴ�.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			System.out.println("��ȿ���� ���� �� �Դϴ�.");
			return;
		}
		this.second = second;
	}
	
	
	
}
