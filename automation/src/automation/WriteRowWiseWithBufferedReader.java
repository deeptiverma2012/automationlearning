package automation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteRowWiseWithBufferedReader {
	
	
	public void ReadFileTillRow(int rowNum, String data1) throws IOException
	{
		
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test3");
		
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		int Counter =0;
		while(Counter<=rowNum)
		{
			bw.write(data1);
			bw.newLine();			
			Counter=Counter+1;
		}
				
		bw.close();		
				
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
			
		
        System.out.println("Please Enter Data:");
		
		String data = scan.nextLine();
		
        System.out.println("Please Enter Row No:");
		
		int rNum = scan.nextInt();
		
		WriteRowWiseWithBufferedReader wrb = new WriteRowWiseWithBufferedReader();
		
		
		wrb.ReadFileTillRow(rNum, data);
		
		scan.close();
		
		
		
		
		
		
		
	
		

	}

}
