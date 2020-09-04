package automation;

import java.util.Scanner;

public class StringAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the string that you want to check");
		
		String s = scan.next();
		
		int l = s.length();
		
		String reverse ="";
		
		for(int i= l-1; i>=0; i--)
		{
			reverse = reverse+ s.charAt(i); 
		}
	  
		  System.out.println(reverse);
		
		if(reverse.contentEquals(s))
		{
			System.out.println("It's a Palindrome");
			
		}
		else
		{
			System.out.println("It's not a Palindrome");
		}
	
	}	 
		
}


