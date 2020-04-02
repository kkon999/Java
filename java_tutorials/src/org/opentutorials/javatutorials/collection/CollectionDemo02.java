package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo02 {
	public static void main(String[] args) {
		
		// ArrayList의 경우 중복을 허용하며 순서대로 저장한다
		ArrayList<String> al = new ArrayList<String>();	// ArrayList 생성 , 데이터 타입은 String
		al.add("one");	// ArrayList 메소드인 add를 사용해서 문자"one" 선언
		al.add("two");
		al.add("two");
		al.add("three");
		al.add("three");
		al.add("four");
		al.add("five");
		System.out.println("Array");
		
		Iterator ai = al.iterator(); // Collection 인터페이스에 포함되는 Iterator를 통해 for문과 같은 기능 수행
		while(ai.hasNext())			 // hasNext 기능을 통해 반복 할 데이터가 있는지 확인 후 있으면 true, 없으면 false를 리턴
		{
			System.out.println(ai.next());	// next 기능을 통해 true라고 하면 next가 리턴 할 데이터가 존재한다는 것을 의미
		}
		
		
		// HashSet의 경우 중복을 허용하지 않으며 순서대로 저장하지 않는다
		HashSet<String> hs = new HashSet<String>(); // HashSet 생성 , 데이터 타입은 String
		hs.add("one");	// Hashset 메소드인 add를 사용해서 문자"one" 선언
		hs.add("two");
		hs.add("two");
		hs.add("three");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		System.out.println("\nHashSet");
		
		Iterator hi = hs.iterator(); // Collection 인터페이스에 포함되는 Iterator를 통해 for문과 같은 기능 수행
		
		while(hi.hasNext())			 // hasNext 기능을 통해 반복 할 데이터가 있는지 확인 후 있으면 true, 없으면 false를 리턴
		{
			System.out.println(hi.next());	// next 기능을 통해 true라고 하면 next가 리턴 할 데이터가 존재한다는 것을 의미
		}
		
	}
	
}
