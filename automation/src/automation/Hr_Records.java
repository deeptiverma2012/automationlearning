package automation;

public class Hr_Records extends Employee_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hr_Records hr = new Hr_Records();
		hr.Personal_Details();
		hr.Academic_Details();	
		hr.Salary_Pkg();		
		hr.PF_Type();		

	}
	//Overriden method
	public String Personal_Details()
	{
		String Name = "Deepti";
		System.out.println(Name);
		return Name;
	}

	//Overriden method
	public String Academic_Details() {
		String Qualification ="MTech";
		System.out.println(Qualification);
		return Qualification;
	}

	//Overriden method
	public int  Salary_Pkg()
	{
		int Package = 1200000;
		System.out.println(Package);
		return Package;
	}
	
	public void  PF_Type()
	{
		System.out.println("Type 1");
		
	}
}
