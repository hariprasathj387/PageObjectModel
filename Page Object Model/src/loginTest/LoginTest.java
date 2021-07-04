package loginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import loginObject.Login;
import loginObject.ProfileTest;
import loginObject.ProfileUpdate;

public class LoginTest {
	WebDriver driver;

	@Test
	void driverSetup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:program Files//selenium//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.phptravels.net/login");

		Login.username(driver).sendKeys("user@phptravels.com");
		Login.password(driver).sendKeys("demouser");
		Login.remeberMe(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.submit(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		ProfileTest.myProfile(driver).click();

		/*
		 * FirstName Field is Disabled driver.manage().timeouts().implicitlyWait(10,
		 * TimeUnit.SECONDS); ProfileTest.firstname(driver).click();
		 * ProfileTest.firstname(driver).clear();
		 * ProfileTest.firstname(driver).sendKeys("Hari");
		 */
		/*
		 * LastName Field is Disabled driver.manage().timeouts().implicitlyWait(10,
		 * TimeUnit.SECONDS); ProfileTest.lastName(driver).clear();
		 * ProfileTest.lastName(driver).sendKeys("prasath");
		 */driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ProfileTest.email(driver).clear();
		ProfileTest.email(driver).sendKeys("hariprasathj208@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ProfileTest.password(driver).sendKeys("Car123456");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ProfileTest.confirmPassWord(driver).sendKeys("Car123456");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ProfileTest.address1(driver).clear();
		ProfileTest.address1(driver).sendKeys("57/27,GoundamPalayam Street,Puliyur,KArur-639114");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ProfileTest.address2(driver).sendKeys("2/2,Selvanagar Strret,puliyur,karur-639114");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ProfileTest.city(driver).sendKeys("Karur");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ProfileTest.state(driver).sendKeys("tamilnadu");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ProfileTest.country(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ProfileTest.countrySelection(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ProfileTest.mobileNumber(driver).clear();
		ProfileTest.mobileNumber(driver).sendKeys("8825573590");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		ProfileTest.submit(driver).submit();
		Thread.sleep(9000);
		driver.close();
	}

}
