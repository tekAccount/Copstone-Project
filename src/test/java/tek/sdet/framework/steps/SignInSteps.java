package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on Sign in option")
	public void UserClickOnSinInButton() {
		click(factory.homepage().signin);
		logger.info("user clicked on signin option successfully");
		slowDown();

	}

	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user entered email" + email + "and password" + password);
		slowDown();
	}

	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user click on login button");
		slowDown();
	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homepage().account));
		logger.info("user should be logged in into Account");
		slowDown();
	}

	@And("User click on Create New Account button")
	public void userClickOnNewAccountButton() {
		click(factory.signInPage().CreateAccount);
		logger.info("user can click on create new account");
         slowDown();      
	}
	
	
	@And("User fill the signUp information with below data")
	public void userFillBelowInformation(DataTable data) {
		List<Map<String, String>>  signUpData=data.asMaps(String.class,String.class);
		sendText(factory.signInPage().nameField,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailFaild,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passField,signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmpasswordFiled,signUpData.get(0).get("confirmPassword"));
		logger.info("user entered required information");
		slowDown();
				
	}
	
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUp);
		logger.info("user click on signUp Button");
		
		slowDown();
	}
		
		
		@Then("User should be logged into account page")
		public void userShouldBeCreateAccount() {
			Assert.assertTrue(isElementDisplayed(factory.homepage().account));
			logger.info("Done");
		
	}
		
		
		
	

}
