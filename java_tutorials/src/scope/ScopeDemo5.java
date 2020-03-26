package scope;

public class ScopeDemo5 {
	static int i = 333;	
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println(i);	// for문에 속해 있는 i를 사용할 수 없으므로 static int i 를 선언한다.
	}

}
