package progenitor;

class Calculator{
	int left , right;
	
	public void setOprands(int left,int right) {
		this.left= left;
		this.right= right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
		
	}
	public String toString() { //toString�� overiding�Ͽ� ������ �� +������ ���� �޼ҵ忡 �ִ� �ν��Ͻ� c1�� �����Ѵ�.
		return "left : " + this.left+ " right : " + this.right;
	}
	
}
public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		System.out.println(c1);
	}

}
