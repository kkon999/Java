package org.opentutorials.javatutorials.generic;

interface Info03_3{
    int getLevel();
}

class EmployeeInfo03_3 implements Info03_3{
    public int rank;
    
    EmployeeInfo03_3(int rank){ 
    this.rank = rank; 
    }
    
    public int getLevel(){
        return this.rank;
    }
}

class Person03_3<T extends Info03_3>{ 	// T 는 데이터 타입을 결정하지 않은 상태 , interface 구조인데 extends가 사용가능한 이유는 매개변수 T의 부모가 Info03_3이라는 것을 지칭하는 뜻이기에 사용이 가능하다
    public T info; 						// T 는 info의 데이터 타입이다.
    Person03_3(T info){ 
    	this.info = info; 
    	info.getLevel(); 				// extends를 통해 상속 받고 있는 getLevel(); 메소드를 사용 할 수 가 있다.
    	
    }
}
public class GenericDemo03_3 {
    public static void main(String[] args) {
        Person03_3<EmployeeInfo03_3> p1 = new Person03_3<EmployeeInfo03_3>(new EmployeeInfo03_3(1));
        // <EmployeeInfo03_2>를 통해 클래스 Person03_2의 매개변수에 설정되어 있는 Info03_2의 자식클래스가  <EmployeeInfo03_2>맞는지 확인
        
        //Person03_2<String> p2 = new Person03_2<String>("부장");
        // <String>는 Info03_2의 자식 클래스에 속해 있는 매개변수 타입이 없기 때문에 오류가 발생한다.
    }
}
