package automation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// This will read data character by character
		
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test");
		FileReader fr =new FileReader(f);
				
		int a;
		while((a= fr.read())!=-1)
		{
			System.out.println((char)a);
		}

	}

}
