package progenitor;

class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		Student s= (Student)obj;
		
		return this.name == s.name;
	}
}

public class ObjectDemo {
	
	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
