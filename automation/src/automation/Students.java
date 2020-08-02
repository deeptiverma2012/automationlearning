package automation;

public class Students {
	
	public Students()
	{
		
		System.out.println("Default Constructor");
	}

    public Students(int a)
	
	{
    	this();
    	System.out.println("One parameterized constructor");
	}
   public Students(int a, int b)
	
	{   this(10);
    	System.out.println("Two parameterized constructor");
	}
   public Students(int a, int b, int c)
	
  	{
	   this(10,20);
      	System.out.println("Three parameterized constructor");
  	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s = new Students(10,20,30);

	}

}
