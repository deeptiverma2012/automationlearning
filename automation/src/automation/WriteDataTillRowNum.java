package automation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteDataTillRowNum {
	
	public void writedata(int Num ) throws IOException
	{
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test3");
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(f);
		
		String s="";
		for(int i=1; i<=Num; i++)
		{	 
			scan.hasNextLine();
		    s= scan.nextLine();		  		   
		    pw.println(s);
		}
		System.out.println("Done");
		pw.close();	
		scan.close();
		}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		WriteDataTillRowNum fwr = new WriteDataTillRowNum();
		 
		 fwr.writedata(3);
		

	}

}
