package webdriverprojects;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import 	org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import net.bytebuddy.asm.Advice.Return;

public class ExcelLibrary {

	public void getExceldata(String Sheetname,int rowNum,int cellNum)  {
		
		
		
		try {
			FileInputStream fis=new FileInputStream("D:\\software testing\\Data.xlsx");

		Workbook wb=WorkbookFactory.create(fis);
	Sheet s=wb.getSheet("Sheetname");
	Row r=s.getRow(rowNum);
Cell c=r.getCell(cellNum);
String retString=c.getStringCellValue();

	
	
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	Return retvalue;
	private String String retString;
}
