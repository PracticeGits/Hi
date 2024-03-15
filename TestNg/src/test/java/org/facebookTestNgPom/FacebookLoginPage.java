package org.facebookTestNgPom;

import org.base.BaaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends BaaseClass{
	
	//constructors
	public FacebookLoginPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="loginbutton")
	private WebElement btnLogin;
	
	@FindBy(xpath="//span[@class='_akzt']")
	private WebElement incorrectPasswordText;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getIncorrectPasswordText() {
		return incorrectPasswordText;
	}
	
	//actions
	
	public void invalidCredentials(String userName1,String password1) {
		
		elementSendKeys(getUserName(),userName1);
		elementSendKeys(getPassword(),password1);
		elementClick(getBtnLogin());	
		
	}
	

}
