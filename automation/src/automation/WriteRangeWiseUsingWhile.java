package automation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteRangeWiseUsingWhile {	
	
	public void ReadFileTillRow(int initialRowNum,int endRowNum,  String data1) throws IOException
	{
		
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test5");
		
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		int Counter=initialRowNum;
		
		while(Counter<=endRowNum)
		{ 
			 
			if(Counter>=initialRowNum && Counter<=endRowNum)
			{				
				bw.write(data1);				
				bw.newLine();	
				Counter=Counter+1;			
			}
		}
		bw.close();
		}	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);			
		
        System.out.println("Please Enter Data:");
		
		String data = scan.nextLine();
		
        System.out.println("Please Enter start Row No:");
		
		int rNum = scan.nextInt();
		
		System.out.println("Please Enter end Row No:");
		
		int rNum1 = scan.nextInt();		
		
		WriteRangeWiseUsingWhile wrb = new WriteRangeWiseUsingWhile();		
		
		wrb.ReadFileTillRow(rNum,rNum1, data);
		
		scan.close();
		
		
		
		
		
		
		
	
		

	}

}
