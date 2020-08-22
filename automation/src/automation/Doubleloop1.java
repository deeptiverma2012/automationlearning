package automation;

public class Doubleloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Assignment 2");
		
		for(int i=1; i<=5;i++)
		{
			for(int j=5; j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
