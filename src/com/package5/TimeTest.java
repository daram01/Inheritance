package com.package5;

import com.package4.Time;

public class TimeTest {

	public static void main(String[] args) {
	
		Time t = new Time();
		//t.hour = 10; //private : Ŭ���� �������� ��� ����
		//t.min = 10; //default : ���� ��Ű������ ��� ����
		//t.nanosec = 10; //protected : ���� ��Ű�� �Ǵ� ��� ���迡 �ִ� �ٸ� ��Ű������ ��� ����
		t.sec = 10; //public : ��� ��Ű�� ��ο��� ��� ����
		

	}

}
