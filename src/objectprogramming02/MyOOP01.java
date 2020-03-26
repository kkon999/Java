package objectprogramming02;

public class MyOOP01 {

	
	public static String delimiter = ""; // delimiter 변수를 MyOOP클래스 안에서 사용 할 수 있도록 클래스 하단에 생성
	
    public static void printA() {	// printA 메소드 생성
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    
    public static void printB() {   // printB 메소드 생성
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
	
	public static void main(String[] args) {
       
		delimiter = "----";
		printA();
		printA();
		printB();
		printB();
		
		delimiter = "****";
		printA();
		printA();
		printB();
		printB();
    }

}
