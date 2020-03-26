package org.opentutorials.javatutorials.polymorphism;

class A1{
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
}

public class PolymorphismOverloadingDemo {
	public static void main(String[] args) {
		A1 o = new A1();
		o.a(1);
		o.a("문자");
	}
	

}
