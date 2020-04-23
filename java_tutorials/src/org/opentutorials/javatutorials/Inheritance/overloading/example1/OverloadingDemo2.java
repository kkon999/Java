package org.opentutorials.javatutorials.Inheritance.overloading.example1;

public class OverloadingDemo2 extends OverloadingDemo{
	    
    void A (String arg1,String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
    void A (){System.out.println("sub calss : void A()");}
    public static void main(String[] args) {
    	
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody");
    }

}
