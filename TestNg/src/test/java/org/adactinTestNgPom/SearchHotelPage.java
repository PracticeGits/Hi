package org.adactinTestNgPom;

import org.base.BaaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaaseClass {

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement noOfRooms;

	

	@FindBy(id = "datepick_in")
	private WebElement checkIn;

	@FindBy(id = "datepick_out")
	private WebElement checkOut;

	@FindBy(id = "adult_room")
	private WebElement adultRoom;

	@FindBy(id = "child_room")
	private WebElement childRoom;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement search;

	@FindBy(xpath="//td[@class='login_title']")
	private WebElement selectHotelText;
	
	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}
	
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public WebElement getSelectHotelText() {
		return selectHotelText;
	}

	public void searchHotel(String hotelLocation, String hotels, String roomType,String noOfRooms, String checkInDate, String CheckOutDate,
			String adultRoom, String childRoom) {

		selectOptionByAttributeValue(getLocation(), hotelLocation);
		selectOptionByAttributeValue(getHotels(), hotels);
		selectOptionByAttributeValue(getRoomtype(), roomType);
		selectOptionByAttributeValue(getNoOfRooms(), noOfRooms);
		clear(getCheckIn());
		elementSendKeys(getCheckIn(), checkInDate);
		clear(getCheckOut());
		elementSendKeys(getCheckOut(), CheckOutDate);
		selectOptionByAttributeValue(getAdultRoom(), adultRoom);
		selectOptionByAttributeValue(getChildRoom(), childRoom);
		elementClick(getSearch());

	}

}
