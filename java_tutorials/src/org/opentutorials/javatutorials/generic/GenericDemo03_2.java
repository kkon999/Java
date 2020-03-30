package org.opentutorials.javatutorials.generic;

abstract class Info03_2{ 				 // 부모 클래스 Info03_2 을 생성
    public abstract int getLevel();		 // getLevel()이라는 int 형 메소드 구현
}

class EmployeeInfo03_2 extends Info03_2{ // 자식클래스 EmployeeInfo03_2를 생성
    public int rank;
    
    EmployeeInfo03_2(int rank){ 
    this.rank = rank; 
    }
    
    public int getLevel(){
        return this.rank;
    }
}

class Person03_2<T extends Info03_2>{ 	 // T 는 데이터 타입을 결정하지 않은 상태 , T의 데이터 타입을 Info03_2클래스의 자식 클래스에만 받아오도록 설정
    public T info; // T 는 info의 데이터 타입이다.
    Person03_2(T info){ this.info = info; }
}
public class GenericDemo03_2 {
    public static void main(String[] args) {
        Person03_2<EmployeeInfo03_2> p1 = new Person03_2<EmployeeInfo03_2>(new EmployeeInfo03_2(1));
        // <EmployeeInfo03_2>를 통해 클래스 Person03_2의 매개변수에 설정되어 있는 Info03_2의 자식클래스가  <EmployeeInfo03_2>맞는지 확인
        
        //Person03_2<String> p2 = new Person03_2<String>("부장");
        // <String>는 Info03_2의 자식 클래스에 속해 있는 매개변수 타입이 없기 때문에 오류가 발생한다.
    }
}