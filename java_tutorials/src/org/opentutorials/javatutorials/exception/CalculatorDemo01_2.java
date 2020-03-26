package org.opentutorials.javatutorials.exception;

class Calculator_2{
	int left , right;
	
	public void setOprands(int left, int right) {
		this.left =	left;
		this.right	= right;
	}
	
	public void devide() {
		
		// throw를 통해 devide메소드를 호출하는 클래스에게 예외발생을 던진다.  
		if(right == 0) {
			throw new ArithmeticException("잘못된 계산식입니다.");
		}
		//try {	//예외의 발생이 예상되는 로직,즉 예외가 발생 했을 때 실행되는 로직
		//System.out.print("계산 결과는 ");
		//System.out.print(this.left/this.right);
		//System.out.println("입니다.");
		//}
		//catch(Exception e) {// e에는 오류의 정보를 담고 있는 객체를 담고 있어서 에러 발생시 e.getMessage의 메세지가 포함된다. , 예상되는 에러가 발생됬을시 실행되는 로직
		//	System.out.println("\n\ne.getMessage()\n" + e.getMessage());	//오류에 대한 기본적인 내요 출력
		//	System.out.println("\n\ne.toString()\n" + e.toString());		//오류애 대한 보다 자세한 예외 정보를 제공
		//	System.out.println("\n\ne.printStackTrace()");					//가장 자세한 오류정보 제공 오류 위치등등
		//	e.printStackTrace();
		//}
		//finally {
		//	System.out.println("Divide End");
		//}
	}	
}

public class CalculatorDemo01_2 {

	public static void main(String[] args) {
		Calculator_2 c1 = new Calculator_2();
		c1.setOprands(10,0);
		try {
		c1.devide();
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}