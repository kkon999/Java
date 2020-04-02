package org.opentutorials.javatutorials.reference;


public class ReferenceDemo1 {
	
	public static void runValue() {
		
		int a = 1;
		int b = a; 	//b에 a의 값을 대입함
		b = 2;		//b 값을 2로 변경
		System.out.println("runValue : " + a); // b값을 변경 해도 a의 값을 대입 한 것 이기 때문에 a의 값은 변하지 않는다.		
	}
	
	public static void main(String[] args) {
		runValue();
		
	}
}
