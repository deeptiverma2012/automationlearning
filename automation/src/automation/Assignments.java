package automation;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignments obj = new Assignments();
		//Assignment 1
		int add = obj.sum(10, 2);
		int add1 = obj.sum(add, 2);
		int subtr = obj.sub(add1, 2);
		int div1 = obj.div(2, 2);
		int result = obj.mul(subtr,div1);
		System.out.println(result);
		
		//Assignment 2
		
		int subtr1 = obj.sub(10, 2);
		int add2 = obj.sum(subtr1,2);
		int subtr2 = obj.sub(add2,2);
		int mul = obj.mul(subtr2, 2);
		int result1 = obj.div(mul, 2);
		System.out.println(result1);		

		
	}
	
	public int sum(int a, int b)
	{
		int c; 
		c = a+b;			
		return c;
	}
	
	public int sub(int s, int t)
	{
		int u;
		u = s-t;
		return u;
		
	}
	public int mul(int x, int y)
	{
		int z;
		z = x*y;
		return z;
		
	}
	
	public int div(int p, int q)
	{
		int r;
		r = p/q;
		return r;
	}
}
