package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUtilities {
	
	WebDriver driver;
	
	//To identify the dynamic values
	// locators = > id name xpath
	// String text
	
	private void findMethod() {
		WebElement element = driver.findElement(By.id("email"));
	}
//stage 1
	
	private void findMethod1(String text) {
		WebElement element = driver.findElement(By.id(text));
	}
//stage 2	
	private WebElement findMethod2(String text) {
		WebElement element = driver.findElement(By.id(text));
		return element;
	}
//stage 3(Real time)
	private WebElement findMethod3(String text) {
		return driver.findElement(By.id(text));
	}
//stage 4	
	private void textBoxValue(String locator,String textValue) {
		findMethod3(locator).sendKeys(textValue);
	}
	
	private void textBoxValue(WebElement element,String textValue) {
		element.sendKeys(textValue);
	}
	
	private void click(WebElement element) {
		element.click();
	}
	

}
