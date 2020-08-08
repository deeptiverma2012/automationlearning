package automation;
import java.util.Scanner;

public class scanExample {
		
	public int sum(int a, int b)
	{
		int c= a+b;
		return c;		
	}
	
	public int sub(int a, int b)
	{
		int d= a-b;
		return d;
	}
	public int mul(int a, int b)
	{
		int e= a*b;
		return e;
	}
	public int div(int a, int b)
	{
		int f= a/b;
		return f;
		
	}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanExample s = new scanExample();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int x1= scan.nextInt();
		
		System.out.println("Enter second number:");
		int x2 = scan.nextInt();
		
		System.out.println("Enter Third number:");		
		int x3 = scan.nextInt();
		
		System.out.println("Enter Fourth number:");
		int x4 = scan.nextInt();
		
		System.out.println("Enter Fifth number:");
		int x5 = scan.nextInt();
		
		System.out.println("Enter Sixth number:");
		int x6 = scan.nextInt();
		
		
		int p= s.sum(x1,x2);
	    int q =s.sub(p,x3);
	    int r = s.mul(q,x4);
	    int t = s.sum(r,x5);
	    int u = s.div(t,x6);
	    System.out.println(" Result is :"+ u);
	    
	    scan.close();		

	}

}
