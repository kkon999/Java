package org.opentutorials.javatutorials.Inheritance.example1;



class Dvision extends MultiplicationsCalculator{
	
	public void divsision() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		
		Dvision c1 = new Dvision();
		c1.setOperands(20, 10);
		c1.sum();
		c1.avg();
		c1.multiplication();
		c1.divsision();
	}
}
