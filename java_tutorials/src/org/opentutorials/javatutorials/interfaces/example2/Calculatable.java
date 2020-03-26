package org.opentutorials.javatutorials.interfaces.example2;

	// 개발시 어떤 클래스,메소드,매개변수를 사용하는지에 대한  명세서 같은 역할을 한다.
	// 시스템을 제어하기 위한 조작장치로 보면 되겠다.
	// interface는 pulbic으로 정의해야 한다.

	
public interface Calculatable {
	
	public void setOprands(int first, int second , int third);
	public int sum();
	public int avg();
	
}
