package org.opentutorials.javatutorials.generic;

abstract class Info{
    public abstract int getLevel();
}
class EmployeeInfo5 extends Info{
    public int rank;
    EmployeeInfo5(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person5<T extends Info>{
    public T info;
    Person5(T info){ this.info = info; }
}
public class GenericDemo03_1 {
    public static void main(String[] args) {
        Person5 p1 = new Person5(new EmployeeInfo5(1));
        Person5<String> p2 = new Person5<String>("부장");
    }
}
