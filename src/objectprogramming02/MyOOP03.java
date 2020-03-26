package objectprogramming02;


class Print2 {
	
	public String delimiter = "";
	
	public void A() {
	
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
		
	}
	public void B() {
		
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
		
		
	}
}

public class MyOOP03 {
	
	public static void main(String[] args) {
		Print2 p1 = new Print2();		// Print2 클래스를 복제하여 p1 인스턴스를 생성
		p1.delimiter ="----";			// 클래스의 delimiter가 아닌 p1인스턴스의 delimiter를 호출
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		
		Print2 p2 = new Print2();		// Print2 클래스를 복제하여 p2 인스턴스를 생성
		p2.delimiter ="****";			// 클래스의 delimiter가 아닌 p2인스턴스의 delimiter를 호출
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();							// p1 인스턴스를 생성했기에 기존에 delimiter = "---"를 같이 선언 해 줄 필요가 없음
		p2.A();							// p2 인스턴스를 생성했기에 기존에 delimiter = "---"를 같이 선언 해 줄 필요가 없음
		p1.A();
		p2.A();
	}

}
