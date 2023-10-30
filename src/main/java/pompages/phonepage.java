package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class phonepage {

	@FindBy(xpath="//a[text()='Iphone 6 32gb']")
	public WebElement iphone;
	
	public phonepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void phone() {
		iphone.click();
	}

	public WebElement getIphone() {
		return iphone;
	}
}
