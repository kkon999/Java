package scope;

public class ScopeDemo4 {
	
	
	
	static void a() {
		String title = "coding everyday";
	}
	public static void main(String[] args) {
		a();
		
		char[] title = null;
		System.out.println(title);
		
	}
}
