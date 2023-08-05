package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefenition extends TestBase {

	LoginPage loginpage;

	@Before
	 public void setup() {
		
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	
	
	@Given("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
		
		driver.get("https://techfios.com/billing/?ng=admin");
	}

	@When("^User enters username as  \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		

		loginpage.enterUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginpage.enterPassword(password);

	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() {
		loginpage.clickSignInButton();
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		String expextedTitle = "Dashboard- iBilling";
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals("Page not Foind!!", expextedTitle, actualTitle);
	}

	@After
	public void  tearDown() {
		
		driver.close();
		driver.quit();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
