
public class Student {
	public String name;
	public int age;
	public double GPA;
	public String major;
	
	public Student(String name, int age, double gpa, String major) {
		this.name = name;
		this.age = age;
		this.GPA = gpa;
		this.major = major;
	}
	
	//retrieving the name
	public String getName() {
		return name;
	}
	
	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	//setting a value to the name property
	public void setName(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("My name is " + this.name + " and my gpa is " + getGPA());
	}
	

}
