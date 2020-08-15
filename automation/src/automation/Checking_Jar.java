package automation;

public class Checking_Jar {
	
	public void car()
	{
		System.out.println("Actual Project Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checking_Jar Jr = new Checking_Jar();
		Jr.car();
		
		
		
		//Class accesed through Jar
		BMW b = new BMW();
		b.Engine();
		b.Model();
		b.ad_ins();
		b.Wheels();

		
		
		
		

	}

}
