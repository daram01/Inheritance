package com.java.print;

public class Print3d extends Print {
	public int z;
	
	// 상속에서의 생성자의 특징
	// 1. 부모생성자를 호출해야한다.
	// 2. 호출시에 super()메소드를 사용한다.
	// 3. 기본 생성자인 경우 부모생성자의 기본생성자를 호출한다.
	// 4. 생성자는 상속되지 않는다.(멤버변수와 메소드만 상속되어진다.)
	
//	Print3d(){
//		super(10, 20); // 부모 클래스인 Print() 생성자 호출
//		this.z = 30;
//	}
	
//	public Print3d(){
//		super(20,30); // Print(int x, int y)
//		this.z = 40;
//	}
	
	public Print3d(int x, int y, int z){ // 부모의 경우 자식을 통해 x,y의 값을 받아온다.
		super(x, y); // Print(int x, int y)
//		this.x = 100; // 부모의 x
//		this.y = 300; // 부모의 y
		this.z = z;
	}
	
	// 일부러 부모의 기능과 똑같은 이름에 기능을 추가
	// 오버라이딩(메서드의 재정의)
	// 오버라이딩의 특징 
	// 1. 상속구조에서 사용된다.
	// 2. 부모 메서드의 선언과 동일해야 한다.(리턴타입포함)
	// 3. 매개변수도 같아야 한다.
	// 4. 단, 실행문은 재정의 한다.
	// 5. 부모의 메서드를 사용할 때는  super라는 키워드를 사용한다.
	public String getLocaltion() {
		return super.getLocation() + " z : " + z;
	}

}
