package com.javacho.book;

import com.package2.B;
import com.package3.E;
import com.package3.F;


public class AccessModifiy {

	public static void main(String[] args) {
		//접근제어자
		//private < default < protected < public
		//public : 모든 패키지 경로에서 사용 가능
		//protected : 같은 패키지 또는 상속 관계에 있는 다른 패키지에서 사용 가능
		//default : 같은 패키지에서 사용 가능
		//private : 클래스 내에서만 사용 가능
		
		//클래스 : public, default
		//변수 : public, protected, default, private
		//생성자 : public, protected, default, private
		//메소드 : public, protected, default, private
		//단 지역변수는 사용 불가
		
		//public한 경우에만 패키지와 상관없이 생성과 상속이 가능하다.
		//단, protected는 상속에 의해 다른패키지에서 사용 가능
		
		B b = new B(10);
		//C c = new C(20); // 생성자가 default 이기 때문에 error.
		//E e = new E(30); // 생성자가 private 이기 때문에 error.
		// e.print <- 접근이 안됨. private 하기 때문이다.
		//F f = new F(50); // 생성자가 protected 이기 때문에 error.

	}

}
