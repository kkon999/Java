package org.opentutorials.javatutorials.generic;

class EmployeeInfo4{
    public int rank;
    EmployeeInfo4(int rank){ this.rank = rank; }
}
class Person03_1<T, S>{
    public T info;
    public S id;
    Person03_1(T info, S id){ 
        this.info = info;
        this.id = id;
    }
 // 제네릭은 메소드에서도 사용 할 수 가 있다
    public <U> void printInfo(U info){ 			// 접근제어자 public과 리턴값 void 사이에 <U>는 printInfo메소드 안에서 지정된 데이터 타입이 매개변수 info의 데이터 타입이 되는것
        System.out.println(info);
    }
}
public class GenericDemo03_1 {
    public static void main(String[] args) {
        EmployeeInfo4 e = new EmployeeInfo4(1); 
        Integer i = new Integer(10); 			 
        //Person4<EmployeeInfo4, Integer> p1 = new Person4<EmployeeInfo4, Integer>(e, i);  Person4 클래스를 인스턴스화 할 때 사용 할 데이터 타입을 매개변수 처럼 <EmployeeInfo4, Integer>로 설정
        Person03_1 p1 = new Person03_1(e, i); // 매개변수<EmployeeInfo4, Integer>를 생략하여도 상위 생성자 Person4에 포함된 <T,S>가  EmployeeInfo4,Integer 인 것을 자바는 인식한다.
        
        //p1.<EmployeeInfo4>printInfo(e); 생성된 인스턴스를 통해 메소드 printInfo의 매개변수 EmployeeInfo4 e를 호출한다.
        p1.printInfo(e);		// 매개변수 info에 어떠한 값이 대입되었는지 확인이 가능하므로 <EmployeeInfo4>는 생략이 가능하다.
    }
}
