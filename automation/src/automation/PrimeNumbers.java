package automation;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int Num = scan.nextInt();
		
		// To check 0 & 1 are not prime numbers
		int Num2 = Num/2;
		int var=0;
		
		
		for(int i=2; i<=Num2;i++ )
		{
			if(Num%i==0)
			{
				System.out.println("Not a prime Number");
				var=1;
				break;
			}
		}
			
			if(var==0)
			{
				System.out.println("It's a prime number");
			}
		}
		
					
	}


