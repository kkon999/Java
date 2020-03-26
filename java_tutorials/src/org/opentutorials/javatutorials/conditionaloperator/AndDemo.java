package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {

	public static void main(String[] args) {
		
		String id = args[0];
		String pass = args[1];
		
			if(id.equals("A")&&pass.equals("1234")) {
				
				System.out.println("로그인 되었습니다");
			}
			else {
				System.out.println("ID,Password를 다시 확인해주세요");
			}
	}
}
