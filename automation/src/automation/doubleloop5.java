package automation;

public class doubleloop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5; i>=1;i--)
		{
			for(int j =i; j<=(i-1); j++)
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i;k--)
			{
				System.out.print("*");
			}
		    System.out.println();
		}
	
	}
}

	
	
	
