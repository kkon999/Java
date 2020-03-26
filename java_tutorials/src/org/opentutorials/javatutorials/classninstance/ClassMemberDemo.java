package org.opentutorials.javatutorials.classninstance;


class C1{

	static int static_variable = 1;  // static을 사용하여 클래스 변수 생성
	int instance_variable = 2;		 // 인스턴스 변수 생성
	
	
	static void static_static() { 				//클래스 메소드를 사용해서 클래스 변수 접근
		System.out.println(static_variable);
	}
	static void satic_instance() {				//클래스 매소드를 사용해서 인스턴스 변수를 접근
	//	System.out.println(instance_variable);
	}
	void instance_static(){						//인스턴스 메소드를 사용해서 클래스 변수 접근
		System.out.println(static_variable);
	}
	void instance_instace() {					//인스턴스 메소드를 사용해서 인스턴스 변수 접근
		System.out.println(instance_variable);
	}
}


public class ClassMemberDemo {
	
	public static void main(String[] args) {
		
		C1 c = new C1();
		
		c.static_static();
		// 인스턴스를 이용해서 정적 메소드 접근 가능
		// 인스턴스 메소드가 클래스 변수에 접근 가능
		
		//c.static_instance();
		// 인스턴스를 이용해서 정적 메소드 접근 가능
		// 정적 메소드가 인스턴스 변수에 접근 불가능

		c.instance_static();
		// 인스턴스를 이용해서 인스턴스 메소드 접근 가능
		// 인스턴스 메소드가 클래스 변수에 접근 가능
		
		c.instance_instace();
		// 인스턴스를 이용해서 인스턴스 메소드 접근 가능
		// 인스턴스 메소드가 인스던스 변수에 접근 가능
		
		C1.static_static();
		// 클래스를 이용하여 정적 메소드 접근 가능
		// 클래스 메소드가 클래스 변수에 접근가능
		
		//C1.static_instance();
		// 클래스를 이용해서 정적 메소드 접근 가능
		// 클래스 메소드가 인스턴스 변수 접근 불가능
		
		//C1.instance_static();
		// 클래스를 이용해서 인스턴스 메소드 접근 불가능
		
		//C1.instance_instace();
		// 클래스를 이용해서 인스턴스 메소드 접근 불가능
		
	}



}
