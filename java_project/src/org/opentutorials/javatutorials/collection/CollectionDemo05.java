package org.opentutorials.javatutorials.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;


public class CollectionDemo05 {

	public static void main(String[] args) {
		// Map �������̽��� ���  key ���� value ���� ����Ͽ� �����͸� ȣ���Ѵ�.
		// �ϱ� <String,Integer>�� String �� key , Integer�� value�� ��Ī�Ѵ�.
		HashMap<String,Integer> a = new HashMap<String,Integer>();
		
		// Set,List �� �ٸ��� Map�� key,value�� ������ ���� ��� �����ؾ� �Ѵ�.
		// put �޼ҵ带 ����Ͽ� "one",1 �� �����Ѵ�.
		a.put("one" , 1);
		a.put("two" , 2);
		a.put("three" , 3);
		a.put("four" , 4);
		
		// Map �� ��� �� ���� get�޼ҵ带 ����Ͽ� �ش� key���� String���� ȣ���ؾ� ����Ǿ� �ִ� value1�� ȣ��
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}
	static void iteratorUsingForEach(HashMap map) {
		// map�������̽��� ���ԵǾ� �ִ� �޼ҵ� entrySet()�� ���
		// ������ Ÿ���� Map.Entry�� ����Ͽ�  ���׸� <String,Integer>�� �����Ͽ� map�� ����ִ� �����͸� ��´�.
		// ������ Ÿ���� Set�� �ν��Ͻ� entries�� ��´�.
		// �� ������ map �������̽��� Iterator �������̽��� ���� ������ Set�������̽��� �����Ͽ� �����͸� ���� �� Iterator ����
		// Map.Entry���� �޼ҵ� getKey, getValue�� ���ԵǾ� �ִ�, getKey = String, getValue = Integer
		Set<Map.Entry<String,Integer>> entries = map.entrySet();
		// entries�� ��� �����͵��� entry�� ���ԵǾ� for���� ����ȴ�.
		for (Map.Entry<String, Integer> entry : entries) 
		{
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
	}
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String,Integer>> entries = map.entrySet();
		// Set ������ Ÿ�Կ� ��� entries�� �޼ҵ� iterator�� ���� �ϱ����� i�� ��´�
		Iterator<Map.Entry<String,Integer>> i = entries.iterator();
		// iterator �޼ҵ� hasNext , next�� ����Ͽ� while������ �ݺ� ����
		while(i.hasNext()) 
		{
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
	}
 }
