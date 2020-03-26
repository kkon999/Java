package org.opentutorials.javatutorials.polymorphism;


interface I{}

class C implements I{}

public class polymorphismDemo2 {

	public static void main(String[] args) {
		I obj = new C();	// 클래스 C가 인터페이스 I를 구현하고 있기 때문에 인스턴스 obj에 담긴다
	}
}
