package org.opentutorials.javatutorials.generic;

interface Info6{
    int getLevel();
}
class EmployeeInfo6 implements Info6{
    public int rank;
    EmployeeInfo6(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person6<T extends Info>{
    public T info;
    Person6(T info){ this.info = info; }
}
public class GenericDemo03_2 {
    public static void main(String[] args) {
        Person6 p1 = new Person6(new EmployeeInfo6(1));
        Person6<String> p2 = new Person6<String>("부장");
    }
}