package idh.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

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
		
		Queue<Student> warteschlange = new LinkedList<Student>();
		Student s = new Student(ng.getName(), 0);
		
		warteschlange.add(s);
		warteschlange.add(s);
		warteschlange.add(s);
		
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(s);		
		studentSet.add(s);
		studentSet.add(s);
		System.out.println(studentSet);

		warteschlange.add(new Student(ng.getName(), 0));
		warteschlange.add(new Student(ng.getName(), 0));
		warteschlange.add(new Student(ng.getName(), 0));
		warteschlange.add(new Student(ng.getName(), 0));
		warteschlange.add(new Student(ng.getName(), 0));

		System.out.println(warteschlange);
		
		Course course = new Course("Java 7", 30);
		course.addMember(warteschlange.poll());
		course.addMember(warteschlange.poll());
		course.addMember(warteschlange.poll());
		course.addMember(warteschlange.poll());
		course.addMember(warteschlange.poll());
		course.addMember(warteschlange.poll());
		System.out.println(warteschlange.poll());

//		System.out.println(warteschlange);
//		
//		System.out.println(course);
//		for(Student s : course)
//			System.out.println(s);

		// warteschlange
		
	}

}
