package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelFiles {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User1\\Desktop\\sel.xlxs.xlsx");
		
		Workbook book =WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("LABA");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
		

	}

}
