package db;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	import java.sql.ResultSet;

	public class FormSubmissionTest {
	    public static void main(String[] args) {
	        // Step 1: Setup WebDriver (Chrome)
	        System.setProperty("webdriver.chrome.driver", "C://Users//hp//eclipse-workspace//abhilash//src//test//resources//vendor//chrome-win32//chrome.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://testsairaghava.free.beeceptor.com");

	        // Step 2: Fill out the form
	        WebElement nameField = driver.findElement(By.id("name"));
	        WebElement emailField = driver.findElement(By.id("email"));
	        WebElement submitButton = driver.findElement(By.id("submit"));

	        nameField.sendKeys("John Doe");
	        emailField.sendKeys("john.doe@example.com");

	        // Step 3: Submit the form
	        submitButton.click();

	        // Step 4: Wait for page to load (you can use WebDriverWait for better synchronization)
	        try {
	            Thread.sleep(2000); // Just for demo; use WebDriverWait in real tests
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Step 5: Verify database insertion
	        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
	        String username = "root";
	        String password = "password";
	        
	        boolean isInserted = false;
	        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
	            String query = "SELECT * FROM users WHERE name = 'John Doe' AND email = 'john.doe@example.com'";
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(query);
	            
	            if (rs.next()) {
	                isInserted = true;
	            }
	        } catch (Exception e) {
	            System.out.println("Database query failed: " + e.getMessage());
	        }

	        // Step 6: Validation
	        if (isInserted) {
	            System.out.println("Form submission and database insert successful.");
	        } else {
	            System.out.println("Database insert failed.");
	        }

	        // Close WebDriver
	        driver.quit();
	    }
	}


