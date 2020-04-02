package org.opentutorials.javatutorials.collection;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo05 {

	public static void main(String[] args) {
		
		HashSet<Integer> A = new HashSet<Integer>(); // HashSet은 Collection인터페이스를 구성하는 클래스
		A.add(1);
		A.add(2);
		A.add(3);
		
		Iterator hi = (Iterator) A.iterator(); 	  //iterator 인터페이스를 사용해서 Iterator 데이터 타입을 생성 후  인스턴스 hi에 담는다
		while(hi.hasNext()) {						  // hasNext 메소드는 사용하여 hi에 담긴 값이 있으면 true, 없으면 false 를 반환
			System.out.println(hi.next());			  // next 메소드는 hi에 담김 값 중 하나를 호출
		}
		
	}
	
}
