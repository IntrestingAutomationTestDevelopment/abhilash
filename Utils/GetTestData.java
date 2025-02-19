package Utils;


	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	public class GetTestData {
		 WebDriver driver;
		public GetTestData (WebDriver driver) {
			this.driver = driver;
		//	gtd = new GetTestData();
		}
	//	gtd.this 
	    // Method to read data from an Excel file
	    public static Object[][] getTestData(String filePath, String sheetName) throws IOException {
	        // Open the Excel file
	        FileInputStream fis = new FileInputStream(new File(filePath));
	        Workbook workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheet(sheetName);
	        
	        // Count rows and columns
	        int rows = sheet.getPhysicalNumberOfRows();
	        int cols = sheet.getRow(0).getPhysicalNumberOfCells();
	        
	        Object[][] data = new Object[rows - 1][cols]; // Skipping the header row
	        
	        // Loop through each row
	        for (int i = 1; i < rows; i++) { // Start from row 1 to skip the header
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < cols; j++) {
	                Cell cell = row.getCell(j);
	                data[i - 1][j] = cell.getStringCellValue(); // Reading as String, adapt as needed
	            }
	        }

	        workbook.close();
	        fis.close();
	        
	        return data;
	    }
	}


