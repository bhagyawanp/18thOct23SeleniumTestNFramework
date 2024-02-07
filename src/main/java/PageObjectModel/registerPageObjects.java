package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPageObjects {
	
	public WebDriver driver;  //This driver is null
	
	
	private By Register = By.xpath("//a[@class='ico-register']");
	private By Gender = By.xpath("//input[@value='M']");
	private By FirstName = By.xpath("//input[@id='FirstName']");
	private By LastName = By.xpath("//input[@id='LastName']");
	private By Email = By.xpath("//input[@id='Email']");
	private By Password = By.xpath("//input[@id='Password']");
	private By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	private By RegisterButton = By.xpath("//input[@id='register-button']");
	private By registertionCompletedText= By.xpath("//div[@class='result']");
    private By invalidEmailText=By.xpath("//span[@for='Email']");
	
	
	
	public registerPageObjects(WebDriver driver) {
		this.driver=driver;	
	}
	
	

	public WebElement clickOnRegister() {
		return driver.findElement(Register);
	}
	
	public WebElement selectGender() {
		return driver.findElement(Gender);
	}
	
	public WebElement enterFirstName() {
		return driver.findElement(FirstName);
	}
	
	
	public WebElement enterLastName() {
		return driver.findElement( LastName);
	}
	
	
	public WebElement enterEmail() {
		return driver.findElement(Email );
	}
	
	
	public WebElement enterPassword() {
		return driver.findElement(Password);
	}
	

	public WebElement enterConfrimPassword() {
		return driver.findElement(ConfirmPassword);
	}
	
	public WebElement clickOnsubmit() {
		return driver.findElement(RegisterButton);
	}
	
	
	public WebElement successText() {
		return driver.findElement(registertionCompletedText);
	}
	
	public WebElement invalidEmailText() {
		return driver.findElement(invalidEmailText);
	}
	
	
	
	
	
	

}

