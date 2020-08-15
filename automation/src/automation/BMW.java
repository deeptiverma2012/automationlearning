package automation;

public class BMW implements Cars{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b = new BMW();
		b.Model();
		b.Engine();
		b.Wheels();		
		b.ad_ins();

	}

	@Override
	public void Model()
	{
		System.out.println("Model No. is BMW12345");
		
	}

	@Override
	public void Wheels() {
		System.out.println("Four wheels+ 1 backup tyre");
		
	}

	@Override
	public void Engine() {
		System.out.println("Diesel engine 1800cc");
		
	}

	public void ad_ins()
	{
		System.out.println("BMW Tools Kit & Rear view Camera");
	}
	
}
