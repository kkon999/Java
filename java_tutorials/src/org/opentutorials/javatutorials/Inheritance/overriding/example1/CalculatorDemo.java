package org.opentutorials.javatutorials.Inheritance.overriding.example1;

class Calculator{
	int left , right;
	
	public void setOprands(int left, int right) {
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

class Substraction extends Calculator{
	
	public void sum() {
		System.out.println("실행결과는 " + (this.left+this.right) + " 입니다.");
	}
	
	public void avg() { 	//부모 클래스와 자식 클래스의 함수형식이 같아야 호출 하여 사용 할 수 가 있다.
		super.avg();
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}

}

public class CalculatorDemo {
	
	public static void main(String[] args) {
		
		Substraction c1 = new Substraction();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		c1.substract();
	}

}
