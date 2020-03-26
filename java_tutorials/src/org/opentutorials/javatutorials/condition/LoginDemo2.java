package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {
	public static void main(String[] args) {
		
		String id   = args[0];
		String pass = args[1];
		if(id.equals("A")) {
			if(pass.equals("1234")){
				System.out.println("로그인 되었습니다");
			}
			else {
				System.out.println("Password를 다시 확인 해주세요");
			}
		}
		else {
			System.out.println("ID를 다시 확인해주세요");
		}
	}

}
