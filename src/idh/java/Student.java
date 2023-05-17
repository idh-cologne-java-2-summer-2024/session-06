package idh.java;

public class Student extends Object {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Maria Müller");
		Student s2 = new Student("Stefan Schmidt");
		Student s3 = new Student("Maria Müller");
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // true

	}
}
