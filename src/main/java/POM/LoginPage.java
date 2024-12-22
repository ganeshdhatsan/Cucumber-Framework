package POM;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.TestUtilities;

public class LoginPage extends TestUtilities {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Log in")
	private WebElement mainLogin;

	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement login;

	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchBox;

	@FindBy(className = "ico-logout")
	private WebElement logout;

	public WebElement getMainLogin() {
		return mainLogin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
////////////////////////////

	public void clickMainLogin() {
		getMainLogin().click();
	}

	public void passUserName(String username) {
		getEmail().sendKeys(username);
	}

	public void passPassword(String password) {
		getPassword().sendKeys(password);
	}

	public void clickLogin() {
		getLogin().click();
	}

	public void clickLogout() {
		getLogout().click();
	}

	public void passValueSearchBox(String text) {
		getSearchBox().sendKeys(text);

	}
}
