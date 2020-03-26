package objectprogramming01;

import java.io.FileWriter;
import java.io.IOException;
 
public class OthersOOP {
 
    public static void main(String[] args) throws IOException {
        // class : System, Math, FileWriter
        // instance : f1, f2
        
    	// 단발적인 작업일때는 메소드,변수를 클래스에 소속된것을 사용
        System.out.println(Math.PI);		// Math 클래스를 사용하여 그 안에 포함되어 있는 메소드 실행
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));
         
        
        // 긴 맥락을 가진 작업일때는 클래스를 f1,f2에 복제 하여 작업
        FileWriter f1 = new FileWriter("data.txt");	// FileWriter 클래스를 f1 에 복제하여 인스턴스를 생성
        f1.write("Hello");
        f1.write(" Java");
         
        FileWriter f2 = new FileWriter("data2.txt"); // FileWriter 클래스를 f2 에 복제하여 인스턴스를 생성
        f2.write("Hello");
        f2.write(" Java2");
        f2.close();
    }
}