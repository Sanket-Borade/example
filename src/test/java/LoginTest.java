import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbancompany.com/in/");
		driver.manage().deleteAllCookies();
	}

	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("amar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sameanskad");
		driver.findElement(By.id("liginButton")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}