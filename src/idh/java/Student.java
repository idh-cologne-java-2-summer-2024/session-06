package idh.java;

import java.util.HashSet;

public class Student extends Object {
	String name;
	int matrikelNummer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int mNum) {
		super();
		this.name = name;
		this.matrikelNummer = mNum;
	}

	public String toString() {
		return name;
	}

	public boolean equals(Object o) {
		if (! (o instanceof Student))
			return false;
		Student s = (Student) o;
		return this.matrikelNummer == s.matrikelNummer;
	}
	
	public int hashCode() {
		return matrikelNummer;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Maria Müller", 123);
		Student s2 = new Student("Stefan Schmidt", 234);
		Student s3 = new Student("Maria Müller", 123);
		
		System.out.println("MARIO".equalsIgnoreCase("mario"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(5 == 3);
		System.out.println(5 == 5);
		
		HashSet<Student> studentGroup = new HashSet<Student>();
		studentGroup.add(s1);
		studentGroup.add(s2);
		studentGroup.add(s3);
		System.out.println(studentGroup);
		
	}
}
