package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject {

	public static WebElement email;
	
	@FindBy(xpath = "//input[@name=\"username\"]")  //input[@name=\"username\"]
	public static WebElement userNamElement;
	@FindBy(xpath = "//input[@name=\"password\"]")
	public static WebElement passwordElement;
	@FindBy(className = "custom-control-label")
	public static WebElement rememberElement;
	@FindBy(xpath = "//*[@id=\"loginfrm\"]/button")   //*[@id=\"loginfrm\"]/button
	public static WebElement submitElement;
}


