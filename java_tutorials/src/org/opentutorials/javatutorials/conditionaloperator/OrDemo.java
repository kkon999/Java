package org.opentutorials.javatutorials.conditionaloperator;

public class OrDemo {
	
	public static void main(String[] args) {
		
		String id = args[0];
		String pass = args[1];
		if(id.equals("A")||id.equals("B")||id.equals("C") && pass.equals("1234")) {
			System.out.println("로그인 되었습니다");
		}
		else
			System.out.println("ID 혹은 Pass를 다시 입력해주세요");
						
	}
}
