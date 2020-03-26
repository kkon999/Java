package objectprogramming02;


class Print{						 //  Print 클래스를 생성하여 Print A - > A , Print B - > A 로 메소드를 변경 
									 //  서로 연관이 있는 메소드들을 한 클래스로 묶는다.
	
public static String delimiter = ""; // delimiter 변수를 MyOOP클래스 안에서 사용 할 수 있도록 클래스 하단에 생성
	
    public static void A() {	     // printA 메소드 생성
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    
    public static void B() {         // printB 메소드 생성
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}

public class MyOOP02 {
	
	public static void main(String[] args) {
       
		Print.delimiter = "----";	 // Print클래스를 사용하게 되면서 delimiter 메소드도 클래스에 상속되어 Print.delimiter 로 선언 
		Print.A();					 // Print클래스를 사용하게 되면서 delimiter 메소드도 클래스에 상속되어 Print.A Print.B 로 선언 
		Print.A();
		Print.B();
		Print.B();
		
		Print.delimiter = "****";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
    }
}
