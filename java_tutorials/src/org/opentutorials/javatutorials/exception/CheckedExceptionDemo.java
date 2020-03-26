package org.opentutorials.javatutorials.exception;

import java.io.*;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		//FileReader의 경우 try catch 문을 사용하여 꼭 예외를 사용 할 수 있게 설정해야한다. 그러지 않을시 오류발생
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader (new FileReader("out.txt"));
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String input = null;
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(input);
	}	
}