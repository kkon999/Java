package org.opentutorials.javatutorials.finals;

class Calculator{
	static final double PI = 3.14;
	int left, right;

	public void setOprands(int left,int right) {
		this.left = left;
		this.right = right;
		//Calculator.PI = 6;			// PI 의 경우 fianl로 상속/변경을 금지하는 규제이기에 6으로 변경 하려고 할 시 금지된다.
	}
	public void sum() {
		System.out.println(this.left+this.right+PI);
	}
	
}


public class CalculatorDemo1 {
	public static void main(String[] args) {
		
	Calculator c1 = new Calculator();
	c1.setOprands(10,20);
	c1.sum();
}
}