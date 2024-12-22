package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectManager.PageManager;
import Utilities.TestUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition extends TestUtilities {

	@Given("I launch browser")
	public void iLaunchBrowser() {
		launchBrowser(getProperty("browserName"));
	}

	@Given("I launch url")
	public void iLaunchUrl() {
		launchUrl(getProperty("url"));
	}

	@When("I click main login button")
	public void iClickMainLoginButton() {
		PageManager.getInstance().getLoginPage().clickMainLogin();
	}

	@When("I enter email")
	public void iEnterEmail() {
		PageManager.getInstance().getLoginPage().passUserName(getProperty("username"));
	}

	@When("I enter password")
	public void iEnterPassword() {
		PageManager.getInstance().getLoginPage().passPassword(getProperty("password"));
		System.out.println("password entered");
	}

	@When("I click login")
	public void iClickLogin() {
		PageManager.getInstance().getLoginPage().clickLogin();
		System.out.println("login clicked");
		unHandledSimpleAlert(20);
		System.out.println("Alert handled");
		staticWait(2000);
		PageManager.getInstance().getLoginPage().passValueSearchBox("books");
		PageManager.getInstance().getLoginPage().clickLogin();
	}

	@Then("I click logout")
	public void iClickLogout() {
		staticWait(2000);
//		PageManager.getInstance().getLoginPage().clickLogout();
	}
	
	@When("I enter {string} email")
	public void iEnterEmail(String username) {
	   PageManager.getInstance().getLoginPage().passUserName(username);
	}
	@When("I enter {string} password")
	public void iEnterPassword(String password) {
		PageManager.getInstance().getLoginPage().passPassword(password); 
	}


}
