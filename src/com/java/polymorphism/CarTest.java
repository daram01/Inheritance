package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {
		//�Ϲ����� ��ä ���� ���
		//FireEngine fe = new FireEngine();
		//Ambulance ab = new Ambulance();
		
		//�������� ������ ��ä ����
		//�������� ����ȯ (������ �� �ִ� ����� ������ ���Ѵ�.)
//		Car car = null; // �θ𺯼��� �ʱ�ȭ
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null; // ������ ������ �ʱ�ȭ���� null��
//		
//		fe.water();
//		car = fe; // �ڵ�����ȯ Car = FireEngine Ÿ���� ��ġ���� �ʾƵ� ��Ӱ���� ������ (�������� ����ȯ)
//				  // �ּҰ��� �Ѱ������� FireEngine �� Car Ÿ������ �ٲ�鼭  Car�� ���ǵ� ������Ը� ������ �� �ִ�.
//		// car.water(); // ����
//		car.stop();
//		
//		fe2 = (FireEngine)car; // ���� ����ȯ
//		fe2.water();
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		Car car = new Car();
		
		car.doWork(fe);
		car.doWork(ab);
		
	}

}
