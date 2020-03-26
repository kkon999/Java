package org.opentutorials.javatutorials.jaccessmodifier.inner;

class A {
	
	public String y() {
		return "public void y()";
	}
	
	private String z() {
		return "public void z()";
	}
	
	public String x() {
		return z();
	}

}
public class AccessDemo1 {
	
	public static void main(String[] args) {
	
		A a = new A();
		
		System.out.println(a.y());
		//System.out.println(a.z());		// z 의 경우 private으로 정의되어 있어서 A클래스가 아닌 메인 클래스는 String z 메소드를 사용 할 수 없다.
		System.out.println(a.x());
}

}
