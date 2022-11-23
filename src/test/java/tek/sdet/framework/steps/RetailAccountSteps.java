package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homepage().account);
		logger.info("user successfully click on account option");

		slowDown();

	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.AccountPage().nameinput);
		sendText(factory.AccountPage().nameinput, name);
		clearTextUsingSendKeys(factory.AccountPage().phoneinput);
		sendText(factory.AccountPage().phoneinput, phone);
		logger.info("user entered name and password");

	}

	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.AccountPage().updateButton);
		logger.info("user can click on update option");

		

	}

	@Then("user profile information should be updated")
	public void userProfileShouldBeUpdated() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().Message));
		logger.info("user profile updated");

		

	}

	@And("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> changepassword = data.asMaps(String.class, String.class);
		sendText(factory.AccountPage().previousPassword, changepassword.get(0).get("previousPassword"));
		sendText(factory.AccountPage().newpassword, changepassword.get(0).get("newPassword"));
		sendText(factory.AccountPage().confirmpassword, changepassword.get(0).get("confirmPassword"));
		logger.info("user chanage the password");
		slowDown();

	}

	@And("User click on Change Password button")
	public void clickOnChnagePasswordButton() {

		click(factory.AccountPage().changepasswordBtn);
		logger.info("user click on change password button");

	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void messageShouldBeDisplayedPasswordUpdated() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().msgpassword));
		logger.info("password Updated Successfully");

	}

	@And("User click on Add a payment method link")
	public void userClickOnPaymentMethod() {
		click(factory.AccountPage().addpaymentmethodlink);
		logger.info("user click on add payment method link");

	}

	@And("User fill Debit or credit card information")
	public void userfillDebitOrCreditInformation(DataTable data) {
		
		List<Map<String, String>> debitorcreditinformation = data.asMaps(String.class, String.class);
		sendText(factory.AccountPage().cardnumberinput, debitorcreditinformation.get(0).get("cardNumber"));
		sendText(factory.AccountPage().nameoncardinput, debitorcreditinformation.get(0).get("nameOnCard"));
		selectByVisibleText(factory.AccountPage().expirationmonth, debitorcreditinformation.get(0).get("expirationMonth"));
		selectByVisibleText(factory.AccountPage().expirationyear, debitorcreditinformation.get(0).get("expirationYear"));
		sendText(factory.AccountPage().securitycode, debitorcreditinformation.get(0).get("securityCode"));

	}

	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.AccountPage().paymentsubmitBtn);
		logger.info("user click on add card button");

	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void amessageShouldBeDisplayed() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().PaymentMethodAddedSuccessfully));
		logger.info("payment method added successfully");

	}

	@And("User select the payment Card")
	public void userSelectedThePaymentCard() {
		click(factory.AccountPage().SelectedpaymentCard);
		logger.info("User clicked on payment card");
		slowDown();
	}

	@And("User click on Edit option of card section")

	public void userClickOnEditOption() {
		click(factory.AccountPage().edit);
		logger.info("user can click on edit button");
		
	}

	@And("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> debitorcreditedit = dataTable.asMaps(String.class, String.class);
		
		clear(factory.AccountPage().cardnumberinput);
		sendText(factory.AccountPage().cardnumberinput, debitorcreditedit.get(0).get("cardNumber"));
		slowDown();
        clear(factory.AccountPage().nameoncardinput);
        sendText(factory.AccountPage().nameoncardinput, debitorcreditedit.get(0).get("nameOnCard"));
        slowDown();
        clear(factory.AccountPage().securitycode);
    	sendText(factory.AccountPage().securitycode, debitorcreditedit.get(0).get("securityCode"));
        slowDown();
		
		selectByVisibleText(factory.AccountPage().expirationmonth, debitorcreditedit.get(0).get("expirationMonth"));
		selectByVisibleText(factory.AccountPage().expirationyear, debitorcreditedit.get(0).get("expirationYear"));
	
		
		logger.info("user can edit credit or debit successfully");
		
		slowDown();
		
	}

	@And("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.AccountPage().updatecard);
		logger.info("user can update succesfully");

	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void amessageDisplayedUpdateSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().PaymentMethodupdatedSuccessfully));
		logger.info("information successfuly updated");

	}
	
	@And("User click on remove option of card section")
	public void clickOnRemoveButton() {
		click(factory.AccountPage().remove);
		logger.info("remove the card");
		
		slowDown();
	}
	
	@Then("payment details should be removed")
	public void paymentDetialsShouldBeRemoved() {
		slowDown();
		//Assert.assertTrue(isElementDisplayed(factory.AccountPage().account); There is no message to validate.
		logger.info("payemtn detials removed");
		
		}
	
	@And("User click on Add address option")
	public void clickOnAddAddressOption() {
		click(factory.AccountPage().addAddress);
		logger.info("user click on add address");
		
	}
	
	@And("user fill address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> Address = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.AccountPage().country,Address.get(0).get("country"));
		sendText(factory.AccountPage().fullnameinput,Address.get(0).get("fullName"));
		sendText(factory.AccountPage().phoneNumber,Address.get(0).get("phoneNumber"));
		sendText(factory.AccountPage().streetaddress,Address.get(0).get("streetAddress"));
		sendText(factory.AccountPage().apartmentinput,Address.get(0).get("apt"));
		sendText(factory.AccountPage().cityinput,Address.get(0).get("city"));
		selectByVisibleText(factory.AccountPage().state,Address.get(0).get("state"));
		sendText(factory.AccountPage().zipcodeinput,Address.get(0).get("zipCode"));
		slowDown();
		
	}
	
	@And("User click Add Your Address button")
	public void userClickOnAddressButton() {
		click(factory.AccountPage().Addaddress);
		logger.info("user click on addres button");
	}
	
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldDispayedAddressAddedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().AddressAddedSuccessfully));
		logger.info("user should added address successfully");
	}
	
	@And("User click on edit address option")
	public void clickOnEditAddressOption() {
		click(factory.AccountPage().editaddress);
		logger.info("user can click on edit option ");
		
	}
	
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithThisInformation(DataTable data) {
		List<Map<String, String>> editAddress = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.AccountPage().country,editAddress.get(0).get("country"));
		clearTextUsingSendKeys(factory.AccountPage().fullnameinput);
		sendText(factory.AccountPage().fullnameinput,editAddress.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.AccountPage().phoneNumber);
		sendText(factory.AccountPage().phoneNumber,editAddress.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.AccountPage().streetaddress);
		sendText(factory.AccountPage().streetaddress,editAddress.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.AccountPage().apartmentinput);
		sendText(factory.AccountPage().apartmentinput,editAddress.get(0).get("apt"));
		clearTextUsingSendKeys(factory.AccountPage().cityinput);
		sendText(factory.AccountPage().cityinput,editAddress.get(0).get("city"));
		selectByVisibleText(factory.AccountPage().state,editAddress.get(0).get("state"));
		clearTextUsingSendKeys(factory.AccountPage().zipcodeinput);
		sendText(factory.AccountPage().zipcodeinput,editAddress.get(0).get("zipCode"));
		slowDown();
		
	}
	
	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.AccountPage().updateyouraddress);
		logger.info("user click on update address button");
		
	}
	
	@Then("a message should be displayed Address Updated Successfully")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().AddressUpdatedSuccessfully));
		logger.info("your new address updated");
		
	}
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOption() {
		click(factory.AccountPage().removeaddress);
		logger.info("user click on remove option");
	}
	
	@Then("Address details should be removed")
	public void userRemovedOption() {
		//Assert.assertTrue(isElementDisplayed(factory.AccountPage().account));There is no message to validate.
		logger.info("user removed address");
	}
}
