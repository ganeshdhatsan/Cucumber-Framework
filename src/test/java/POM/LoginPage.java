package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

////////////////////////////

	public void clickMainLogin() {
		getMainLogin().click();
	}

	private void passUserName(String username) {
		getEmail().sendKeys(username);

	}

	private void passPassword(String password) {
		getPassword().sendKeys(password);
	}

	private void clickLogin() {
		getLogin().click();

	}

	private void clickLogout() {

		getLogout().click();

	}

}
