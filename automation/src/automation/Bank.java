package automation;

public class Bank {
	
	public Bank()
	{
	 this(30,40,50);
	 System.out.println("Parent default constructor");
	 	 
	}
	public Bank(int a)
	{
		this(10,20,30,40);
		System.out.println("Parent 1 parameterized constructor");
	}
	public Bank(int a, int b)
	{
		this(50);
		System.out.println("Parent 2 parameterized constructor");
	}

	public Bank(int a, int b, int c)
	{

	 System.out.println("Parent 3 parameterized constructor");
	}
	
	public Bank(int a, int b, int c, int d)
	{
		this();
		System.out.println("Parent 4 parameterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bnk = new Bank(10,30);
		

	}

}
