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
	public String toString() { //toString을 overiding하여 재정의 후 +연산을 메인 메소드에 있는 인스턴스 c1에 전달한다.
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
