package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userISOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + "is equal to " + expectedTitle);

	}

	@When("User click on All section")
	public void userClickedOnAllSection() {
		click(factory.homepage().All);
		logger.info("User clicked on All Section successfully");
		slowDown();
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
		List<List<String>> optionsToDisplay = options.asLists(String.class);
		Assert.assertTrue(isElementDisplayed(
				getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']"))));
		logger.info("options Electronics, Computers, Smart Home, Sports and Automative are present");

	}
	
	String department;
	@When("User is on {string}")
	public String userIsOn(String department) {
		
		switch (department) {
        case "Electronics":
            Assert.assertTrue(isElementDisplayed(factory.homepage().electronics));
            logger.info("user is on Electronics section");
            break;
        case "Computers":
            Assert.assertTrue(isElementDisplayed(factory.homepage().computer));
            logger.info("user is on Computers section");
            break;
        case "Sports":
            Assert.assertTrue(isElementDisplayed(factory.homepage().Sports));
            logger.info("user is on Sports section");
            break;
        case "Automotive":
            Assert.assertTrue(isElementDisplayed(factory.homepage().Automative));
            logger.info("user is on Automotive section");
            break;
        default:
        	
		}
        	return this.department = department;
	    
	}



	   @Then("below options are present in department")
	    public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	        List<List<String>> department = dataTable.asLists();

	       switch (this.department) {
	        case "Electronics":
	            click(factory.homepage().electronics);
	            String video = getText(factory.homepage().VideoGames);
	            String TVAndVideo = getText(factory.homepage().TvAndVideo);
	            Assert.assertEquals(TVAndVideo, department.get(0).get(0));
	            Assert.assertEquals(video, department.get(0).get(1));
	            logger.info(video + " options are present in department" + TVAndVideo);
	            break;
	        case "Computers":
	            click(factory.homepage().computer);
	            String Accessories = getText(factory.homepage().Accessories);
	            String Networking = getText(factory.homepage().Networking);
	            Assert.assertEquals(Accessories, department.get(0).get(0));
	            Assert.assertEquals(Networking, department.get(0).get(1));
	            logger.info(Accessories + " options are present in department" + Networking);
	            break;
	        case "Sports":
	            click(factory.homepage().Sports);
	            String AthleticClothing = getText(factory.homepage().AthleticClothing);
	            String ExerciseFitness = getText(factory.homepage().ExerciseFitness);
	            Assert.assertEquals(AthleticClothing, department.get(0).get(0));
	            Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
	            logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
	            break;
	        case "Automotive":
	            click(factory.homepage().Automative);
	            String AutomativePartsAccessories = getText(factory.homepage().AutomativePartsAccessories);
	            String MotorCyclePowersports = getText(factory.homepage().MotorCyclePowersports);
	            Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
	            Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
	            logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
	            break;

	       }

	   }

	@When("User click on Sign in Option")
	public void UserClickOnSinInButton() {
		click(factory.homepage().signin);
		logger.info("user clicked on signin option successfully");
		slowDown();

	}

	@And("user enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user entered email" + email + "and password" + password);
		slowDown();
	}

	@And("User click on Login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user click on login button");
		slowDown();
	}

	@And("User should be logged in into account")
	public void userShouldBeLoggedIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homepage().account));
		logger.info("user should be logged in into Account");
		slowDown();
	}
	
	@And("User change the category to {string}")
	public void userChangeTheCategory(String smartHome) {
		selectByVisibleText(factory.homepage().allDepartments,smartHome);
        logger.info("All Department changed to" + smartHome);
		}
	
	@And("User search for an item {string}")
    public void userSearchForAnItemKasaOutdoorSmartHome(String item) {
        sendText(factory.homepage().searchInputField,item);
        logger.info("user entred " + item);
        
        
    }
    
    @And("User click on Search icon")
    public void userClickOnSearchIcon() {
        click(factory.homepage().searchButton);
        logger.info("user clicked on search button");    
    }
    
    @And("User click on item")
    public void userClickOnItem() {
        click(factory.homepage().Kasa);
        logger.info("user clicked on item");
    }
    
    @And("User select quantity {string}")
    public void userSelectQuantity(String adad) {
        sendText(factory.homepage().Quantity,adad);
        logger.info("user selected quantity '2' ");
        
    }
    
    @And("User click add to Cart button")
    public void userClickAddToCartBttn() {
        click(factory.homepage().AddToCart);
        logger.info("user clicked on Add To Cart");
        
    }
    
    @Then("the cart icon quantity should change to {string}")
    public void TheCartIconQuantityShouldChangeTo2(String two) {
        Assert.assertTrue(isElementDisplayed(factory.homepage().cartBtn,two));
        logger.info("cart icone changed to '2' ");
    
    }
    
   @And("User click on Cart option")
   public void userClickOnCartOptionBelow() {
	   click(factory.homepage().cartBtn);
	   logger.info("user click on cartButton");
	   
   }
    
   @And("User click on Proceed to Checkout button")
   public void userClickOnProceedToCheckoutButtoN() {
	   click(factory.homepage().proceedBtn);
	   logger.info("user click on proced checkout button");
	   
   }
   
   @And("User click Add a new address link for shipping address")
   public void userClickAddANewAddressLinkForShippingAddreSS() {
	   click(factory.homepage().addAddressBtn);
	   logger.info("user click on add new address button link");
	   
   }
    
   @And("User fill new address form with below information")
   public void userFillNewAddressFormWithBelowInformation(DataTable data) {
	   List<Map<String, String>>  FillInfo =data.asMaps(String.class,String.class);
	   selectByVisibleText(factory.homepage().countryDropdown,FillInfo.get(0).get("country"));
		sendText(factory.homepage().fullNameInput,FillInfo.get(0).get("fullName"));
		sendText(factory.homepage().PhoneNumber,FillInfo.get(0).get("phoneNumber"));
		sendText(factory.homepage().StreetAddress,FillInfo.get(0).get("streetAddress"));
		sendText(factory.homepage().ApartmentInput,FillInfo.get(0).get("apt"));
		sendText(factory.homepage().CityInput,FillInfo.get(0).get("city"));
		selectByVisibleText(factory.homepage().State,FillInfo.get(0).get("state"));
		sendText(factory.homepage().ZipCode,FillInfo.get(0).get("zipCode"));
		slowDown();
	   
 }
   
