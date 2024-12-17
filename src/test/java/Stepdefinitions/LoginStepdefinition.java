package Stepdefinitions;

import java.io.IOException;

import PageObjectManager.PageManager;
import Utilities.TestUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition extends TestUtilities{
	
	@Given("I launch browser")
	public void iLaunchBrowser() throws IOException {
	   launchBrowser(getProperty("browserName"));
	}
	@Given("I launch url")
	public void iLaunchUrl() throws IOException {
	    launchUrl(getProperty("url"));
	}
	@When("I click main login button")
	public void iClickMainLoginButton() {
		
	}
	@When("I enter email {string}")
	public void iEnterEmail(String string) {
		
	}
	@When("I enter password {string}")
	public void iEnterPassword(String string) {
	    
	}
	@When("I click login")
	public void iClickLogin() {
	    
	}
	@Then("I click logout")
	public void iClickLogout() {
	    
	}

	
}
