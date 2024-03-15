package org.test;

import java.io.IOException;

import org.adactinTestNgPom.AdactinLoginPage;
import org.adactinTestNgPom.BookHotelPage;
import org.adactinTestNgPom.BookingConfirmationPage;
import org.adactinTestNgPom.SearchHotelPage;
import org.adactinTestNgPom.selectHotelPage;
import org.base.BaaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdactinOrderConfirmationTest extends BaaseClass {

	@BeforeTest
	private void beforeClass() throws IOException {

		BrowserLaunch();
		getUrl(getExcelSingleData("sheet1", 1, 0));
		maximizeWindow();
		System.out.println("beforetestA");
		

	}

	@AfterTest
	private void afterClass() {
		// TODO Auto-generated method stub
		 quit();
		 System.out.println("aftertestA");
	}

	@Test(priority = 0)
	private void loginTest() throws InterruptedException, IOException {

		AdactinLoginPage ad = new AdactinLoginPage();
		ad.adactinLogin(getExcelSingleData("Sheet1", 1, 1), getExcelSingleData("Sheet1", 1, 2));
		sleep();
		String actual = getAppTitle();
		String expected = getExcelSingleData("Sheet1", 1, 3);
		Assert.assertEquals(actual, expected);
		sleep();
		System.out.println("test1");
	}

	@Test(dependsOnMethods = "loginTest")
	private void searchHotelTest() throws IOException, InterruptedException {
		SearchHotelPage sh = new SearchHotelPage();
		sh.searchHotel(getExcelSingleData("Sheet1", 1, 4), getExcelSingleData("Sheet1", 1, 5),
				getExcelSingleData("Sheet1", 1, 6), getExcelSingleData("Sheet1", 1, 7),
				getExcelSingleData("Sheet1", 1, 8), getExcelSingleData("Sheet1", 1, 9),
				getExcelSingleData("Sheet1", 1, 10), getExcelSingleData("Sheet1", 1, 11));
		

		WebElement selectHotelText = sh.getSelectHotelText();
		String actual = elementGetText(selectHotelText);

		Assert.assertEquals(actual, getExcelSingleData("Sheet1", 3, 3));
		System.out.println("test2");

	}

	@Test(dependsOnMethods = "searchHotelTest")
	private void selectHotel() throws InterruptedException, IOException {
		selectHotelPage shp = new selectHotelPage();
		shp.selectHotel();
		sleep();
		WebElement bookHotelText = shp.getBookHotelText();
		String actual = elementGetText(bookHotelText);
		Assert.assertEquals(actual, getExcelSingleData("Sheet1", 5, 3));
		sleep();
		System.out.println("test3");
	}

	@Test(dependsOnMethods = "selectHotel")
	private void bookHotel() throws InterruptedException, IOException {
		BookHotelPage bh = new BookHotelPage();
		bh.bookHotel(getExcelSingleData("Sheet1", 1, 12), getExcelSingleData("Sheet1", 1, 13),
				getExcelSingleData("Sheet1", 1, 14), getExcelSingleData("Sheet1", 1, 15),
				getExcelSingleData("Sheet1", 1, 16), getExcelSingleData("Sheet1", 1, 17),
				getExcelSingleData("Sheet1", 1, 18), getExcelSingleData("Sheet1", 1, 19));
		WebElement bookingConfirmationText = bh.getBookingConfirmationText();
		String actual = elementGetText(bookingConfirmationText);

		try {
			SoftAssert s = new SoftAssert();
			s.assertEquals(actual, getExcelSingleData("Sheet1", 7, 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		}
		sleep();
		System.out.println("test4");
	}

	@Test(dependsOnMethods = "bookHotel")
	private void bookingConfirmation() {
		// TODO Auto-generated method stub
		BookingConfirmationPage bc = new BookingConfirmationPage();
		String actual = bc.bookingConfirm();
		boolean blank = actual.isBlank();
		Assert.assertFalse(blank);
		System.out.println("test5");

	}

}
