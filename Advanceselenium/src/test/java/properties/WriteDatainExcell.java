package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatainExcell {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("C:\\Users\\User1\\Desktop\\sel.xlxs.xlsx");
		
		 Workbook book = WorkbookFactory.create(fis);
		 
		 Sheet sheet = book.getSheet("Sheet1");
		 
		 Row row = sheet.getRow(9);
		 Cell cel = row.getCell(9);
		 
		 
		 cel.setCellValue("hahahaha");
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\User1\\Desktop\\sel.xlxs.xlsx");
		 book.write(fos);
		 book.close();
		 
		 
		
		  
		
		

	}

}
