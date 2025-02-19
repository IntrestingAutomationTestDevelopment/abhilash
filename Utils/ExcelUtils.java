package Utils;
		import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
		import org.apache.poi.ss.usermodel.*;
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.IOException;
		public class ExcelUtils {
/*package Utils;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import java.io.IOException;
	import org.testng.Assert;
    import Utils.GetTestData;
	public class ExcelUtils {*/

		/*
		 * // DataProvider that uses Excel data
		 * 
		 * @DataProvider(name = "excelData") public Object[][] getExcelData() { try {
		 * 
		 * return ExcelUtils.getTestData(
		 * "C://Users//hp//eclipse-workspace//abhilash//src//test//resources//testData//TestData.xlsx",
		 * "Sheet1");
		 * 
		 * } catch (Exception e) { // TODO: handle exception } }
		 * 
		 * // Test method that takes data from Excel
		 * 
		 * @Test(dataProvider = "excelData") public void testLogin(String username,
		 * String password) { // Simulate a login test with the provided username and
		 * password System.out.println("Testing login with username: " + username +
		 * " and password: " + password);
		 * 
		 * // Assume some login method exists // login(username, password);
		 * 
		 * // For the purpose of this example, we'll assert the login should succeed
		 * Assert.assertTrue(username.length() > 0 && password.length() > 0,
		 * "Username and password cannot be empty!"); }
		 */
		
		    private static Workbook workbook;
		    private static Sheet sheet;

		    public static void setExcelFile(String excelPath, String sheetName) throws IOException, InvalidFormatException {
		        FileInputStream file = new FileInputStream(new File(excelPath));
		        workbook = WorkbookFactory.create(file);
		        sheet = workbook.getSheet(sheetName);
		    }

		    public static String getCellData(int rowNum, int colNum) {
		        Cell cell = sheet.getRow(rowNum).getCell(colNum);
		        return cell.toString();
		    }

		    public static int getRowCount() {
		        return sheet.getPhysicalNumberOfRows();
		    }
		}

	


