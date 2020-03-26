package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	
	public static String numbering(int init, int limit) {
		int i = init;
		// 만들어지는 숫자들을 output 이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
		String out = "";
		while(i < limit) {
		//숫자를 화면에 출력하는 대신 변수 output에 담았다.
			out += i;
			i++;
		}
		
		return out;
	}
	public static void main(String[] args) {
		
		String member = numbering(1,5); // numbering 이 리턴한 값이 변수 member에 담긴다.
		
		System.out.println(member); // 변수 member 에 대한 값을 화면에 출력한다.
			
	}
}

