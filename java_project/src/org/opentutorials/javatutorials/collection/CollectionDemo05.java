package org.opentutorials.javatutorials.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;


public class CollectionDemo05 {

	public static void main(String[] args) {
		// Map 인터페이스의 경우  key 값과 value 값을 사용하여 데이터를 호출한다.
		// 하기 <String,Integer>의 String 은 key , Integer는 value을 지칭한다.
		HashMap<String,Integer> a = new HashMap<String,Integer>();
		
		// Set,List 와 다르게 Map은 key,value로 설정된 값을 모두 선언해야 한다.
		// put 메소드를 사용하여 "one",1 을 선언한다.
		a.put("one" , 1);
		a.put("two" , 2);
		a.put("three" , 3);
		a.put("four" , 4);
		
		// Map 을 출력 할 떄는 get메소드를 사용하여 해당 key값인 String값을 호출해야 연결되어 있는 value1을 호출
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}
	static void iteratorUsingForEach(HashMap map) {
		// map인터페이스에 포함되어 있는 메소드 entrySet()을 사용
		// 데이터 타입이 Map.Entry을 사용하여  제네릭 <String,Integer>을 생성하여 map에 담겨있는 데이터를 담는다.
		// 데이터 타입이 Set인 인스턴스 entries에 담는다.
		// 그 이유는 map 인터페이스는 Iterator 인터페이스가 없기 떄문에 Set인터페이스를 생성하여 데이터를 복사 후 Iterator 진행
		// Map.Entry에는 메소드 getKey, getValue가 포함되어 있다, getKey = String, getValue = Integer
		Set<Map.Entry<String,Integer>> entries = map.entrySet();
		// entries에 담긴 데이터들이 entry에 대입되어 for문이 실행된다.
		for (Map.Entry<String, Integer> entry : entries) 
		{
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
	}
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String,Integer>> entries = map.entrySet();
		// Set 데이터 타입에 담긴 entries를 메소드 iterator에 대입 하기위해 i에 담는다
		Iterator<Map.Entry<String,Integer>> i = entries.iterator();
		// iterator 메소드 hasNext , next를 사용하요 while문으로 반복 실행
		while(i.hasNext()) 
		{
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
	}
 }
