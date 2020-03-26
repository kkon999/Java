package org.opentutorials.javatutorials.abstractclass.example3;


abstract class Calculator{
	int left , right;
	
	public void setOprands (int left, int right) {
	
		this.left = left;
		this.right = right;
	}
	
	public int _sum() {
		return this.right+this.left;
	}
	
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}

}

class CalculatorPlus extends Calculator{
	public void sum() {
		System.out.println("+sum_" + _sum());
	}
	public void avg() {
		System.out.println("+avg_" + (_sum()/2));
	}
}

class CalculatorMinus extends Calculator{
	public void sum() {
		System.out.println("-sum_" + _sum());
	}
	public void avg() {
		System.out.println("+avg_" + (_sum()/2));
	}
}

public class AbstractDemo {
	
	public static void main(String[] args) {
		CalculatorPlus c1 = new CalculatorPlus();
		c1.setOprands(10, 20);
		c1.run();
	
		CalculatorMinus c2 = new CalculatorMinus();
		c2.setOprands(20, 40);
		c2.run();
	}

}
