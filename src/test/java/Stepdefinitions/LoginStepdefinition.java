package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition {
	WebDriver driver;
	@Given("I launch browser")
	public void iLaunchBrowser() {
	     driver = new ChromeDriver();
	}
	@When("I launch URL and verify title")
	public void iLaunchURLAndVerifyTitle() {
	    driver.get("https://www.facebook.com/");
	}
	@When("I enter username {string}")
	public void iEnterUsername(String string) {
	   driver.findElement(By.id("email")).sendKeys(string);
	}
	@When("I enter password {string}")
	public void iEnterPassword(String string) {
		driver.findElement(By.id("pass")).sendKeys(string);   
	}
	
	@When("I click login button")
	public void iClickLoginButton() {
		driver.findElement(By.name("login")).click(); 
	}
//	@Then("I verify welcome message {string}")
//	public void iVerifyWelcomeMessage(String string) {
//		driver.findElement(By.name("login")).click(); 
//	}
}
