package org.opentutorials.javatutorials.Inheritance.example3;

class Calculator {
    int left, right;
    
    //public Calculator(){}; <- 이렇게 부모 클래스의 생성자를 명시적으로 나타내어 자식 클래스에서 호출이 가능하게 선언 가능
        
    public Calculator(int left, int right) { 	
    	this.left = left;
    	this.right = right;
    }
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
	
    public SubstractionableCalculator(int left, int right) {		
        super (left,right);			//super는 부모 클래스의 생성자를 의미한다.
        							//this가 자기 자신을 가르키는 것과 같은 원리이다. 
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
                
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
