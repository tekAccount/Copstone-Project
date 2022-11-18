package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	
	private RetailHomePage homepage;
	private RetailSignInPage signInPage;
	private RetailAccountPage AccountPage;
	private RetailOrderPage OrderPage;
	public POMFactory() {
		
		this.homepage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
		this.AccountPage = new RetailAccountPage();
		this.OrderPage = new RetailOrderPage();
		
	}
	
	public RetailHomePage homepage() {
		return this.homepage;
	}
	
	
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	
	public RetailAccountPage AccountPage() {
		return this.AccountPage;
	}
	
	public RetailOrderPage OrderPage() {
		return this.OrderPage;
	}

}
