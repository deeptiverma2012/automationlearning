package automation;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadJxlFile {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\TestJxl.xls");
		
		Workbook wb = Workbook.getWorkbook(f);// This method getWorkbook(), will return object of the class Workbook
		
		Sheet ws = wb.getSheet(0); // Create an object of sheet using workbook class object
		
		int r = ws.getRows(); // It will return the no. of rows in the sheet
		
		System.out.println("No of rows is:"+ r);
		
		int c = ws.getColumns();// It will return the no. of columns in the sheet
		
		System.out.println("No of columns is:"+ c);
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c;j++)
			{
				Cell c1= ws.getCell(j,i);
				
				System.out.println(c1.getContents());
			}
			
		}
		
		
		
		

	}

}
