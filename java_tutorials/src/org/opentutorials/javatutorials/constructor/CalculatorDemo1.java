package org.opentutorials.javatutorials.constructor;


class Calculator{
	
	int right,left;
	
	public Calculator(int left , int right) { // 생성자,constructor 클래스와 같은 명의 메소드를 정의 해서 가장 먼저 실행되는 작업으로 설정
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
	System.out.println(this.left+this.right);
	}
	
	public void avg() {
	System.out.println((this.left+this.right)/2);	
	}
}


public class CalculatorDemo1 {
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(10,20); // 여기서 new Calculator는 클래스가 아니라 인스턴스의 생성자를 가리킨다
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20,40);
		c2.sum();
		c2.avg();
		
	
	}

}
