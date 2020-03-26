package scope;

public class ScopeDemo1 {
	
	
	static void a() {
		int i = 0; //이 메소드 안에서만 동작하는 변수이다.
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			a();
		System.out.println(i);
		}
		
		
	}

}
