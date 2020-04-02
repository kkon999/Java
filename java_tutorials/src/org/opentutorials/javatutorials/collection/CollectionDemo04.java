package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo04 {
	
	public static void main(String[] args) {
	
	ArrayList<Integer> A = new ArrayList<Integer>();  // ArrayList는 중복을 허용하며 순서대로 저장
	A.add(1);
	A.add(2);
	A.add(2);
	A.add(2);
	A.add(2);
	A.add(3);
	
	Iterator ai = (Iterator) A.iterator();			 
	while(ai.hasNext()) 
	{
		System.out.println(ai.next());
	}
 	
  }
}
