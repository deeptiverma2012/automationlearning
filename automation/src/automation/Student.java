package automation;

public class Student {
	
	public Student()
	{
		this(10,20,30,40);
		System.out.println("Default Constructor");
		
	}
	public Student(int a)
	
	{
		this();
		System.out.println("One parameterized constructor");
	}
	public Student(int a, int b)
	{
		this(10);
		System.out.println("Two parameterized constructor");
	}
	public Student(int a, int b, int c)
	{
		this(20,30);
		System.out.println("Three parameterized constructor");
	}
	public Student(int a, int b, int c, int d)
	{
		System.out.println("Four parameterized constructor");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student(10,20,30);
		
		

	}

}
