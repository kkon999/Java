package org.opentutorials.javatutorials.polymorphism;


class A{
	public String x(){return "A.x";} 
}


class B extends A{
	public String x(){return "B.x";}
	public String y(){return "y";}
}

class B2 extends A{
	public String x() {return "B2.x";}
}

public class polymorphismDemo1 {
	
	public static void main(String[] args) {
		A obj = new B();	//obj의 데이터 타입은 B를 담고 있지만 실제로 클래스 A클래스의 데이터 타입을 따라간다.
		System.out.println(obj.x());	// 클래스 B에 있는 메소드 x가 클래스 A에 있는 메소드 x를 오버라이딩 하였기 때문에 클래스 B의 메소드 x가 실행된다.
		
		A obj2 = new B2();		
		System.out.println(obj2.x());	// 부모 클래스 A에 있는 x메소드에 대해서만 호출을 할 수 있다. 결과값은 오버라이딩 한 메소드 x를 호춣한다
		//obj.x();
		//obj.y();						// 클래스 A에는 메소드 y가 존재하지 않기 때문에 메소드y는 오류가 발생
		//System.out.println(obj.y());
	}
}
