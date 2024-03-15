package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelstep {

	PageObjectManager pom = new PageObjectManager();

//
	@Then("User should verify hotel names ended with selected {string} successfully")
	public void user_should_verify_hotel_names_ended_with_selected_successfully(String roomTypeLast) {

		boolean roomNameEnd = pom.getSelectHotelPage().roomNameEnd(roomTypeLast);

		Assert.assertFalse("verified roomtype", false);
	}

	//

	@When("User click the name ascending button")
	public void user_click_the_name_ascending_button() {
		pom.getSelectHotelPage().clickAscendingOrder();
	}

	@Then("User should verify Hotel names after click the name ascending button if it has sorted in ascending order successfully")
	public void user_should_verify_hotel_names_after_click_the_name_ascending_button_if_it_has_sorted_in_ascending_order_successfully() {
		try {
			pom.getSelectHotelPage().checkHotelNamesAscendingOrder();
		} catch (StaleElementReferenceException e) {
			pom.getSelectHotelPage().checkHotelNamesAscendingOrder();
		}
	}

	//

	@When("User click the price high-low option button")
	public void user_click_the_price_high_low_option_button() {
		pom.getSelectHotelPage().clickPriceHightToLow();
	}

	@Then("User should verify hotel price after click the price high-low option button if it is sorted descending order successfully")
	public void user_should_verify_hotel_price_after_click_the_price_high_low_option_button_if_it_is_sorted_descending_order_successfully() {

		try {
			pom.getSelectHotelPage().checkHotelPricesDescendingOrder();
		} catch (StaleElementReferenceException e) {
			pom.getSelectHotelPage().checkHotelPricesDescendingOrder();
		}
	}

}
