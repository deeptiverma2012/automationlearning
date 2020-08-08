package automation;

public class Maruti extends Car {

	public void Maruti()
	{ 
		super.Car();	
		System.out.println("Child default method ");
				
	}
	public void Maruti(int a)
	{
		this.Maruti();
		System.out.println("Child 1 parameterized method ");
		this.Maruti(10,20);
		this.Maruti(1, 2, 3, 4);
		this.Maruti(3, 3, 8);
	}
	public void Maruti(int a, int b)
	{
		
		System.out.println("Child 2 parameterized method ");
	}
	public void Maruti(int a, int b, int c)
	{
		
		System.out.println("Child 3 parameterized method ");
	}
	public void Maruti(int a, int b, int c, int d)
	{
		
		System.out.println("Child 4 parameterized method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maruti mar = new Maruti();
		mar.Maruti(10);

	}

}
