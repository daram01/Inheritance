package com.java.test;

public class Buyer { 
	int money = 1000;
	int bonusPoint = 0;
	
	//�޼ҵ��� �����ε� - ������ ������ �������� �������� ����
//	void buy(Tv t) {
//		System.out.println(t.price);
//	}
//	void buy(Computer c) {
//		System.out.println(c.price);
//	}
//	void buy(Audio a) {
//		System.out.println(a.price);
//	}
	
	void buy(Product p) { //�θ�Ÿ������ ���� // Product���� ���԰��� //Tv,Computer,Audio �� ��ü�� �ޱ� ���Ͽ�.
		if(money < p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString() + "���ſϷ�!");
	}
}

//Tv tv = new Tv(); // ���� �Ϲ����� ���
// ������ �� �ִ� ����� ���� - 2�� (�տ� ����� ������ Ÿ�Ը�ŭ �����ϱ� ������)
//Product p = new Tv(); // �θ�Ÿ������ �ڽ��� ��ü�� �޴� �� ������ ����. ��Ӱ����̱� �����̴�.
// ������ �� �ִ� ����� ���� - 2�� (�տ� ����� ������ Ÿ�Ը�ŭ �����ϱ� ������)


