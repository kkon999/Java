package org.opentutorials.javatutorials.classninstance;

class Calculator2{
	
	static double PI = 3.14; //static 의 경우 class에 속해 있는 변수가 되는것이고 인스턴스에서 동일하게 사용 할 수 있다. 
	static int base = 0;
	
	int left,right;
		
	public void setOperands (int left, int right) {
		this.right=right;
		this.left=left;
	}
	public void sum() {
		System.out.println(this.left+this.right+base);
	}
	public void avg() {
		System.out.println((this.left + this.right+base)/2);
	}
}


public class CalculatorDemo2 {
	public static void main(String[] args) {
		
	System.out.println("base값이 0인 경우 ");
	Calculator2 c1 = new Calculator2();
	c1.setOperands(10,20);
	c1.sum();	
	
	
	Calculator2 c2 = new Calculator2();
	c2.setOperands(20,40);
	c2.sum();
	
	
	System.out.println("");
	System.out.println("base값을 10으로 변경 후 ");
	Calculator2.base = 10;
	
	
	
	c1.sum();
	c2.sum();
	
	
	}
	
	

}
