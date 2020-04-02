package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable{ // Comparable 인터페이스를 사용하여 정렬
	int serial; 
	String owner;
	Computer(int serial , String owner){
		this.serial = serial;
		this.owner = owner;
	}
	public int compareTo(Object o) { // Comparable에 속해있는 메소드
		//
		return this.serial - ((Computer)o).serial;
	}
	
	public String toString() {
		return serial+ " " + owner;
	}

}

public class CollectionDemo07 {
	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500,"egoing"));
		computers.add(new Computer(200,"leezche"));
		computers.add(new Computer(3233,"gravity"));
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}	
		//Collections 정렬과 데이터 작업에 사용되는 클래스이며 메소드는 static이므로 클래스 메소드이다
		//Collections 클래스가 가지고 있는 메소드 sort를 사용하여 인자로 상위 정의한 List를 전달하여 정렬
		Collections.sort(computers);
		System.out.println("\nafter");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
