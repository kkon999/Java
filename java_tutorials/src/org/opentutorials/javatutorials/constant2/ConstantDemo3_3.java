package org.opentutorials.javatutorials.constant2;


// interface를 사용하여 여러의 상수로 선언하여 기존 복잡했었던 COMPANY,FRUIT를 정리한다.
// interface는 기본적으로 public static을 포함하고 있기 때문에 interface로 정리를 한다.


interface FRUIT{
	int APPLE = 1, PEACH = 2 , BANANA =3;
}

interface COMPANY{
	int GOOGLE = 1, APPLE = 2 , ORACLE =3;
}

public class ConstantDemo3_3 {
	public static void main(String[] args) {
			
	// FRUIT , COMPANY 의 APPLE가 비교가 되면 안된다.
	if(FRUIT.APPLE == COMPANY.APPLE) {
		System.out.println("같습니다.");
		}
	
	int type = FRUIT.APPLE;
	switch(type) {
	//interface 를 사용 하였기에 기존 FRUIT_APPLE에서 FRUIT.APPLE로 변경한다
	case FRUIT.APPLE:
		System.out.println(35 + " kcal");
		break;
	case FRUIT.PEACH:
		System.out.println(57 + " kcal");
		break;
	case FRUIT.BANANA:
		System.out.println(100 + " kcal");
		break;
	}
}
}