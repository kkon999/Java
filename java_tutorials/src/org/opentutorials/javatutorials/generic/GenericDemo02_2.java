package org.opentutorials.javatutorials.generic;

class StudentInfo03{
    public int grade;
    StudentInfo03(int grade){ this.grade = grade; }
}
class EmployeeInfo03{
    public int rank;
    EmployeeInfo03(int rank){ this.rank = rank; }
}
class Person03{// 2개로 나눠져 있던 class StudentPerson과 EmployeePerson을 중복제거를 위해 Person03으로 Object화 하였다
    public Object info;
    Person03(Object info){ this.info = info; }
}
public class GenericDemo03 {
    public static void main(String[] args) {
        Person03 p1 = new Person03("부장");		// Object화 된 Person3에 엉뚱한 값인 "부장"이 대입되어도 오류가 발생하지 않고 컴파일시 오류가 발생한다.
        										// 이러한 오류를 해결하기 위해 Gerneric 을 사용한다.
        EmployeeInfo ei = (EmployeeInfo)p1.info;
        System.out.println(ei.rank);
    }
}
