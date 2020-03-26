package org.opentutorials.javatutorials.abstractclass.example2;

	abstract class A{
	
	public abstract int b();
	
	public void d() {
		System.out.println("Hello world");
	}
}
	class B extends A{

	public int b(){
		return (2);
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		
		B obj = new B();
		obj.b();
	}
}