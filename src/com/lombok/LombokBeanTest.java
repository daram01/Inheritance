package com.lombok;

public class LombokBeanTest {

	public static void main(String[] args) {
		LombokTest lb = new LombokTest();
		
		lb.setName("ȫ�浿");
		System.out.println(lb.getName());
		
		lb.setAge(20);
		System.out.println(lb.getAge());
		

	}


}
