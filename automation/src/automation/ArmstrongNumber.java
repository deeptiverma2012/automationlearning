package automation;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =153;
		int old_number = number;
		int sum =0;
		if(number <1000 && number>999)
		{
			
		}
		while(number>0)
		{
			int  r = number%10;
			sum = sum+r*r*r;
			number = number/10;
		}
		if(sum ==old_number)
		{
			System.out.println("It's an armstrong number"+ old_number);
		}
		else 
		{
			System.out.println("Not an armstrong number"+old_number);
		}
				

	}

}
