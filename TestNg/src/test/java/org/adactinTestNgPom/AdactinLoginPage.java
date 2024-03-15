package org.adactinTestNgPom;

import org.base.BaaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage extends BaaseClass{
	
	public AdactinLoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void adactinLogin(String username, String Password) {

		elementSendKeys(getUserName(), username);
		elementSendKeys(getPassword(), Password);
		elementClick(btnLogin);

	}

	
	

}
