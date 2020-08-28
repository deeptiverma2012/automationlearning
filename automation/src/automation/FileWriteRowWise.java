package automation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteRowWise {
	
	public void writedata(int Num1, int Num2 ) throws IOException
	{
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test2");
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(f);
		
		String s="";
		for(int i=1; i<=Num2; i++)
		{
		   if(i>=Num1 && i<=Num2 )
		   {
			  scan.hasNextLine();
		      s= scan.nextLine();
			  
		   }		   
		   pw.println(s);
		}
		System.out.println("Done");
		pw.close();	
		scan.close();
		}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		FileWriteRowWise fwr = new FileWriteRowWise();
		 
		 fwr.writedata(2,7);
		

	}

}
