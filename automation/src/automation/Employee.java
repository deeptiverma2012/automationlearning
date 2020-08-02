package automation;

public class Employee {
	
	public void emp() {
		this.emp(10,20,30);
		System.out.println("Default Method");
		this.emp(10);
		this.emp(10,20);
		this.emp(10,20,30,40);
	}
	public void emp(int a) {
		System.out.println("One parameterized Method");
	}
	public void emp(int a , int b) {
		System.out.println("Two parameterized Method");
	}
	public void emp(int a, int b, int c) {
		System.out.println("Three parameterized Method");
	}
	public void emp(int a, int b, int c, int d) {
		System.out.println("Four parameterized Method");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee();
		em.emp();
		

	}

}
