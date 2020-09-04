package automation;

public class StringAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "My Name is Deepak";
		
	String[] arr=	s.split(" ");
	
	int l = arr.length;
	
	String reverse =" ";
	
	for(int i=0; i<l; i++)
	{
	char[] c = arr[i].toCharArray();
		
	for(int j=c.length-1; j>=0; j--)
	{
		System.out.println(c[j]);
	}
		System.out.println(" ");
		
		

	}
	

	}
}
