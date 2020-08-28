package automation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\Test1");
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("I am Writing in a file");
		bw.newLine();
		
		bw.write("I am in second line");
		bw.newLine();
		
		bw.close();

	}

}
