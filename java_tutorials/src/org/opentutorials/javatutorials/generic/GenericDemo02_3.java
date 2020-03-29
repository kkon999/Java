package org.opentutorials.javatutorials.generic;

class EmployeeInfo3{
	public int rank;
	EmployeeInfo3(int rank){
		this.rank = rank;
	}
}

class Person3<T,S>{ // 와일드카드로 T,S 설정  <T,S>데이터 타입에는 참조형 데이터 타입만 가능
	public T info;  // 데이터 타입을 확정 짓지 않아서 제네릭을 사용
	public S id;	// 데이터 타입을 확정 짓지 않아서 제네릭을 사용
	Person3(T info , S id){
		this.info = info;
		this.id = id;
	}
}

public class GenericDemo02_3 {

	public static void main(String[] args) {
		
        // 제네릭에서는 기본데이터 사용을 하지않고 참조형데이터를 사용해야 한다.
		// 기본 데이터 타입 Int를 참조형 데이터로 변환해주는 역할인 Integer로 변환
		Integer id = new Integer(10); 
        
        Person3<EmployeeInfo3, Integer> p1 = new Person3<EmployeeInfo3, Integer>(new EmployeeInfo3(1), id);
        // Person3 클래스의 복수 제네릭을 사용하여  new EmployeeInfo3(1) 과, Intger 객체를 생성하여 호출
        
        System.out.println(p1.id.intValue()); // intValue : Integer가 가지고 있는 메소드 intValue는 Intger가 가지고 있는 값을 호출 하는 기능
	}
}