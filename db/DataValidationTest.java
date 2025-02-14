package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class   DataValidationTest{
	 public static void main(String[] args) {
	        // Step 1: Setup WebDriver (Chrome)
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\abhilash\\src\\test\\resources\\vendor\\chrome-win32\\chrome.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://example.com");

	        // Step 2: Database connection settings
	        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
	        String username = "root";
	        String password = "password";
	        
	        // Step 3: Retrieve data from the database
	        String dbData = null;
	        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
	            String query = "SELECT data_column FROM your_table WHERE id = 1";
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(query);
	            
	            if (rs.next()) {
	                dbData = rs.getString("data_column");
	            }
	        } catch (Exception e) {
	            System.out.println("Database query failed: " + e.getMessage());
	        }
	        
	        // Step 4: Retrieve data from the web page
	        WebElement webElement = driver.findElement(By.id("data-element-id"));
	        String webData = webElement.getText();

	        // Step 5: Validate the data
	        if (dbData != null && dbData.equals(webData)) {
	            System.out.println("Data validation passed.");
	        } else {
	            System.out.println("Data validation failed.");
	        }
	        
	        // Close WebDriver
	        driver.quit();
	    }
	
}
