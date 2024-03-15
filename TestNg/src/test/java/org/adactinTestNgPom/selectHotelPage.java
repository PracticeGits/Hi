package org.adactinTestNgPom;

import org.base.BaaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectHotelPage extends BaaseClass {

	public selectHotelPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;

	@FindBy(id = "continue")
	private WebElement selectHotelContinue;

	@FindBy(xpath = "(//td[@class='login_title'])[2]")
	private WebElement bookHotelText;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getSelectHotelContinue() {
		return selectHotelContinue;
	}

	public WebElement getBookHotelText() {
		return bookHotelText;
	}

	public void selectHotel() {

		elementClick(radioBtn);
		elementClick(selectHotelContinue);

	}

}
