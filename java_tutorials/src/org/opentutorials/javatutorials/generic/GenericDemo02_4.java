package org.opentutorials.javatutorials.generic;

class EmployeeInfo4{
    public int rank;
    EmployeeInfo4(int rank){ this.rank = rank; }
}
class Person4<T, S>{
    public T info;
    public S id;
    Person4(T info, S id){ 
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}
public class GenericDemo02_4 {
    public static void main(String[] args) {
        EmployeeInfo4 e = new EmployeeInfo4(1);
        Integer i = new Integer(10);
        Person4<EmployeeInfo4, Integer> p1 = new Person4<EmployeeInfo4, Integer>(e, i);
        p1.<EmployeeInfo4>printInfo(e);
        p1.printInfo(e);
    }
}
