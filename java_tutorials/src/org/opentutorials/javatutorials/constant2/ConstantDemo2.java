package org.opentutorials.javatutorials.constant2;
<<<<<<< master

		public class ConstantDemo2 {
			
		// ConstaantDemo 와 다르게 APPLE,PEACH,BANANA의 인스턴스를 생성하여 구분지음 주석이 필요없게 된다.
			
		private final static int APPLE  =1;
		private final static int PEACH  =2;	
		private final static int BANANA =3;
		
		public static void main(String[] args) {
			int type = APPLE;
			
			switch(type) {
			case APPLE:
				System.out.println(30 + " kacl");
				break;
			case PEACH:
				System.out.println(57 + " kacl");
				break;
			case BANANA:
				System.out.println(100 + " kacl");
				break;
			}
		}
	}
		
=======
		public class ConstantDemo2 {
	    private final static int APPLE = 1;
	    private final static int PEACH = 2;
	    private final static int BANANA = 3;
	    public static void main(String[] args) {
	        int type = APPLE;
	        switch(type){
	            case APPLE:
	                System.out.println(40+" kcal");
	                break;
	            case PEACH:
	                System.out.println(20+" kcal");
	                break;
	            case BANANA:
	                System.out.println(93+" kcal");
	                break;
	        }
	    }
	}


>>>>>>> 0a48c0f backup
