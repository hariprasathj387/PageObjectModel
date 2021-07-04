package loginObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileTest {

	public static WebElement myProfile(WebDriver driver) {
		return driver.findElement(By.xpath("//div//a[@href=\"#profile\"]"));
	}

	public static WebElement firstname(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div/div[1]/div[1]/div/input"));
	}

	public static WebElement lastName(WebDriver driver) {
		return driver.findElement(By.name("lastname"));
	}

	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type=\"email\"and@name=\"email\"]"));
	}

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type=\"password\"and@name=\"password\"]"));
	}

	public static WebElement confirmPassWord(WebDriver driver) {
		return driver.findElement(By.name("confirmpassword"));
	}

	public static WebElement address1(WebDriver driver) {
		return driver.findElement(By.name("address1"));
	}

	public static WebElement address2(WebDriver driver) {
		return driver.findElement(By.name("address2"));
	}

	public static WebElement city(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class=\"form-group\"]/input[@name=\"city\"]"));
	}

	public static WebElement state(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='text'and @name=\"state\"]"));
	}

	public static WebElement region(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='chosen-container chosen-container-single']/a"));
	}

	public static WebElement country(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div/div[4]/div[2]/div/div[2]/a/span"));

	}

	public static WebElement countrySelection(WebDriver driver) {
		String countryString="Inida";
		List<WebElement> allcountries =driver.findElements(By.xpath("//*[@id=\"profilefrm\"]/div/div/div[4]/div[2]/div/div[2]/div/div/input"));
		 for(WebElement countries:allcountries) {
			 if(countries.equals(countryString)) {
				 countries.click();
				 break;
			 }
		 }
		 System.out.println(allcountries);
		return null;
	}

	public static WebElement mobileNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='phone']"));
	}

	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='oldemail']//following::button[1]"));
	}

}
