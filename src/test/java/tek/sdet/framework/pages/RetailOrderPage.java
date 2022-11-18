package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		
		PageFactory.initElements(getDriver(), this);
		
	}
	
	
	@FindBy(id = "signinLink")
	public  WebElement signin ;
	
	@FindBy(id = "email")
	public  WebElement emailField ;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginButton;
	
	@FindBy(id= "orderLink")
	public WebElement orderlink;
	
	@FindBy(xpath="//p[text()='Show Details']")
	public WebElement showdetails;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelBtn;
	
	@FindBy(id="reasonInput")
	public WebElement reasonInput;
	
	@FindBy(id ="orderSubmitBtn")
	public WebElement cancelorder;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderHasBeenCancelled;
	
	@FindBy(id="returnBtn")
	public WebElement returnbtn;
	
	@FindBy(id ="reasonInput")
	public WebElement inputreason;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOfInput;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnButton;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement yourOrderReturn;
	
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
    public WebElement Msg;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
