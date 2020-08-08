package automation;

public class SBI_Bank extends Bank {
	
	public SBI_Bank()
	
	{	super(10,20);
		System.out.println("Child default constructor");
	}
   public SBI_Bank(int a)
	
	{
	   this(1,2,3);
	   System.out.println("Child 1 parameterized constructor");
	}
  public SBI_Bank(int a, int b)
	
	{
	   
	    this(30);
		System.out.println("Child 2 parameterized constructor");
	}
  public SBI_Bank(int a, int b, int c)
	
	{
	
	    this();
		System.out.println("Child 3 parameterized constructor");
	}
  
  public SBI_Bank(int a, int b, int c , int d)
	
	{
		System.out.println("Child 4 parameterized constructor");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI_Bank sbnk = new SBI_Bank(10,20);
		

	}

}
