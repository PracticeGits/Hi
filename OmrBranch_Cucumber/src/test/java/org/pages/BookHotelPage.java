package org.pages;

import org.base.BaaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 */
public class BookHotelPage extends BaaseClass {
//hi
	@FindBy(xpath = "//div[@class=\"row\"]/h2")
	private WebElement bookHotelSuccessMsg;

	@FindBy(id = "own")
	private WebElement guestMyself;

	@FindBy(id = "user_title")
	private WebElement guestSalutation;

	@FindBy(id = "first_name")
	private WebElement guestFirstName;

	@FindBy(id = "last_name")
	private WebElement guestLastName;

	@FindBy(id = "user_phone")
	private WebElement guestPhoneNo;

	@FindBy(id = "user_email")
	private WebElement guestEmail;

	@FindBy(id = "gst")
	private WebElement EnterGstBtn;

	@FindBy(id = "gst_registration")
	private WebElement GstRegistrationNo;

	@FindBy(id = "company_name")
	private WebElement GstCompanyName;

	@FindBy(id = "company_address")
	private WebElement GstCompanyAddress;

	@FindBy(id = "step1next")
	private WebElement nextButton1;

	@FindBy(id = "smoking")
	private WebElement smokeSpecialRequest;

	@FindBy(id = "other_request")
	private WebElement otherRequest;

	@FindBy(id = "step2next")
	private WebElement nextButton2;

	@FindBy(id = "//div[@class='credit-card pm']")
	private WebElement paymentOptionCD;

	@FindBy(id = "payment_type")
	private WebElement cardType;

	@FindBy(id = "card_type")
	private WebElement card;

	@FindBy(id = "card_no")
	private WebElement cardNumber;

	@FindBy(id = "card_month")
	private WebElement cardMonth;

	@FindBy(id = "card_year")
	private WebElement cardYear;

	@FindBy(id = "cvv")
	private WebElement cvv;

	@FindBy(id = "submitBtn")
	private WebElement submitBtn;

	public WebElement getBookHotelSuccessMsg() {
		return bookHotelSuccessMsg;
	}

	public WebElement getGuestMyself() {
		return guestMyself;
	}

	public WebElement getGuestSalutation() {
		return guestSalutation;
	}

	public WebElement getGuestFirstName() {
		return guestFirstName;
	}

	public WebElement getGuestLastName() {
		return guestLastName;
	}

	public WebElement getGuestPhoneNo() {
		return guestPhoneNo;
	}

	public WebElement getGuestEmail() {
		return guestEmail;
	}

	public WebElement getEnterGstBtn() {
		return EnterGstBtn;
	}

	public WebElement getGstRegistrationNo() {
		return GstRegistrationNo;
	}

	public WebElement getGstCompanyName() {
		return GstCompanyName;
	}

	public WebElement getGstCompanyAddress() {
		return GstCompanyAddress;
	}

	public WebElement getNextButton() {
		return nextButton1;
	}

	public WebElement getNextButton2() {
		return nextButton2;
	}

	public WebElement getPaymentOptionCD() {
		return paymentOptionCD;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardMonth() {
		return cardMonth;
	}

	public WebElement getCardYear() {
		return cardYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	// logics

	public void guestDetails(String Salutation, String firstName, String lastName, String mobile, String email) {
		elementClick(EnterGstBtn);
		elementSendKeys(guestSalutation, Salutation);
		elementSendKeys(guestFirstName, firstName);
		elementSendKeys(guestLastName, lastName);
		elementSendKeys(guestPhoneNo, mobile);
		elementSendKeys(guestPhoneNo, email);

	}

	public void gstDetails(String regno, String companyName, String companyAddress) {
		elementClick(EnterGstBtn);
		elementSendKeys(GstRegistrationNo, regno);
		elementSendKeys(GstCompanyName, companyName);
		elementSendKeys(GstCompanyAddress, companyAddress);
		elementClick(nextButton1);

	}

	public void specialRequestDetails(String otherReq) {

		elementClick(smokeSpecialRequest);
		elementSendKeys(otherRequest, otherReq);
		elementClick(nextButton2);
	}
	
	public void paymentDetails(String CardType,String Card,String CardNumber,String NameOnCard,String month,String Year,String CVV) {
		elementClick(paymentOptionCD);
		elementSendKeys(cardType,CardType);
		elementSendKeys(card,Card);
		elementSendKeys(cardNumber, CardNumber);
		elementSendKeys(cardNumber, NameOnCard);
		elementSendKeys(cardMonth, month);
		elementSendKeys(cardYear, Year);
		elementSendKeys(cvv, CVV);
		elementClick(submitBtn);
		
	}
	
	

}
