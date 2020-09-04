package automation;
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class GetJxlDataByRowNum {
	
	public void ReadDataFromCell(int r) throws BiffException, IOException
	{
		File f = new File("C:\\Users\\Ashish\\git\\Javaautorepo\\automation\\TestJxl.xls");
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet s = wb.getSheet(0);
		
		int row = s.getRows();
		
		int colm = s.getColumns();
		
		for( int i=0; i<row;i++)
		{
			for(int j=0; j<colm; j++)
			{ 
				Cell c1= s.getCell(j,i);
				 if(r==i)
				{
					System.out.println(c1.getContents());
				}
				
			}
		}
	}

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		GetJxlDataByRowNum ejxl = new GetJxlDataByRowNum();
		
		ejxl.ReadDataFromCell(3);
	}

}
