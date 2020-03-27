package org.opentutorials.javatutorials.generic;

class StudentInfo{
	public int grade;
	
	StudentInfo(int grade)	// int 데이터 타입의 grade인자를 갖는 생성자
	{
		this.grade = grade;
	}
}

class StudentPerson{
	public StudentInfo info;
	
	StudentPerson(StudentInfo info){  // StudendtInfo 데이터 타입의 info인자를 갖는 생성자
		this.info = info;
	}
}

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank)  // int 데이터 타입의 rank인자를 갖는 생성자
	{
		this.rank = rank;
	}
}
class EmployeePerson{
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info){ // EmployeeInfo 데이터 타입의 info인자를 갖는 생성자
		this.info = info;
	}
}

public class GenericDemo02_1 {
	
	public static void main(String[] args) {
		
		StudentInfo si = new StudentInfo(2);	   // 변수 si에 2를 담는 인스턴스 생성
        StudentPerson sp = new StudentPerson(si);  
        System.out.println(sp.info.grade); // 2
        
        EmployeeInfo ei = new EmployeeInfo(1); 	  // 변수 ei에 1를 담는 인스턴스 생성
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank); // 1
	}
}
