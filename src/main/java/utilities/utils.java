package utilities;

import org.openqa.selenium.JavascriptExecutor;

import pompages.phonepage;
import stepdefinition_addTocart.addTocart;

public class utils {
	
	phonepage pp= new phonepage(addTocart.driver);
	public void scroll() {
		JavascriptExecutor js= (JavascriptExecutor) addTocart.driver;
		int x= pp.iphone.getLocation().getX();
		int y= pp.iphone.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
}
