package tek.sdet.framework.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	
	public RetailAccountPage () {
		
		
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy( id ="nameInput")
	public WebElement nameinput;
	
	
	
	@FindBy( id ="phoneNumberInput")
	public WebElement phoneinput;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement updateButton;
	
	@FindBy(id = "accountLink")
	public WebElement account;
	
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPassword;
	
	@FindBy(id="newPasswordInput")
	public WebElement newpassword;
	
	@FindBy(id ="confirmPasswordInput")
	public WebElement confirmpassword;
	
	@FindBy(id ="credentialsSubmitBtn")
	public  WebElement changepasswordBtn;
	
	@FindBy(xpath ="//p[text()='Add a payment method']")
	public WebElement addpaymentmethodlink;
	
	@FindBy(css = "#cardNumberInput")
	public  WebElement cardnumberinput;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameoncardinput;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationmonth;

	@FindBy(id = "expirationYearInput")
	public WebElement expirationyear;
	
	@FindBy(id ="securityCodeInput")
	public WebElement securitycode;
	
	@FindBy(xpath ="//button[text()='Add Your card']")
	public WebElement paymentsubmitBtn;
	
	@FindBy(css="p.account__payment__sub-text")
    public WebElement SelectedpaymentCard;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement edit;
	
	@FindBy(xpath="//input[@name='cardNumber']")
    public WebElement CardNumber;
	
	@FindBy(xpath="//input[@name='nameOnCard']")
    public WebElement NameOnCard;
    
    @FindBy(xpath="//input[@name='securityCode']")
    public WebElement SecurityCode;
	
	@FindBy(xpath= "//button[text()='Update Your Card']")
	public WebElement updatecard;
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement remove;
	
	@FindBy(xpath="//p[text()='Add Address']")
	public WebElement addAddress;
	
	@FindBy(id = "countryDropdown")
	public WebElement country;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullnameinput;
	
	@FindBy(xpath="/html/body/div/div[3]/div[2]/div/div/form/div[3]/input")
	public WebElement phoneNumber;
	
	@FindBy(id= "streetInput")
	public WebElement streetaddress;
	
	@FindBy(id ="apartmentInput")
	public WebElement apartmentinput;
	
	@FindBy(id ="cityInput")
	public WebElement cityinput;
	
	@FindBy(name = "state")
	public WebElement state;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipcodeinput;
	
	@FindBy(id="addressBtn")
	public WebElement Addaddress;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement editaddress;
	
	@FindBy(id ="addressBtn")
	public WebElement updateyouraddress;
	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement removeaddress;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
