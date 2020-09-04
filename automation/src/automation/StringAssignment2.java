package automation;

public class StringAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer str = new StringBuffer("My Name is Deepak");
				
		str.replace(0, 2, "Deepak");
		
		
		//System.out.println(str);
		
		str.replace(7, 11, "is");
		//System.out.println(str);
		
		str.replace(10, 12, "name");
		
		//System.out.println(str);
		
		str.replace(15, 21, "My");
		System.out.println(str);
		
		 
	}

}
