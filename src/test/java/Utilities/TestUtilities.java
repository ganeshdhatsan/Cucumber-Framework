package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestUtilities {

	public static WebDriver driver;

	public WebDriver launchBrowser(String browser) {
		switch (browser.toUpperCase()) {
		case "CHROME":
			return new ChromeDriver();
		case "EDGE":
			return new EdgeDriver();
		case "SAFARI":
			return new SafariDriver();
		case "FIREFOX":
			return new FirefoxDriver();
		default:
			throw new IllegalArgumentException("Inva;id Browser Name :" + browser);
		}
	}

	public void launchUrl(String url) {
		driver.get(null);
	}
	
	public String getProperty(String key) throws IOException {
		String path =System.getProperty("user.dir")+"\\credentials.properties";
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(path)));
		 return prop.get(key).toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
