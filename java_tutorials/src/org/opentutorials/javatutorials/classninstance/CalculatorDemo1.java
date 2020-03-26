package org.opentutorials.javatutorials.classninstance;


class Calculator{
	
	static double PI = 3.14; //static 의 경우 class에 속해 있는 변수가 되는것이고 인스턴스에서 동일하게 사용 할 수 있다. 
	
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



public class CalculatorDemo1 {	
	
	public static void main(String[] args) {
			Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
				
		Calculator c2 = new Calculator();
		c2.setOperands(20, 40);
		c2.sum();
		
		
		System.out.println(c1.PI);
		System.out.println(c2.PI);

	}

}
