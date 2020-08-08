package automation;

public class Car {
	
	public void Car()
	{ 
		this.Car(1);
		System.out.println("Parent default method ");
		this.Car(3, 4);
		this.Car(2, 3, 4);
		this.Car(1,2,3,4);
	}
	public void Car(int a)
	{
		System.out.println("Parent 1 parameterized method ");
	}
	public void Car(int a, int b)
	{
		
		System.out.println("Parent 2 parameterized method ");
	}
	public void Car(int a, int b, int c)
	{
		
		System.out.println("Parent 3 parameterized method ");
	}
	public void Car(int a, int b, int c, int d)
	{
		
		System.out.println("Parent 4 parameterized method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.Car();
	
		
		
	}

}
