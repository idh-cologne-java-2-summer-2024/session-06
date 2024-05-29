package idh.java;

import java.util.Iterator;

import idh.java.util.NameGenerator;

public class Course implements Iterable<Student> {
	Student[] members;
	
	int nextPosition = 0;
	String name;


	public Course(String name, int numberOfStudents) {
		this.members = new Student[numberOfStudents];
		this.name = name;
	}
	
	public void addMember(Student student) throws Exception {
		if (nextPosition < members.length)
			members[nextPosition++] = student;
		else
			throw new Exception("Class full");
	}
	
	
	public void addMember(String name) throws Exception {
		this.addMember(new Student(name, 0));
	}
	
	public int size() {
		return members.length;
	}
	
	public Student getMember(int member) {
		return members[member];
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isFull() {
		return nextPosition >= members.length;
	}

	@Override
	public Iterator<Student> iterator() {
		return new StudentIterator(this);
	}


	public static void main(String[] args) throws Exception {
		NameGenerator ng = new NameGenerator();
		
		

		
	}

}
