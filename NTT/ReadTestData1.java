package NTT;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//public class ReadTestData1 {
	/*
	 * public static List<TestData> readTestData(String filePath, String sheetName)
	 * { List<TestData> testDataList = new ArrayList<>();
	 * 
	 * try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook =
	 * new HSSFWorkbook(fis)) {
	 * 
	 * Sheet sheet = workbook.getSheet(sheetName);
	 * 
	 * // Start reading from row 1 (assuming row 0 contains headers) for (int i = 1;
	 * i <= sheet.getLastRowNum(); i++) { Row row = sheet.getRow(i);
	 * 
	 * if (row != null) { TestData data = new TestData();
	 * 
	 * // Assuming column 0 is 'Username' and column 1 is 'Password'
	 * data.setUsername(row.getCell(0).getStringCellValue());
	 * data.setPassword(row.getCell(1).getStringCellValue());
	 * 
	 * testDataList.add(data); } } } catch (IOException e) { e.printStackTrace(); }
	 * 
	 * return testDataList; }
	 */
import org.testng.annotations.Test;

import com.automation.utils.ExcelUtils;

import java.io.IOException;
//extends BaseTest
public class ReadTestData1 {
	@Test
	public void readExcelTest() throws IOException {
		String filePath = "src/test/resources/TestData.xlsx";
		String sheetName = "Sheet1";

		/*
		 * // Load the Excel file ExcelUtils.setExcelFile(filePath, sheetName);
		 * 
		 * // Read data from row 1, column 0 String username = ExcelUtils.getCellData(1,
		 * 0); String password = ExcelUtils.getCellData(1, 1);
		 * 
		 * System.out.println("Username: " + username); System.out.println("Password: "
		 * + password);
		 */
	}
}

//}
