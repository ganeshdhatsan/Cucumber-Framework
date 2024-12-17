package PageObjectManager;

import POM.LoginPage;

public class PageManager {

	public static PageManager pageManager;
	
	private LoginPage loginPage;

	private PageManager() {
		loginPage = new LoginPage();
	}

	public static PageManager getInstance() {
		return (pageManager == null) ? new PageManager() : pageManager;
	}

	
}
