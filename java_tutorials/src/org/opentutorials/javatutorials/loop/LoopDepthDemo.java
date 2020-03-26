package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo {
	
	public static void main(String[] args) {
	
		for (int i = 0; i < 10; i++) {
			for (int j = 2; j < 10; j = j+2) {
				System.out.println(i +""+ j);
			}
			
		}
		
	}
}
