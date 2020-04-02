package org.opentutorials.javatutorials.constant2;

public class ConstantDemo3_2 {
	
	//만약 APPLE가 FRUIT,COMPANY로 나누어 진다면 앞에 접두사를 붙여 구분시킨다. 
	//이름 충돌을 방지한다.
	
	private final static int FRUIT_APPLE = 1;
	private final static int FRUIT_PEACH = 2;
	private final static int FRUIT_BANANA = 3;
		
	private final static int COMPANY_GOOGLE = 1;
	private final static int COMPANY_APPLE  = 2;
	private final static int COMPANY_ORACLE = 3;
	
	public static void main(String[] args) {
		
		int type = FRUIT_APPLE;
		
		switch (type) {
			case FRUIT_APPLE:
				System.out.println(35 + " kcal");
			case FRUIT_PEACH:
				System.out.println(57 + " kcal");
			case FRUIT_BANANA:
				System.out.println(100 + " kcal");
	
		}
	}
	
}
