package com.package5;

import com.package4.Time;

public class TimeChild extends Time { // ���
	
	//private < default < protected < public
	//public : ��� ��Ű�� ��ο��� ��� ����
	//protected : ���� ��Ű�� �Ǵ� ��� ���迡 �ִ� �ٸ� ��Ű������ ��� ����
	//default : ���� ��Ű������ ��� ����
	//private : Ŭ���� �������� ��� ����
	
	void printAll() {
		//System.out.println(hour); //private : Ŭ���� �������� ��� ����
		//System.out.println(nanosec); //default : ���� ��Ű������ ��� ����
		System.out.println(min); //protected : ���� ��Ű�� �Ǵ� ��� ���迡 �ִ� �ٸ� ��Ű������ ��� ����
		System.out.println(sec); //public : ��� ��Ű�� ��ο��� ��� ����
	}

}
