package scope;

public class ScopeDemo2 {
	static int i;		//어느 중 괄호안에서 사용가능한  변수 i 이다.
	
	static void a() {
		i = 0;		// 전역 변수 i를 사용하게 된다.
	}

	public static void main(String[] args) {
		for (i = 0; i < 5 ; i++) {
			a();							//i++ 이후 클래스 변수인 0 값이 들어오게 되어 무한 루팅에 빠지게 된다.
			System.out.println(i);
			
		}
	}
}
