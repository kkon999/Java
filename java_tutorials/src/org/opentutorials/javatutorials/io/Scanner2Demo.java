package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) { // 입력값이 생기기 전까지 실행을 유보시키는 역할을 한다.
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
	}

}
