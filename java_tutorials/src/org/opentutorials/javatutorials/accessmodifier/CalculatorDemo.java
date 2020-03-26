package org.opentutorials.javatutorials.accessmodifier;

class Calculator{
	private int left, right;	
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;		
	}
	
	private int _sum() {
		return this.left + this.right;
	}
	public void sumDecoPlus() {
		System.out.println("++++"+_sum()+"++++");
	}
	public void sumDecoMinus() {
		System.out.println("----"+_sum()+"----");
	}
}


public class CalculatorDemo {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		c1.sumDecoPlus();
		c1.sumDecoMinus();
	//	c1.left = 100;	// 사용자가 의도하지 않은 방법으로 내부적이 메소드를 변경하여 클래스의 상태 변경을 방지하기 위해 메소드 접근자를 private로 변경함
	}
}