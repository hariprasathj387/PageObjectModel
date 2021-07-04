package loginObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name=\"username\"]"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name=\"password\"]"));
	}
	public static WebElement remeberMe(WebDriver driver) {
		return driver.findElement(By.className("custom-control-label"));
		
	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
	}
}
