package org.adactinTestNgPom;

import org.base.BaaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends BaaseClass {
	
	public BookingConfirmationPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderId;


	public WebElement getOrderId() {
		return orderId;
	}

	
	public String bookingConfirm() {
		String getattributevalue = getattributevalue(getOrderId());
		return getattributevalue;
	}
	
	
	

	
	
	
	


}