//   @And("User click Add Your Address button")
//   public void userClickAddYourAddrEsssButton() {
//	   click(factory.homepage().addAddressBtn);
//	   logger.info("user click on add your address button");
//	   
//   }
   @And("User click Add a credit card or Debit Card for Payment method")
   public void userClickAddACreditCardOrDebitCardForPaymentMethoD() {
	   click(factory.homepage().addPaymentBtn);
	   logger.info("user click on add payment method");
	   
}
//   @And("User fill Debit or credit card information")
//   public void userFillDebitOrCreditCardInformationByBelowInformation(DataTable data) {
//	   
//	   List<Map<String, String>> debitorcreditinformation = data.asMaps(String.class, String.class);
//		sendText(factory.homepage().CardInput, debitorcreditinformation.get(0).get("cardNumber"));
//		sendText(factory.homepage().NameInput, debitorcreditinformation.get(0).get("nameOnCard"));
//		selectByVisibleText(factory.homepage().MonthInput, debitorcreditinformation.get(0).get("expirationMonth"));
//		selectByVisibleText(factory.homepage().YearInput, debitorcreditinformation.get(0).get("expirationYear"));
//		sendText(factory.homepage().SecurityInput, debitorcreditinformation.get(0).get("securityCode"));
//		
	   
 //}
   @And("User click on Add your card  button")
   public void userClickOnAddYourCardButtonbelow() {
	   click(factory.homepage().AddYourCardbtn);
	   logger.info("user click on add your card button");
	   slowDown();
   }
   @And("User click on Place Your  Order")
   public void userClickOnPlaceYour_order() {
	   click(factory.homepage().placeOrderBtn);
	   logger.info("user click on place your order");
	   
   }
   
   @Then("a message should be displayed Order Placed,  Thanks")
   public void aMessageShouldBeDidplayedOrderPlaced_thanks() {
	   Assert.assertTrue(isElementDisplayed(factory.homepage().Thanks));
	   logger.info("A Message should display your order placed Thanks");
	   
   }
   
   
   
   
   
   
   
   
   
   
   @And("User change the category To {string}")
   public void user_Change_The_Category(String electronics) {
	   selectByVisibleText(factory.homepage().allDepartments,electronics);
       logger.info("All Department changed to" + electronics);
	   
	   
   }
   
   @And("User search For an item {string}")
   public void user_Search_For_AN_item(String apexlegend) {
	   sendText(factory.homepage().searchInputField,apexlegend);
       logger.info("user entred " + apexlegend);
	   
	   
   }
   
   @And("User click on Search ICON")
   public void user_click_on_search_icon() {
	   click(factory.homepage().searchButton);
       logger.info("user clicked on search button");
	   
   }
   
   
   @And("User click on ITEM")
   public void and_user_click_item() {
	   click(factory.homepage().Apex);
       logger.info("user clicked on item");
	   
   }
   
   @And("User select Quantity {string}")
   public void user_select_quantity(String five) {
	   sendText(factory.homepage().Quantity,five);
       logger.info("user selected quantity 5 ");
	   
	   
   }
   
   @And("User click ADD to Cart button")
   public void user_click_add_to_cart_button() {
	   click(factory.homepage().AddToCart);
       logger.info("user clicked on Add To Cart");
	   
   }
   
   @Then("the cart icon quantity should CHANGE to {string}")
   public void the_cart_icon_quantity_should_change_to(String fivee) {
	   Assert.assertTrue(isElementDisplayed(factory.homepage().cartBtn,fivee));
       logger.info("cart icone changed to '2' ");
   
   }
   
   @And("User click on Cart OPTION")
   public void user_click_on_cart_option() {
	   click(factory.homepage().cartBtn);
	   logger.info("user click on cartButton");
	   
   }
   
   @And("User click on PROCEED to Checkout button")
   public void user_click_on_procedd_to_checkout_button() {
	   click(factory.homepage().proceedBtn);
	   logger.info("user click on proced checkout button");
	   
   }
   
   @And("User click on Place Your ORDER")
 public void userClickOnPlaceYourOrder() {
	   click(factory.homepage().placeOrderBtn);
	   logger.info("user click on place your order");
	   
 }
 
 @Then("a message should be displayed Order Placed, THANKS")
 public void aMessageShouldBeDidplayedOrderPlacedThanks() {
	   Assert.assertTrue(isElementDisplayed(factory.homepage().Thanks));
	   logger.info("A Message should display your order placed Thanks");
	   
 }
   

}
