package org.opentutorials.javatutorials.constant2;


// enum은 서로 연관된 상수들의 집합이다. 즉 바뀌지 않는 값들의 집합

/* 아래에 있는 enum Fruit로 변경
 * class Fruit{
public static final Fruit APPLE = new Fruit();
public static final Fruit PEACH = new Fruit();
public static final Fruit BANANA = new Fruit();
}*/

/*class Company{
public static final Company GOOGLE = new Company();
public static final Company APPLE= new Company();
public static final Company ORACLE= new Company();
}
*/

enum Fruit4{
	APPLE("red") , PEACH("pinek") , BANANA("yellow");
	
	private String color;
	public String getColor() {
		return this.color;
	}
	
	Fruit4(String color) {
		System.out.println("CALL " + this);
		this.color = color;
	}
	
}

enum Company4{
	GOOGLE , APPLE , ORACLE
}


public class ConstantDemo4 {

	public static void main(String[] args) {


		Fruit4 type = Fruit4.APPLE;

//switch 문을 사용 할 때 한가지 주의 할 것은 제한된 데이터 타입만을 사용할 수 있다. 
//byte,short,char,int,enum,String,Character.Byte,Short,integer를 사용 가능하다.
// 즉 if 문을 사용하거나 Fruit말고 상기에 있는 데이터 타입중 하나로 바꿔야 한다.

			switch (type) {
				case APPLE:
					System.out.println(35 + " kcal , color " + Fruit4.APPLE.getColor());
					break;
				case PEACH:
					System.out.println(57 + " kcal , color " + Fruit4.PEACH.getColor());
					break;
				case BANANA:
					System.out.println(100 + "kcal , color " + Fruit4.BANANA.getColor());
					break;
		}
	}
}