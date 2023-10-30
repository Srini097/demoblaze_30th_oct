package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {

	@FindBy(xpath="//a[text()='Phones']")
	public WebElement phone;
	
	public dashboard(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void phone() {
		phone.click();
	}
}
