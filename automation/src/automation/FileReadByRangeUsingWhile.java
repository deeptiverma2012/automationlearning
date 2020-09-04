package automation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadByRangeUsingWhile {
	
	public void ReadParticularData(int initial_row,int end_row ) throws IOException
	{
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test3");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		int Counter = 0;
		
		while((s= br.readLine())!=null)
		{
			Counter= Counter+1;
			if(Counter>=initial_row && Counter<=end_row)
			{
				System.out.println(s);
				
			}			
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter initial row Number:" );		
		int rIniitial = scan.nextInt();
		
		System.out.println("Please enter end row Number:" );		
		int rEnd = scan.nextInt();
		
		
		FileReadByRangeUsingWhile rtf = new FileReadByRangeUsingWhile();
		rtf.ReadParticularData(rIniitial, rEnd);
		

	}

}
