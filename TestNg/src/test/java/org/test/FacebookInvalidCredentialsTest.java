package org.test;

import java.io.IOException;

import org.base.BaaseClass;
import org.facebookTestNgPom.FacebookLoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookInvalidCredentialsTest extends BaaseClass {

	 
	
	@BeforeClass
	private void beforeClass() throws IOException {

		BrowserLaunch();
		getUrl(getExcelSingleData("Sheet2", 1, 0));
		maximizeWindow();
		System.out.println("beforetest");

	}

	@AfterClass
	private void afterClass() {
		// TODO Auto-generated method stub
		quit();
		System.out.println("aftertest");
	}

	@Test
	private void invalidLoginCredentials() throws InterruptedException, IOException {
		FacebookLoginPage fpage = new FacebookLoginPage();	
		fpage.invalidCredentials(getExcelSingleData("Sheet2", 1, 1), getExcelSingleData("Sheet2", 1, 2));
		sleep();
		WebElement incorrectPasswordText = fpage.getIncorrectPasswordText();
		boolean displayed = incorrectPasswordText.isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("test1");

	}

}
