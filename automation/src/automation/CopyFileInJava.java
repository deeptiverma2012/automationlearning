package automation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFileInJava {
	
	public static void copydata(File source, File destination) throws IOException
	{
		Files.copy(source.toPath(), destination.toPath());
	}

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
	File source = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test3");
	File destination = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test4");
		
	long start = System.nanoTime();
	copydata(source, destination);
		
	System.out.println("Time taken to copy file ="+ (System.nanoTime()-start));
	}

}
