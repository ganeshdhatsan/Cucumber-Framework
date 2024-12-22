package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtilities {

	public static WebDriver driver;

	public WebDriver launchBrowser(String browser) {
		switch (browser.toUpperCase()) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;
		case "SAFARI":
			driver = new SafariDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid Browser Name :" + browser);
		}
		return driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void unHandledSimpleAlert(long timeValue) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeValue));
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        if (alert != null) {
	            alert.accept();
	        }
	    } catch (TimeoutException e) {
	        System.out.println("No alert found within " + timeValue + " seconds.");
	    }
	}
	public void unHandledConfirmAlert(long timeValue) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeValue));
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        if (alert != null) {
	            alert.dismiss();
	        }
	    } catch (TimeoutException e) {
	        System.out.println("No alert found within " + timeValue + " seconds.");
	    }
	}
	public void unHandledPromptAlert(long timeValue) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeValue));
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        if (alert != null) {
	        	alert.sendKeys(alert.getText());
	        }
	    } catch (TimeoutException e) {
	        System.out.println("No alert found within " + timeValue + " seconds.");
	    }
	}
	public void unHandledPromptAlert(String text,long timeValue) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeValue));
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        if (alert != null) {
	        	alert.sendKeys(text);
	        }
	    } catch (TimeoutException e) {
	        System.out.println("No alert found within " + timeValue + " seconds.");
	    }
	}
	public String getProperty(String key) {
		Properties prop = null;
		try {
			String path = System.getProperty("user.dir") + "//src//main//resources//credentials.properties";
			prop = new Properties();
			prop.load(new FileInputStream(new File(path)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.get(key).toString();
	}

	public void staticWait(long timeValue) {
		try {
			Thread.sleep(timeValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
