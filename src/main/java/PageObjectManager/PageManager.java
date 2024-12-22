package PageObjectManager;

import POM.LoginPage;

public class PageManager {

	private static PageManager pageManager;
	
	private LoginPage loginPage;
	
	public LoginPage getLoginPage(){
		return loginPage;
	}
	
	private PageManager() {
		loginPage = new LoginPage();
	}

	public static PageManager getInstance() {
		return (pageManager == null) ? new PageManager() : pageManager;
	}

	
}
