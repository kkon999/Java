package org.opentutorials.javatutorials.classninstance;


class Calculator3{
	
	public static void sum(int left,int right) { // static을 사용하게 되면 sum은 Class 의 메소드가 되는것을 의미한다. 그리고 그 인자값으로 left,right를 선언
		System.out.println(left+right);
	}
	public static void avg(int left,int right) {
		System.out.println((left + right)/2);
	}
	
	
}
public class CalculatorDemo3 {
	
	public static void main(String[] args) {
		
		Calculator3.sum(10,20);
		Calculator3.avg(10,20);
		
		Calculator3.sum(20,40);
		Calculator3.avg(20,40);
	}

}

