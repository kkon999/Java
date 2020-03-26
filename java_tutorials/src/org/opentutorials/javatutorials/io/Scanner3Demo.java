package org.opentutorials.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {
	
	public static void main(String[] args) {
		try {
			File file = new File ("out.txt");
			Scanner sc = new Scanner(file); // 파일을 불러 올 때 사용하는 명령어
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1);
			}
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
