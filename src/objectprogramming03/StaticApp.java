package objectprogramming03;

class Foo{
	
	// static이 있으면 클래스 소속
    // static이 없으면 인스턴스 소속
	public static String classVar    = "I class var";
	public 		  String instanceVar = "I instance var";
	
	
	// 클래스 소속 메소드에서는 클래스 classVar는 접근 가능 하지만 instanceVar는 접근 불가능
	public static void classMetod() {
		System.out.println(classVar);
	//	System.out.println(instanceVar); //Error
	}
	
	// 인스턴스 소속 메소드에서는 클래스classVar,인스턴스instanceVar 모두 접근이 가능
	public void instanceMetod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}

public class StaticApp {
	
	public static void main(String[] args) {
		System.out.println(Foo.classVar);
	//	System.out.println(Foo.instanceVar); // 인스턴스 소속 instanceVar은 호출 불가능
		
		Foo.classMetod();					 // 클래스 메소드 classMetod는 클래스 Foo를 통해서 호출 가능
		Foo.instanceMetod(); 				 // 인스턴스 메소드  instanceMetod는 클래스Foo를 통해서 호출 불가능
		
		Foo f1 = new Foo();					 // 클래스 Foo를 복제하여 f1이라는 인스턴스를 생성 , 이 때 Foo클래스 안에 메소드 classMetod를 가리킴
		Foo f2 = new Foo();					 // 클래스 Foo를 복제하여 f2이라는 인스턴스를 생성 , 이 때 Foo클래스 안에 메소드 classMetod를 가리킴
		
		
		System.out.println(f1.classVar);	// f1 인스턴스에서 클래스 Foo의 classVar를 가리키에 참조 가능
		System.out.println(f1.instanceVar); // 클래스 Foo에 있는 instanceVar가 복제 되어 있기에 참조 가능
	}

}
