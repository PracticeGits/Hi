package org.pages;

import java.awt.AWTException;

import org.base.BaaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUsername;

	@FindBy(id = "pass")
	private WebElement txtpassword;

	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnLogin;

	@FindBy(id = "errorMessage")
	private WebElement invalidTextMessage;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getInvalidTextMessage() {
		return invalidTextMessage;
	}

	// logics
	public void login(String userName, String password) {
		elementSendKeys(txtUsername, userName);
		elementSendKeys(txtpassword, password);
		elementClick(btnLogin);
	}

	public void loginEnterKey(String userName, String password) throws AWTException, InterruptedException {
		elementSendKeys(txtUsername, userName);
		elementSendKeys(txtpassword, password);
		enterKey();
	}

	public String invalidErrorMessageText() {
		
		String elementGetText = elementGetText(invalidTextMessage);
		return elementGetText;
	}

}
