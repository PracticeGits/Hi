package org.adactinTestNgPom;

import org.base.BaaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaaseClass {

	public BookHotelPage() {

		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "first_name")
	private WebElement firstName;
	
	@FindBy(id = "last_name")
	private WebElement lastName;
	
	@FindBy(id = "address")
	private WebElement billingAddress;
	
	@FindBy(id = "cc_num")
	private WebElement creditCardNo;
	
	@FindBy(id = "cc_type")
	private WebElement creditCardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvvNo;
	
	@FindBy(id="book_now")
	private WebElement bookNowBtn;
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement bookingConfirmationText;

	

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	
	public WebElement getBookingConfirmationText() {
		return bookingConfirmationText;
	}
	
	public void bookHotel(String firstName,String lastName,String billingAddress,String creditCardNo,String creditCardType,
			String expiryMonth,String expiryYear,String cvvNo) {
			elementSendKeys(getFirstName(), firstName);
			elementSendKeys(getLastName(), lastName);
			elementSendKeys(getBillingAddress(), billingAddress);
			elementSendKeys(getCreditCardNo(), creditCardNo);
			selectOptionByAttributeValue(getCreditCardType(), creditCardType);
			selectOptionByAttributeValue(getExpiryMonth(), expiryMonth);
			selectOptionByAttributeValue(getExpiryYear(), expiryYear);
			elementSendKeys(getCvvNo(), cvvNo);
			elementClick(getBookNowBtn());
	}
	
	


	
}
