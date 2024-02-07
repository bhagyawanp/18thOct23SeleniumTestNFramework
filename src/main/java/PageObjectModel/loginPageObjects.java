package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {

	
	public WebDriver driver;
	
	private By logIn = By.xpath("//[@href='/login']");
	private By Email = By.xpath("//input[@id='Email']");
	private By Password = By.xpath("//input[@id='Password']");
	private By RememberMe = By.xpath("//input[@id='RememberMe']");
	private By ForgotPassword = By.xpath("//a[contains(text(),'Forgot password?')]");
	private By LogInButton = By.xpath("//input[@value='Log in']");
	private By LogOut=By.xpath("//a[@href='/logout']");
	private By invalidCredientials=By.xpath("//div[@class='validation-summary-errors']/span");


	public loginPageObjects(WebDriver driver) {
		
		this.driver=driver;
	}


	public WebElement clickOnlogIn() {
		return driver.findElement(logIn);
	}
	
	public WebElement enterEmail() {
		return driver.findElement(Email);
	}
	
	
	public WebElement enterPassword() {
		return driver.findElement(Password);
	}
	
	
	public WebElement clickSubmit() {
		return driver.findElement(LogInButton);
	}
	
	
	public WebElement logOutText() {
		return driver.findElement(LogOut);
	}
	
	
	public WebElement  invalidCredientialsText() {
		return driver.findElement(invalidCredientials);
	}
	
	
	
	
	
	
	
	
	
	
	
}
