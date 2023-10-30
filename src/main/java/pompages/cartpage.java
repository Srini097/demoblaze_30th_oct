package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {

	@FindBy(id="more-information")
	public WebElement description;
	
	@FindBy(xpath="//a[text()='Add to cart']")
	public WebElement cart;
	
	public cartpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String description() {
		return description.getText();
	}
	
	public void cart() {
		cart.click();
	}
	
	
}
