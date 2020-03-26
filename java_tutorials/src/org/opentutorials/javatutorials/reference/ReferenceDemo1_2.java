package org.opentutorials.javatutorials.reference;


	//A 클래스를 생성하여 새로운 id 인스턴스를 생성
class A{
	public int id;
	A(int id){
		this.id = id;
	}
}

public class ReferenceDemo1_2 {
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue : " + a);
	}
	
	
	public static void runReference() {
		A a = new A(1); // runValue와는 다르게 클래스 A를 생성하여 새로운 인스턴스 A(1)의 값은 메모리 공간에 저장 된다.그리고 변수 a는 인스턴스 A(1) 공간의 위치에 대한 주소를 저장
		A b = a;		// 변수 b도 마찬가지로 변수a가 가리키고 있는 인스턴스 공간의 주소를 저장
		b.id = 2;		// 클래스 A를 이용해서 만든 인스턴스 공간에 있는 id 값을 2로 변경
		System.out.println("runReference : " + a.id);	// 그러기에 변수 a도 id 를 가리키고 있기 때문에 값이 1이 아닌 2로 출력
	}
	
	public static void main(String[] args) {
		runValue();
		runReference();
	}
}