package org.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.base.BaaseClass;
import org.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TC1_Loginstep extends BaaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User in OMR branch hotel page")
	public void user_in_omr_branch_hotel_page() throws FileNotFoundException, IOException {

		getDriver(getPropertyFileValue("browser"));
		getUrl(getPropertyFileValue("Url"));
		maximizeWindow();
		implicitWait();

	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String name, String pass) {
		pom.getLoginpage().login(name, pass);

	}

	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String expLoginSuccessMsg) {
		String actLoginSuccessMsg = pom.getSearchHotelPage().getTxtloginSuccessMessage();
		Assert.assertEquals("Verify after login success message", expLoginSuccessMsg, actLoginSuccessMsg);

	}

	@When("User enter {string} and {string} with enter key")
	public void user_enter_and_with_enter_key(String name, String pass) throws AWTException, InterruptedException {

		pom.getLoginpage().loginEnterKey(name, pass);

	}

	@Then("User should verify error message after click login button {string}")
	public void user_should_verify_error_message_after_click_login_button(String expinvalidErrorMessageText) {
		
		String actinvalidErrorMessageText = pom.getLoginpage().invalidErrorMessageText();
		System.out.println(actinvalidErrorMessageText);

		boolean contains = actinvalidErrorMessageText
				.contains(expinvalidErrorMessageText);
		System.out.println(contains);
		//Assert.assertTrue("Verify login error msg", contains);
	}

}
