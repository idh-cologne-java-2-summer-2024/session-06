package idh.java;

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

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (! (o instanceof Student))
			return false;
		Student s = (Student) o;
		return this.matrikelNummer == s.matrikelNummer;
	}
	
	@Override
	public int hashCode() {
		return matrikelNummer;
	}
	
	public static void main(String[] args) {
	}
}
