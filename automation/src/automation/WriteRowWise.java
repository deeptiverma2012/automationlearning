package automation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteRowWise {
	
	public void writedata() throws IOException
	{
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test2");
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(f);
		
		while(scan.hasNextLine())
		{
			String s= scan.nextLine();
			pw.println(s);
				
		}
		System.out.println("Done");
		pw.close();	
		scan.close();
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		WriteRowWise wrw = new  WriteRowWise();
		wrw.writedata();
		
		
	
		
		
	}

}
