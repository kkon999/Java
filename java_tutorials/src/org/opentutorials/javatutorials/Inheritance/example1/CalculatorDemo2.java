package org.opentutorials.javatutorials.Inheritance.example1;



class MultiplicationsCalculator extends Calculator{
	
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {
	
	public static void main(String[] args) {
		
		MultiplicationsCalculator c1 = new MultiplicationsCalculator();
		c1.setOperands(20,30);
		c1.sum();
		c1.avg();
		c1.multiplication();
	}

}
