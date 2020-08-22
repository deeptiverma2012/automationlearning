package automation;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =121;
		int old_number = number;
		int sum =0;
		
		while(number>0)
		{
			int  r = number%10;
			sum = sum*10+r;
			number = number/10;
		}
		if(sum ==old_number)
		{
			System.out.println("It's a palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}
		
		

	}

}
