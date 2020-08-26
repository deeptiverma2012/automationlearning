package automation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class ReadingFileByRange {
	
	public void ReadRowWiseData(int Num1, int Num2) throws IOException
	{		
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test");
		FileReader fr = new FileReader(f);
			
		LineNumberReader lineReader = new LineNumberReader(fr);
		String S;
		
		while((S =lineReader.readLine())!=null)
		{	
			//System.out.println(S);
			int LineNum = lineReader.getLineNumber();
			if(LineNum>=Num1 && LineNum<=Num2)
			{
				System.out.println(LineNum+":" +S);
			}
					
			}			
	}
		 
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Larger Number for Range:");
		int RowNum1 = scan.nextInt();
		
		System.out.println("Please Enter a Smaller Number for Range:");
		int RowNum2 = scan.nextInt();
		
		
		ReadingFileByRange rwst = new ReadingFileByRange();
		rwst.ReadRowWiseData(RowNum2,RowNum1);	
		

	}
	

}
