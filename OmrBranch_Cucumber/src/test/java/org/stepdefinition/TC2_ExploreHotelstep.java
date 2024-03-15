package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_ExploreHotelstep extends BaaseClass {

	PageObjectManager pom = new PageObjectManager();

	@When("User search by entering all the fields {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_by_entering_all_the_fields_and(String State, String City, String roomType, String Checkin,
			String Checkout, String noRooms, String noAdult, String noChild) throws AWTException, InterruptedException {
		pom.getSearchHotelPage().exploreHotelImageClick();
		pom.getSearchHotelPage().enterAllFields(State, City, roomType, Checkin, Checkout, noRooms, noAdult, noChild);
		pom.getSearchHotelPage().exploreHotelSearchBtn();

	}

	@Then("User sould verify after select hotel success message {string}")
	public void user_sould_verify_after_select_hotel_success_message(String actualHotelSuccessMsg) {

		WebElement selectHotelSuccessMsg = pom.getSelectHotelPage().getSelectHotelSuccessMsg();
		String expHotelSuccessMsg = elementGetText(selectHotelSuccessMsg);
		Assert.assertEquals("verified Hotel Success Message", expHotelSuccessMsg, actualHotelSuccessMsg);
	}

	//

	@When("User search by entering mandatory fields {string},{string},{string},{string},{string} and {string}")
	public void user_search_by_entering_mandatory_fields_and(String string, String string2, String string3,
			String string4, String string5, String string6) throws InterruptedException, AWTException {
		pom.getSearchHotelPage().exploreHotelImageClick();
		pom.getSearchHotelPage().mandatoryFields(string, string2, string3, string4, string5, string6);
		pom.getSearchHotelPage().exploreHotelSearchBtn();
	}

	//
	

	

	@When("User search by entering all the fields with all rooms {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_by_entering_all_the_fields_with_all_rooms_and(String State, String City, String roomType,
			String Checkin, String Checkout, String noRooms, String noAdult,
			String noChild)
			throws AWTException, InterruptedException {
		pom.getSearchHotelPage().exploreHotelImageClick();
		pom.getSearchHotelPage().enterAllFields2(State, City, roomType, Checkin, Checkout, noRooms, noAdult, noChild);
		pom.getSearchHotelPage().exploreHotelSearchBtn();

	}

	@Then("User should verify after selecting all room type success message {string}")
	public void user_should_verify_after_selecting_all_room_type_success_message(String expHotelCategory) {

		String actHotelCategory = pom.getSelectHotelPage().getSelectHotelCategory();
		Assert.assertEquals("Verified hotel category", expHotelCategory, actHotelCategory);
	}

	//

	@When("User without entering any fields")
	public void user_without_entering_any_fields() throws InterruptedException {
		pom.getSearchHotelPage().exploreHotelImageClick();
		pom.getSearchHotelPage().exploreHotelSearchBtn();

	}

	@Then("User sould verify without fields success message {string}")
	public void user_sould_verify_without_fields_success_message(String expExploreHotelTxt) {
		driver.switchTo().parentFrame();
		WebElement text = pom.getSearchHotelPage().getExploreHotelsTxt();
		String actExploreHotelTxt = elementGetText(text);
		System.out.println(actExploreHotelTxt);
		Assert.assertEquals("Verified Explore hotel text", expExploreHotelTxt, actExploreHotelTxt);

	}

	@Then("User should verify error message {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_verify_error_message_and(String state, String city, String checkin, String checkout,
			String noOfRooms, String noOfAdult) throws InterruptedException {
		
		sleep();

		String invalidStateTxt = pom.getSearchHotelPage().invalidState();
		String invalidCityTxt = pom.getSearchHotelPage().invalidCity();
		String invalidCheckInTxt = pom.getSearchHotelPage().invalidCheckin();
		String invalidCheckOutTxt = pom.getSearchHotelPage().invalidCheckOut();
		String invalidNoRoomsTxt = pom.getSearchHotelPage().invalidNoRooms();
		String invalidNoAdultsTxt = pom.getSearchHotelPage().invalidAdult();

		Assert.assertEquals("invalid state", state, invalidStateTxt);
		Assert.assertEquals("invalid state", city, invalidCityTxt);
		Assert.assertEquals("invalid state", checkin, invalidCheckInTxt);
		Assert.assertEquals("invalid state", checkout, invalidCheckOutTxt);
		Assert.assertEquals("invalid state", noOfRooms, invalidNoRoomsTxt);
		Assert.assertEquals("invalid state", noOfAdult, invalidNoAdultsTxt);

	}

}
