package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage{
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		
	}
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"username\"]") WebElement userNameElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement passwordElement;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement signinButton;
	
	public void enterUserName(String userName) {
		userNameElement.sendKeys(userName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void enterPassword(String password) {

		passwordElement.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickSignInButton() {

		signinButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
