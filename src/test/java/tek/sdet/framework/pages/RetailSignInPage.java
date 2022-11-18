package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	
	public RetailSignInPage() {
		
		PageFactory.initElements(getDriver(), this);
		
	}
	

	
	@FindBy(id = "email")
	public  WebElement emailField ;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginButton;
	
	@FindBy(id="accountLink")
    public WebElement account;
	
	@FindBy(id="newAccountBtn")
    public WebElement CreateAccount;
	
	@FindBy(id="nameInput")
    public WebElement nameField;
	
	
	@FindBy(id="emailInput")
    public WebElement emailFaild;
	
	@FindBy(id="passwordInput")
    public WebElement passField;
	
	
	@FindBy(id="confirmPasswordInput")
    public WebElement confirmpasswordFiled;
	
	
	
	@FindBy(id="signupBtn")
    public WebElement signUp;

	

}
