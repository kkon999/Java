package org.opentutorials.javatutorials.exception;

class Calculator02{
	int left , right;
	public void setOprands(int left, int right) {
		// setOprands 메소드가 실행될 때 right 값이 0 이면 인되는 예외 설정
		//if (right == 0) {
		//	throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다.");
		//}
			
		this.left =	left;
		this.right	= right;
	}
	
	public void devide() {
		// devide 메소드가 실행될 때 right 값이 0이면 안된다는 예외를 설정
		if(right ==0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		//오류가 발생했습니다 :/ by zero
		try {	//예외의 발생이 예상되는 로직,즉 예외가 발생 했을 때 실행되는 로직
		System.out.print("계산 결과는 ");
		System.out.print(this.left/this.right);
		System.out.print("입니다.");
		}
		catch(Exception e) {// e에는 오류의 정보를 담고 있는 객체를 담고 있어서 에러 발생시 e.getMessage의 메세지가 포함된다. , 예상되는 에러가 발생됬을시 실행되는 로직
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());	//오류에 대한 기본적인 내요 출력
			System.out.println("\n\ne.toString()\n" + e.toString());		//오류애 대한 보다 자세한 예외 정보를 제공
			System.out.println("\n\ne.printStackTrace()");					//가장 자세한 오류정보 제공 오류 위치등등
			e.printStackTrace();
		}
		System.out.println("Divide End");
	}
}

public class CalculatorDemo02 {
	public static void main(String[] args) {
		Calculator02 c1 = new Calculator02();
		c1.setOprands(10, 0);
		
		try {	
		c1.devide();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
