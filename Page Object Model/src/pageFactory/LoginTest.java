package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class LoginTest {
	WebDriver driver;

	@BeforeSuite
	void driverSetup() {
		System.setProperty("webdriver.chrome.driver", "C:program Files\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	void testExecute() {
		
		PageFactory.initElements(driver, LoginObject.class);
		LoginObject.userNamElement.sendKeys("user@phptravels.com");
		LoginObject.passwordElement.sendKeys("demouser");
		LoginObject.rememberElement.click();
		LoginObject.submitElement.click();

		/***
		 * important interview question** 1).How to Without findElement
		 * 
		 * public static WebElement email; LoginObject.email.sendKeys("hii"); this
		 * method only acces the id and name...
		 */
	}

	@AfterSuite
	void driverCLose() {
		driver.close();
	}

}
