package org.opentutorials.javatutorials.constant2;

public class ConstantDemo3 {
	// 동일한 상수명을 선언해야 한다면?
    // fruit
    private final static int APPLE = 4;
    private final static int PEACH = 2;
    private final static int BANANA = 3;
     
    // company
    private final static int GOOGLE = 1;
    //private final static int APPLE = 2;
    private final static int ORACLE = 3;
     
    public static void main(String[] args) {
        int type = APPLE;
        switch(type){
            case APPLE:
                System.out.println(30+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}