package org.opentutorials.javatutorials.generic;

class StudentInfo2{
	public int grade;
	
	StudentInfo2(int grade)	// int 데이터 타입의 grade인자를 갖는 생성자
	{
		this.grade = grade;
	}
}

class EmployeeInfo2{
	public int rank;
	EmployeeInfo2(int rank)  // int 데이터 타입의 rank인자를 갖는 생성자
	{
		this.rank = rank;
	}
}

class Person2{				// 데이터 중복제거를 위해 StudentPerson,EmployeePerson 을 Person으로 통합
	public Object info;		// 모든 클래스의 상위인 Object를 데이터 타입으로 설정
	Person2(Object info){
		this.info = info;
	}
}

public class GenericDemo02_2 {
	
	public static void main(String[] args) {
		
		Person2 p1 = new Person2("부장");				// Person2 생성자의 데이터 타입이 Object이기 때문에 어떤 값이든 들어 갈 수 있어서 데이터 타입이 안전하지 못하다
		EmployeeInfo2 ei = (EmployeeInfo2)p1.info;  // p1의 info는 일반적인 Object 데이터 타입입니다.
												    // ei는 구체적인 데이터 타입인 int이기 때문에 형변환을 해야 한다.
		System.out.println(ei.rank);
		
	}
}