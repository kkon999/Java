package org.opentutorials.javatutorials.generic;

class Person<T>{	// 메인메소드에서 Person을 인스턴스화 할 때 <String>이 <T>에 전달
	
    public T info;	// info필드의 데이터 타입은 String
}
 
public class GenericDemo01 {
 
    public static void main(String[] args) {
    	
        Person<String> p1 = new Person<String>(); // Person이라는 클래스를 인스턴스화 할 때  <String> 데이터 타입을 선언
        
        Person<StringBuilder> p2 = new Person<StringBuilder>(); //  Person이라는 클래스를 인스턴스화 할 때  <StringBuilder> 데이터 타입을 선언
    }
 
}