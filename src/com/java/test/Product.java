package com.java.test;

public class Product {
	int price; // ����
	int bonusPoint; // ���ʽ�����Ʈ (�Ǹŵ� �ݾ׿� ���� 10%)
	
	//������
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}
