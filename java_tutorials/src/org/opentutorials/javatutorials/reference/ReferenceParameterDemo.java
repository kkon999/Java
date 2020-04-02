package org.opentutorials.javatutorials.reference;

public class ReferenceParameterDemo {
	
	
	static void _value(int b) {
		b = 2;			// int b 에 2를 대입
	}
	
	public static void runValue() {
		int a = 1;		// int a 에 1을 대입
		_value(a);		// int b = a 와 같은 의미
		
		System.out.println("runValue : " + a);	// 메소드 _value에 변수 b 에 2를 대입해도 변수 a는 이미 1이라는 값을 가지고 있기에 출력값은 1이다.
	}
	
	
	static void _reference1(A b) {	// A b = a 와 같은 의미
		b = new A(2);	 // 새로운 변수b는 인스턴스 new A(2)의 값인 2를 참조
	}
	
	static void runReference1() {
		A a = new A(1);	 // 변수 a에 새로운 인스턴스 A(1)를  참조
		_reference1(a);	 
		
		System.out.println("runReference1 : " + a.id); // 메소드 _reference1에서 새로운 변수 b에 인스턴스 new A(2)를 생성하여 값을 참조
													   // 그러기에 변수 a와 b는 서로 다른 값을 참조 하고 있으므로 a = 1 , b = 2 를 참조 
	}
	
	
	static void _reference2(A b) { // A b = a 와 같은 의미
		b.id = 2;		 // b.id의 뜻은 변수 b와 a가 같은곳을 참조
	}
	
	static void runReference2() {
		A a = new A(1); // 변수 a에 새로운 인스턴스 A(1)를 참조
		_reference2(a);
		System.out.println("runReference2 : " + a.id); // 메소드 _reference2에서 변수 a와 b는 같은 인스턴스 장소를 참조 하고 있다 
													   // 그러기에 new A(1)이 실행 후 _reference 메소드가 실행 되면 b.id=2으로 2가 대입 되어
													   // a.id는 2를 참조
	}
	
	
	public static void main(String[] args) {
		runValue();
		runReference1();
		runReference2();
	}
}
	