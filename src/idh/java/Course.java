package idh.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

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
		this.addMember(new Student(name));
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
		
		Queue<Student> warteschlange = new LinkedList<Student>();
		warteschlange.add(new Student(ng.getName()));
		warteschlange.add(new Student(ng.getName()));
		warteschlange.add(new Student(ng.getName()));
		warteschlange.add(new Student(ng.getName()));
		warteschlange.add(new Student(ng.getName()));
		warteschlange.add(new Student(ng.getName()));
		
		for (Student s : warteschlange) {
			System.out.println(s);
		}
		
		Course course = new Course("Java 2", 4);
		course.addMember(warteschlange.remove());
		course.addMember(warteschlange.remove());
		course.addMember(warteschlange.remove());
		course.addMember(warteschlange.remove());
		
		for (Student student : course) {
			System.out.println(student);
		}
		
	}

}
