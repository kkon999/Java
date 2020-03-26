package org.opentutorials.javatutorials.method;

public class ReturnDemo1 {
	public static int one() {
		return 1;
		//return 2; // return 의 경우 위에 retun1 을 수행 후 main 메소드로 결과값을 전달하기 때문에 아래 2,3 은 실행 될 수 가 없다.
		//return 3; //
	}
	public static void main(String[] args) {
		System.out.println(one());
	}
}
