package org.opentutorials.javatutorials.exception;


class A{
	private int[] arr = new int [3];
	A() {
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void z(int first, int second) {
		
		try {
		System.out.println(arr[first]/arr[second]);
		}
		
	//	catch(Exception e) {				//Exveption이 제일 상위에 오게되면 하위에 있는 예외구문은 실행되지 않는다. 가장 포괄적인 예외구문이다.
	//		System.out.println("오류입니다.");
	//	}
		
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	
		catch(Exception e) {				//Exveption이 제일 상위에 오게되면 하위에 있는 예외구문은 실행되지 않는다.
			System.out.println("오류입니다.");
		}
		
		finally {							// 예외가 발생 할 수 있는 로직이 예외가 발생 하든 안하든 실행해야 하는 로직이 있을때 사용
			System.out.println("finally");
		}
	}
}

public class ExceptionDemo1 {
	
	public static void main(String[] args) {
		A a= new A();
		a.z(10,0);
		a.z(1,0);
		a.z(2,1);
	}
}