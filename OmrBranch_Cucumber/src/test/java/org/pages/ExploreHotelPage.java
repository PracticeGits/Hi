package org.pages;

import java.awt.AWTException;

import org.base.BaaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreHotelPage extends BaaseClass {
	public ExploreHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement txtLoginSuccessMessage;

	@FindBy(id = "state")
	private WebElement selectState;

	@FindBy(xpath = "//span[text()='Select City *']")
	private WebElement selectCity;

	@FindBy(xpath = "//textarea[@type='search']")
	private WebElement selectRoomType;

	@FindBy(id = "select2-room_type-result-m0xe-Standard")
	private WebElement selectStandardRoomType;

	@FindBy(id = "select2-room_type-result-7gpa-Deluxe")
	private WebElement selectDeluxeRoomType;

	@FindBy(id = "select2-room_type-result-glbx-Suite")
	private WebElement selectSuite;

	@FindBy(id = "select2-room_type-result-p9c7-Luxury")
	private WebElement selectLuxury;

	@FindBy(id = "select2-room_type-result-oiux-Studio")
	private WebElement selectStudio;

	// calendar
	@FindBy(name = "check_in")
	private WebElement clickCheckIn;

	@FindBy(id = "ui-datepicker-div")
	private WebElement calendarVisible;

	@FindBy(className = "ui-datepicker-month")
	private WebElement calendarMonth;

	@FindBy(className = "ui-datepicker-year")
	private WebElement calendarYear;

	@FindBy(className = "ui-datepicker-year")
	private WebElement calendarNextBtn;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody//td")
	private WebElement calendarDate;

	@FindBy(name = "check_out")
	private WebElement clickCheckOut;
	//

	@FindBy(id = "no_rooms")
	private WebElement enterNoOfRooms;

	@FindBy(id = "no_adults")
	private WebElement enterNoOfAdults;

	@FindBy(id = "no_child")
	private WebElement enterNoOfChild;

	@FindBy(id = "searchBtn")
	private WebElement exploreHotelSearchBtn;

	@FindBy(xpath = "//div[@id='invalid-state']")
	private WebElement invalidStateTxt;

	@FindBy(xpath = "//div[@id='invalid-city']")
	private WebElement invalidCityTxt;

	@FindBy(xpath = "//div[@id='invalid-check_in']")
	private WebElement invalidCheckInTxt;

	@FindBy(xpath = "//div[@id='invalid-check_out']")
	private WebElement invalidCheckOutTxt;

	@FindBy(xpath = "//div[@id='invalid-no_rooms']")
	private WebElement invalidNoRoomsTxt;

	@FindBy(xpath = "//div[@id='invalid-no_adults']")
	private WebElement invalidNoAdultsTxt;

	@FindBy(xpath = "//div[@class='fliter_box_inner']/h5")
	private WebElement exploreHotelsTxt;

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement profileName;

	@FindBy(xpath = "//div[@class='fliter_box_inner text-center']//h3[text()='Hotel Booking']")
	private WebElement exploreHotelClickimage;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement cityInputField;

	// getters

	public WebElement getProfileName() {
		return profileName;
	}

	public WebElement getCityInputField() {
		return cityInputField;
	}

	public WebElement getExploreHotelClickimage() {
		return exploreHotelClickimage;
	}

	public void setEnterNoOfAdults(WebElement enterNoOfAdults) {
		this.enterNoOfAdults = enterNoOfAdults;
	}

	public WebElement getSelectState() {
		return selectState;
	}

	public WebElement getSelectCity() {
		return selectCity;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public WebElement getSelectStandardRoomType() {
		return selectStandardRoomType;
	}

	public WebElement getSelectDeluxeRoomType() {
		return selectDeluxeRoomType;
	}

	public WebElement getSelectSuite() {
		return selectSuite;
	}

	public WebElement getSelectLuxury() {
		return selectLuxury;
	}

	public WebElement getSelectStudio() {
		return selectStudio;
	}

	public WebElement getClickCheckIn() {
		return clickCheckIn;
	}

	public WebElement getClickCheckOut() {
		return clickCheckOut;
	}

	public WebElement getEnterNoOfRooms() {
		return enterNoOfRooms;
	}

	public WebElement getEnterNoOfAdults() {
		return enterNoOfAdults;
	}

	public WebElement getEnterNoOfChild() {
		return enterNoOfChild;
	}

	public WebElement getExploreHotelSearchBtn() {
		return exploreHotelSearchBtn;
	}

	public WebElement getInvalidStateTxt() {
		return invalidStateTxt;
	}

	public WebElement getInvalidCityTxt() {
		return invalidCityTxt;
	}

	public WebElement getInvalidCheckInTxt() {
		return invalidCheckInTxt;
	}

	public WebElement getInvalidCheckOutTxt() {
		return invalidCheckOutTxt;
	}

	public WebElement getInvalidNoRoomsTxt() {
		return invalidNoRoomsTxt;
	}

	public WebElement getInvalidNoAdultsTxt() {
		return invalidNoAdultsTxt;
	}

	public WebElement getExploreHotelsTxt() {
		return exploreHotelsTxt;
	}

	public WebElement getTxtLoginSuccessMessage() {
		return txtLoginSuccessMessage;
	}

	public String getTxtloginSuccessMessage() {
		String elementGetText = elementGetText(txtLoginSuccessMessage);
		return elementGetText;
	}

	public WebElement getCalendarVisible() {
		return calendarVisible;
	}

	public WebElement getCalendarMonth() {
		return calendarMonth;
	}

	public WebElement getCalendarYear() {
		return calendarYear;
	}

	public WebElement getCalendarNextBtn() {
		return calendarNextBtn;
	}

	public WebElement getCalendarDate() {
		return calendarDate;
	}

	// logics

	public void enterAllFields(String stateName, String City, String roomType, String checkIn, String checkOut,
			String noOfRooms, String adults, String child) throws AWTException, InterruptedException {

		selectOptionByAttributeValue(selectState, stateName);
		selectCity(City);
		enterRoomType(roomType);

		inserttextByJs(checkIn, clickCheckIn);
		inserttextByJs(checkOut, clickCheckOut);
		selectOptionByText(enterNoOfRooms, noOfRooms);
		selectOptionByText(enterNoOfAdults, adults);
		elementSendKeys(enterNoOfChild, child);
	}

	public void enterAllFields2(String stateName, String City, String AllRoomType, String checkIn, String checkOut,
			String noOfRooms, String adults, String child) throws AWTException, InterruptedException {

		selectOptionByAttributeValue(selectState, stateName);
		selectCity(City);
		enterRoomType(AllRoomType);
		inserttextByJs(checkIn, clickCheckIn);
		inserttextByJs(checkOut, clickCheckOut);
		selectOptionByText(enterNoOfRooms, noOfRooms);
		selectOptionByText(enterNoOfAdults, adults);
		elementSendKeys(enterNoOfChild, child);
	}

	public void mandatoryFields(String stateName, String cityName, String checkIn, String checkOut, String noOfRooms,
			String adults) throws AWTException, InterruptedException {

		selectOptionByAttributeValue(selectState, stateName);
		selectCity(cityName);
		inserttextByJs(checkIn, clickCheckIn);
		inserttextByJs(checkOut, clickCheckOut);
		selectOptionByText(enterNoOfRooms, noOfRooms);
		selectOptionByText(enterNoOfAdults, adults);

	}

	public void exploreHotelSearchBtn() {
		frameByIndex(0);
		elementClick(exploreHotelSearchBtn);
	}

	public String invalidState() {
		visibilityOfElements(invalidStateTxt);
		String invalidStatetext = elementGetText(invalidStateTxt);
		return invalidStatetext;

	}

	public String invalidCity() {
		visibilityOfElements(invalidCityTxt);
		String invalidCityText = elementGetText(invalidCityTxt);
		return invalidCityText;

	}

	public String invalidCheckin() {
		visibilityOfElements(invalidCheckInTxt);
		String invalidCheckInText = elementGetText(invalidCheckInTxt);
		return invalidCheckInText;
	}

	public String invalidCheckOut() {
		visibilityOfElements(invalidCheckOutTxt);
		String invalidCheckOuttext = elementGetText(invalidCheckOutTxt);
		return invalidCheckOuttext;
	}

	public String invalidNoRooms() {
		visibilityOfElements(invalidNoRoomsTxt);
		String invalidNoRoomText = elementGetText(invalidNoRoomsTxt);
		return invalidNoRoomText;
	}

	public String invalidAdult() {
		visibilityOfElements(invalidNoAdultsTxt);
		String invalidAdultText = elementGetText(invalidNoAdultsTxt);
		return invalidAdultText;
	}

	public void singleRoomtype(String room) throws AWTException, InterruptedException {
		elementSendKeys(selectRoomType, room);
		enterKey();
	}

	public void enterRoomType(String roomType) throws AWTException, InterruptedException {
		
		String[] split = roomType.split("/");
		System.out.println(split);
		for (String s : split) {
			System.out.println(s);
			getSelectRoomType().sendKeys(s, Keys.ENTER);
			

		}
	}

	public String profileSuccess() {
		String elementGetText = elementGetText(profileName);
		return elementGetText;
	}

	public void exploreHotelImageClick() throws InterruptedException {
		elementClick(exploreHotelClickimage);
		sleep();
	}

	public void selectCity(String City) throws InterruptedException, AWTException {
		sleep();
		elementClick(selectCity);
		cityInputField.sendKeys(City,Keys.ENTER);

	}

}