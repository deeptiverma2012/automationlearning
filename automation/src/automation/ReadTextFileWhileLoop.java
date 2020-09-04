package automation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFileWhileLoop {
	
	public void ReadParticularData(int row) throws IOException
	{
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test3");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		int Counter = 0;
		
		while((s= br.readLine())!=null)
		{
			Counter= Counter+1;
			if(Counter==row)
			{
				System.out.println(s);
				break;
			}			
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Row Number:" );		
		int rNum = scan.nextInt();
		
		
		ReadTextFileWhileLoop rtf = new ReadTextFileWhileLoop();
		rtf.ReadParticularData(rNum);
		

	}

}
