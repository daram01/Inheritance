package com.java.print;

//public -> ����������
public class Print {
	public int x;
	public int y;
	
	//���� �־�� �ϴµ� ���� �� ����
//	Print(){
//		super(); // �θ��� Object Ŭ������ ������ ȣ��
//	}
	
	public Print(int x,int y){ // ������ - iv �ʱ�ȭ
		this.x = x;
		this.y = y;
	} 
	
	public String getLocation() {
		return " x : " + x + " y : " + y;
	}

}
