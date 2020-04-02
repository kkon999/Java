package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo03 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		
		System.out.println(A.containsAll(B));	// B에 있는 모든 데이터가 A에도 포함되는지 확인 , 즉 인스턴스B는 인스턴스A에 부분집합인지 확인 
		System.out.println(A.containsAll(C));	// C에 있는 모든 데이터가 A에도 포함되는지 확인 , 즉 인스턴스C는 인스턴스A에 부분집합인지 확인 
		
		
		
		//A.addAll(B); 	 	A와 B의 합집합
        //A.retainAll(B);	A와 B의 교집합
        //A.removeAll(B);   A와 B의 차집합
		
		Iterator hi = A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}
	
	
}
