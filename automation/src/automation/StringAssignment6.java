package automation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringAssignment6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test");
		
		FileReader fr = new FileReader(f);
		
		
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		
		int Counter= 0;
		int count = 0;
		int charCount =0;
		
		while((s= br.readLine())!= null)
		{
			Counter++;
			
			String[] str = s.split(" ");
			
			count = count+str.length;
			
			charCount = charCount+s.length();
		}
		System.out.println("The Number of Lines in the File is:"+Counter);
		
		System.out.println("Number of lines in the file are:"+count);
		
		System.out.println("Character count is:"+ charCount);
	
	}

}
