package automation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadLineWise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test");
		FileReader fr =new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		

	}

}
