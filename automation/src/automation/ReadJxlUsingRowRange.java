package automation;
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class ReadJxlUsingRowRange {
	
	public void ReadDataFromCell(int initial_row, int end_row) throws BiffException, IOException
	{
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\TestJxl.xls");
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet s = wb.getSheet(0);
		
		int row = s.getRows();
		
		int colm = s.getColumns();
		
		for( int i=initial_row; i<end_row;i++)
		{
			for(int j=0; j<colm; j++)
			{ 
			  	Cell c1= s.getCell(j,i);	
			    System.out.println(c1.getContents());
				}
				
			}
		}
	

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		ReadJxlUsingRowRange ejxl = new ReadJxlUsingRowRange();
		
		ejxl.ReadDataFromCell(2,5);
	}

}
