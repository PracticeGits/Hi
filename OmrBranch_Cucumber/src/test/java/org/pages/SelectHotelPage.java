package org.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.base.BaaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaaseClass {
	
	
	public SelectHotelPage() {

		PageFactory.initElements(driver, this);
	}

	// static variables
	public static String firstHotelName;
	public static String firstHotelPrice;

	// locators
	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites']/h5)[1]")
	private WebElement txtFirstHotelName;

	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement txtFirstHotelPrice;

	@FindBy(xpath = "//h5[normalize-space()='Select Hotel']")
	private WebElement selectHotelSuccessMsg;

	@FindBy(xpath = "//div[@id='hotellist']//following::div[@class='col-md-5 hotel-suites']/h5")
	private WebElement hotelNameList;

	@FindBy(xpath = "//div[@class='form-group custom_radio mb-2']//label[text()='Name Ascending']")
	private WebElement ascendingOrderRadiobtn;

	@FindBy(id = "value_ndesc")
	private WebElement descendingOrderRadiobtn;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private WebElement hotelTotalprice;

	@FindBy(xpath="//div[@class='form-group custom_radio mb-2']//label[text()='Price High to low']")
	private WebElement priceHightToLowRadiobtn;

	@FindBy(xpath = "(//a[@class='btn filter_btn'])[1]")
	private WebElement selectFirstHotelContinueBtn;
	
	@FindBy(id="room_type")
	private WebElement selectedHotelCategory;
	
	
	// getters

	

	public WebElement getSelectedHotelCategory() {
		return selectedHotelCategory;
	}

	public static String getFirstHotelName() {
		return firstHotelName;
	}

	public static String getFirstHotelPrice() {
		return firstHotelPrice;
	}

	public WebElement getSelectHotelSuccessMsg() {
		return selectHotelSuccessMsg;
	}

	public WebElement getHotelTotalprice() {
		return hotelTotalprice;
	}

	public WebElement getSelectFirstHotelContinueBtn() {
		return selectFirstHotelContinueBtn;
	}

	public WebElement getHotelNameList() {
		return hotelNameList;
	}

	public WebElement getPriceHightToLowRadiobtn() {
		return priceHightToLowRadiobtn;
	}

	public WebElement getTxtFirstHotelName() {
		return txtFirstHotelName;
	}

	public WebElement getTxtFirstHotelPrice() {
		return txtFirstHotelPrice;
	}

	public WebElement getAscendingOrderRadiobtn() {
		return ascendingOrderRadiobtn;
	}

	public WebElement getDescendingOrderRadiobtn() {
		return descendingOrderRadiobtn;
	}

	// logics

	public void clickAscendingOrder() {
		elementClick(ascendingOrderRadiobtn);
	}

	public boolean roomTypeLastWord(String roomtype) {

		List<WebElement> listOfHotels = driver.findElements(By.xpath("//div[@id='hotellist']//following::div[@class='col-md-5 hotel-suites']/h5"));
		List<Boolean> HotelEndwith = new ArrayList<Boolean>();
		for (WebElement b : listOfHotels) {
			String text = b.getText();
			boolean endsWith = text.endsWith(roomtype);
			HotelEndwith.add(endsWith);

		}
		boolean contains = HotelEndwith.contains(false);
		return contains;
		

	}

	public boolean checkHotelNamesAscendingOrder() {
		List<WebElement> ascendingelements = driver.findElements(By.xpath("//div[@id='hotellist']//following::div[@class='col-md-5 hotel-suites']/h5"));
		
		List<String> ascendingOrder = new ArrayList<String>();
		for (WebElement string : ascendingelements) {
			String text = string.getText();
			ascendingOrder.add(text);
		
		}
		Collections.sort(ascendingOrder);
		
		boolean equals = ascendingOrder.equals(ascendingelements);
		return equals;

	}

	public boolean checkHotelPricesDescendingOrder() {

		List<WebElement> descendingelements = driver.findElements(By.xpath("//div[@id='hotellist']//following::div[@class='col-md-5 hotel-suites']/h5"));
		List<String> descendingTotalPrice = new ArrayList<String>();
		for (WebElement string : descendingelements) {
			String text = string.getText();
			descendingTotalPrice.add(text);
		}
		boolean equals = descendingTotalPrice.equals(descendingelements);
		return equals;

	}

	public void selectFirstHotel() {
		elementClick(selectFirstHotelContinueBtn);
	}

	public void saveFirstHotelNameAndPrice() {

		firstHotelName = elementGetText(txtFirstHotelName);
		firstHotelPrice = elementGetText(txtFirstHotelPrice);

	}
	
	public void continuebtn() {

		elementClick(selectFirstHotelContinueBtn);
	}

	public void clickPriceHightToLow() {
		elementClick(priceHightToLowRadiobtn);
	}

	// Methods to call

	public boolean roomNameEnd(String roomType) {
		boolean roomTypeLastWord = roomTypeLastWord(roomType);
		return roomTypeLastWord;

	}

	public void ascendingorderhotelNames() {
		ascendingorderhotelNames();
		checkHotelNamesAscendingOrder();

	}

	public void descendingOrderHotelPrice() {
		clickPriceHightToLow();
		checkHotelPricesDescendingOrder();

	}
	
	public String getSelectHotelCategory() {
		String selectedHotelCateory = elementGetText(selectedHotelCategory);
		return selectedHotelCateory;
		
	}
	
	
}
