package automation;

public class StringAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = new String("My Name is Deepak");
				
		int l= str1.length();
		
		String reverse = " ";
		
		for(int i=l-1; i>=0; i--)
		{
			reverse = reverse+str1.charAt(i);
			
		}
		  System.out.println(reverse);
	}

}
