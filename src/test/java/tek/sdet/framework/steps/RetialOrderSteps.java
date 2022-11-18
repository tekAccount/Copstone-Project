package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetialOrderSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Sign in  option")
	public void UserClickOnSinInButton() {
		click(factory.homepage().signin);
		logger.info("user clicked on signin option successfully");
			}

	@And("User enter email {string}  and password  {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user entered email" + email + "and password" + password);
		}

	@And("User click on login  button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user click on login button");
		}
	
	@And("User should be logged in into  account")
	public void userShouldBeLoggedIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homepage().account));
		logger.info("user should be logged in into Account");
	}
	
	
	@And("User click on Orders section")
	public void userClickON_orderSection() {
		click(factory.OrderPage().orderlink);
		logger.info("user click on order section");
			
	}
	
	@And("User click on first order in list")
	public void user_Click_onFirstOrderInList() {
		click(factory.OrderPage().showdetails);
		logger.info("user click on first order");
		
	}
	
	@And("User click on Cancel The Order button")
	public void user_click_cancel_the_order_button() {
		click(factory.OrderPage().cancelBtn);
		logger.info("user click on cancel the order button");
		
	}
	
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String bouhtwrongitem) {
		sendText(factory.OrderPage().reasonInput,bouhtwrongitem);
		logger.info("user select cancelation reason");
		
	}
	
   @And("User click on Cancel Order button")
   public void userClickOnCancelButton() {
	   click(factory.OrderPage().cancelorder);
	   logger.info("user cancel order");
	   
	
   }
   @Then("a cancelation message should be displayed Your Order Has Been Cancelled")
   public void YourOrderHasBeenCancelled() {
	   Assert.assertTrue(isElementDisplayed(factory.OrderPage().yourOrderHasBeenCancelled));
	   logger.info("a message should be displayed your order has been cancelled");
	   
   }
   
   @And("User click on Return Items button")
   public void userClickedonReturnItemsBttn() {
	   click(factory.OrderPage().returnbtn);
	   logger.info("user click on return button");
       
   }
   
   @And("User select the Return Reason {string}")
   public void userSelectTheReturnReasonDamaged(String itemdamaged) {
	   sendText(factory.OrderPage().inputreason,itemdamaged);
	   logger.info("user select item damaged");
	   
       
   }
   
   @And("User select the drop off service {string}")
   public void userSelecttheDropOfFedex(String fedx) {
	   sendText(factory.OrderPage().dropOfInput,fedx);
	   logger.info("user select fedx from drop of");
       
   }
   
   @And("User click on Return Order button")
   public void userClickedOnReturnOrderBtn() {
	   click(factory.OrderPage().returnButton);
	   logger.info("user click on return Button");
       
   }
   
   @Then("a cancelation message should be displayed Return was successful")
   public void aMsg_should_BePresentAs_returnWassuccessful() {
	   Assert.assertTrue(isElementDisplayed(factory.OrderPage().yourOrderReturn));
	   logger.info("a message should be displayed your order has been returned");
       }
   
   @And("User click on Review button")
   public void userClickedOnReviewButton() {
	   click(factory.OrderPage().reviewBtn);
	   logger.info("user click on reviewBtn");
	    
   }
   
   @And("User write Review headline {string} and {string}")
   public void userWriteAReview(String headlinevalue,String reviewtext) {
	   sendText(factory.OrderPage().headlineInput,headlinevalue);
	   sendText(factory.OrderPage().descriptionInput,reviewtext);
	   logger.info("user write review healine and review text");
       
   }
   
   @And("User click Add your Review button")
   public void userClickedAddYourReviewButton() {
	   click(factory.OrderPage().reviewSubmitBtn);
	   logger.info("user click on review button");
       
   }
   
   @Then("a review message should be displayed Your review was added successfully")
  public void aMsgShouldBeDipsplayed() {
	  slowDown(); 
   Assert.assertTrue(isElementDisplayed(factory.OrderPage().Msg));
	   logger.info("a message should be dispalyed your rewiew was added successfully");
	   
       
   }
}

