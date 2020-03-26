package org.opentutorials.javatutorials.exception;

import java.io.*;


class B {
	void run() throws FileNotFoundException,IOException{
		BufferedReader bReader = null;
		bReader = new BufferedReader (new FileReader("out.txt"));
		
		String input = null;
		input = bReader.readLine();
		System.out.println(input);
    }
}

class C {
	void run()throws FileNotFoundException,IOException{ 	//클래스 C의 run 메소드가 클래스 B의 run메소드를 사용중이다.
		
		B b = new B();	//클래스 B를 인스턴스화 함
		b.run();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		
		try {
			c.run();
		}
		catch (FileNotFoundException e) {
			System.out.println("out.txt 파일이 필요합니다. FileNotFoundException");
		}		
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

// B -> C -> ThrowExceptionDemo -> 일반사용자 
