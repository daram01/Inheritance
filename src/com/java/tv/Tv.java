package com.java.tv;
//import com.java.print.Print; // print ��ü�� ������ ����Ѵٴ� �� (�� �ڴ� Ŭ�����̸�)
//import com.java.print.Print3d;
//import com.java.print.*;
//ctrl + shift + o // �ڵ� import

import com.java.print.Print3d;

public class Tv {
	
//	Print print = new Print(10,20); // �ν��Ͻ� �������, ���԰���
	Print3d print = new Print3d(500, 600, 700);
	
	
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
	
}
