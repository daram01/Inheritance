package com.javacho.book;

import com.package2.B;
import com.package3.E;
import com.package3.F;


public class AccessModifiy {

	public static void main(String[] args) {
		//����������
		//private < default < protected < public
		//public : ��� ��Ű�� ��ο��� ��� ����
		//protected : ���� ��Ű�� �Ǵ� ��� ���迡 �ִ� �ٸ� ��Ű������ ��� ����
		//default : ���� ��Ű������ ��� ����
		//private : Ŭ���� �������� ��� ����
		
		//Ŭ���� : public, default
		//���� : public, protected, default, private
		//������ : public, protected, default, private
		//�޼ҵ� : public, protected, default, private
		//�� ���������� ��� �Ұ�
		
		//public�� ��쿡�� ��Ű���� ������� ������ ����� �����ϴ�.
		//��, protected�� ��ӿ� ���� �ٸ���Ű������ ��� ����
		
		B b = new B(10);
		//C c = new C(20); // �����ڰ� default �̱� ������ error.
		//E e = new E(30); // �����ڰ� private �̱� ������ error.
		// e.print <- ������ �ȵ�. private �ϱ� �����̴�.
		//F f = new F(50); // �����ڰ� protected �̱� ������ error.

	}

}
