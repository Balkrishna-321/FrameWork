package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcell {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/HomeWork1.xlsx.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(2);
		
		
		// TO FETCH VALUE PRESENT IN CELL (" STRING VALUES ONLY ")
		String val = cell.getStringCellValue();
		System.out.println(val);
		
		
		// TO WRITE VALUE IN CELL (" ONLY IN WHICH DATA IS PRESENT ")
		//cell.setCellValue("Hello");
		//FileOutputStream fos = new FileOutputStream("./src/test/resources/HomeWork1.xlsx.xlsx");
		//book.write(fos);
		//book.close();
		

	}

}
