package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productCartPageObjects {

	public WebDriver driver;
	
	
	
	
	private By searchItem= By.xpath("//input[@id='small-searchterms']");
	private By searchButton = By.xpath("//input[@value='Search']");
	private By product= By.xpath("//h2[@class='product-title']/a");
	private By price = By.xpath("//span[@class='price actual-price']");
	private By cart = By.xpath("//input[@value='Add to cart']");
	
	
	
	
	
	public productCartPageObjects(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement searchItem() {
		return driver.findElement(searchItem);
	}
	
	public WebElement clickOnSearch() {
		return driver.findElement( searchButton);
	}
	
	public List<WebElement> chooseProduct() {
		return driver.findElements(product);
	}
	
	public List<WebElement> choosePrice() {
		return driver.findElements(price );
	}
	
	
	public List<WebElement> addToCart() {
		return driver.findElements(cart);
	}
	
	
	
	
	
	
}
