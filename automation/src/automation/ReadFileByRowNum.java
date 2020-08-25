package automation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;



public class ReadFileByRowNum {
	
	public void ReadDataOfParticularRow(int RowNum)
	{
		 int n = RowNum; // The line number
	     try{
	       String line = Files.readAllLines(Paths.get("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test")).get(n);
	       System.out.println(line);
	     } 
	     catch(IOException e){
	       System.out.println(e);
	     }
	}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Row Number");
		int RowNum = scan.nextInt();
		
		ReadFileByRowNum  obj = new ReadFileByRowNum();
		obj.ReadDataOfParticularRow(RowNum);
		
	}

}
