package org.opentutorials.javatutorials.constant2;

class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}

class Company{
	public static final Company GOOGLE = new Company();
	public static final Company APPLE= new Company();
	public static final Company ORACLE= new Company();
}


public class ConstantDemo3_4 {

public static void main(String[] args) {
	
	//APPLE에 대한 데이터 타입의 값이 다르기 때문에 if 구문이 실행이 되지 않는다.	
	/*if (Fruit.APPLE == Company.APPLE)
	{
		System.out.println("같습니다.");
	}
	*/
	
	Fruit type = Fruit.APPLE;
	//switch 문을 사용 할 때 한가지 주의 할 것은 제한된 데이터 타입만을 사용할 수 있다. 
	//byte,short,char,int,enum,String,Character.Byte,Short,integer를 사용 가능하다.
	// 즉 if 문을 사용하거나 Fruit말고 상기에 있는 데이터 타입중 하나로 바꿔야 한다.
	switch (type) {
	case Fruit.APPLE:
		System.out.println(35 + "kcal");
		break;
	case Fruit.PEACH:
		System.out.println(57 + "kcal");
		break;
	case Fruit.BANANA:
		System.out.println(100 + "kcal");
		break;
	}
}
	

}
