package com.java.test;

public class Product {
	int price; // 가격
	int bonusPoint; // 보너스포인트 (판매된 금액에 대한 10%)
	
	//생성자
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}
