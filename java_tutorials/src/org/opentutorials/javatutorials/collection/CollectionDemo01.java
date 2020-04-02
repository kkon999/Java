package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;

public class CollectionDemo01 {
	 
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        //arrayObj[2] = "three"; String[2] 설정된 크기보다 큰 값이 들어오게되면 오류가 발생한다.
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }
         
        ArrayList al = new ArrayList(); // ArrayList는 컬렉션프레임워크 안에 있는 클래스
       
        //ArrayList<String> al = new ArrayList<String>(); 제네릭으로 <String>을 선언하여 내부에 선언되는 인자값의 데이터 타입을 String으로 변경한다.
        
        al.add("one");	// 상위 String 배열 선언의 al[0] = "one";과 동일한 의미이다
        al.add("two");	// 
        al.add("three");
        for(int i=0; i<al.size(); i++){	// size 메소드를 호출해서 ArrayList안에 몇 개의 값이 저장되어있는지 확인
        	//String value = al.get(i); ArrrayList클래스 내부에 선언되는 인자의 데이터 타입은 Object이다. 그러나 String데이터 타입에 담으려 하면 오류가 발생
        	String value = (String)al.get(i); // String 데이터 타입으로 형변환을 진행하여 value에 담을 수 있다.
            System.out.println(al.get(i));
        }
    }
}
