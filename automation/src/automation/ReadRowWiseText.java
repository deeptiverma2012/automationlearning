package automation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadRowWiseText {
	
	public void ReadRowWiseData(int Num) throws IOException
	{
		
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test");
		FileReader fr = new FileReader(f);
			
		BufferedReader br = new BufferedReader(fr);
		
		String S = "";
		for(int i=0; i<5; ++i)
		{	
			if(i==Num)
			{
			  S= br.readLine();				
			}
			else
			{
				br.readLine();
			}	
					
		}
		  System.out.println(S);				
	}

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Row Number");
		int RowNum = scan.nextInt();
		
		ReadRowWiseText rwst = new ReadRowWiseText();
		rwst.ReadRowWiseData(RowNum);	
		

	}
	

}
