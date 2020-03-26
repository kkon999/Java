package org.opentutorials.javatutorials.Inheritance.overloading.example1;


class Calculator{
	int left , right;
	int third = 0;


public void setOprands (int left, int right) {
	System.out.println("setOprands(int left, int right)");
	this.left = left;
	this.right =  right;

}

public void setOprands(int left, int right, int third){		// overloding으로 인해 메소드의 이름이 같아도 매개변수가 다르면 동일하게 사용 가능하다
    this.setOprands(left, right);
	System.out.println("setOprands(int left, int right, int third)");
	this.third = third;
}

public void sum(){
	
   System.out.println(this.left+this.right+this.third);
	
}
  
public void avg(){
	
    System.out.println((this.left+this.right+this.third)/3);
}

}
public class CalculatorDemo {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		c1.setOprands(10, 20, 30);
		c1.sum();
		c1.avg();
	}
}
