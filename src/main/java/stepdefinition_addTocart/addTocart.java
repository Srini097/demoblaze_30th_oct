package stepdefinition_addTocart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pompages.cartpage;
import pompages.dashboard;
import pompages.phonepage;
import utilities.utils;

public class addTocart {

	public static WebDriver driver;
	public dashboard db;
	public utils u;
	public phonepage pp;
	public cartpage cp;
	@Before
	public void setup() {
		System.out.println("setup the chrome browser");
	}
	
	@Given("open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium chromedriver\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@When("enter the url {string}")
	public void enter_the_url(String url) {
	    driver.get(url);
	}

	@When("click on phone option")
	public void click_on_phone_option() {
	    dashboard db= new dashboard(driver);
	    db.phone();
	}

	@When("click on iPhone16")
	public void click_on_i_phone16() {
		u= new utils();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    u.scroll();
	    pp= new phonepage(driver);
	    pp.phone();
	}

	@Then("user is in add to cart page")
	public void user_is_in_add_to_cart_page() {
		cp= new cartpage(driver);
	   String ss=cp.description();
	  System.out.println( ss.contains("8-megapixel primary camera"));
	}

	@Then("user click on ADD to CART")
	public void user_click_on_add_to_cart() {
	    cp = new cartpage(driver);
	    cp.cart();
	}

	@After
	public void teardown() {
		driver.quit();
	}
}
