package Acomodation.Utilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {
	public String readdata(int sheetno, int row,int column) throws IOException
	{
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/Acomodation/Testdata/Test data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet s=wb.getSheetAt(sheetno);
		String value=s.getRow(row).getCell(column).getStringCellValue();
		wb.close();
		return value;
		
		
		

		
		
	}

}
