package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		
		String id = args[0]; // args[0] 는 입력 값을 받는곳이다.
		if(id.equals("A")) {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("사용자 아이디를 확인해주세요");
		}
	}
}
