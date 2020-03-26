package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner1Demo {
	
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //사용자가 입력하는 값
		int i = sc.nextInt(); // 입력값을 넣는 부분을 선언 하였기 때문에 숫자를 넣어야 한다.
		System.out.println(i*1000);
		sc.close();
}
}
