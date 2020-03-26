package org.opentutorials.javatutorials.Inheritance.example1;


class Calculator{
	
	static double PI = 3.14; //static 의 경우 class에 속해 있는 변수가 되는것이고 인스턴스에서는 동일하게 사용 할 수 있다. 
	
	int left,right;
		
	public void setOperands (int left, int right) {
		this.right=right;
		this.left=left;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class Substraction extends Calculator{
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {	
	
	public static void main(String[] args) {
		
		Substraction c1 = new Substraction();
		c1.setOperands(20, 10);
		c1.sum();
		c1.avg();
		c1.substract();
		
		
		Calculator c2 = new Calculator();
		c2.setOperands(20, 40);
		c2.sum();

	}

}

