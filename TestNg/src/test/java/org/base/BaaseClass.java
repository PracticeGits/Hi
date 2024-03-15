package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.facebookTestNgPom.FacebookLoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaaseClass {
	public static WebDriver driver;
	
	
	

	public static void BrowserLaunch() {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
//		driver = WebDriverManager.chromedriver().create();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void elementSendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void elementClick(WebElement element) {
		element.click();
	}

	public String getAppTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void clear(WebElement element) {
		// TODO Auto-generated method stub
		element.clear();
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static WebElement findLocatorById(String value) {
		WebElement element = driver.findElement(By.id(value));
		return element;
	}

	public static List<WebElement> findElements(String value) {
		List<WebElement> elements = driver.findElements(By.xpath(value));
		return elements;
	}

	public static WebElement findLocatorByName(String value) {
		WebElement element = driver.findElement(By.name(value));
		return element;
	}

	public static WebElement findLocatorByXpath(String value) {
		WebElement element = driver.findElement(By.xpath(value));
		return element;
	}

	public static String elementGetText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public void quit() {
		driver.quit();
	}

	public void closeWindow() {
		driver.close();
	}

	public static void selectOptionByText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}

	public static void selectOptionByAttributeValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void selectOptionByIndex(WebElement element, int value) {
		Select s = new Select(element);
		s.selectByIndex(value);
	}

	public void alertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String webaPagetext(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String insertedValue(WebElement element) {
		String attribute = element.getAttribute(null);
		return attribute;
	}

	public void closeAllWindows() {
		driver.quit();
	}

	public void closeCurrnetWindow() {
		driver.close();
	}

	public String enteredUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void insertValueJs(WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],SetAttribute('value','" + text + "')", element);

	}

	public void clickJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public String parentWindow() {
		String parent = driver.getWindowHandle();
		return parent;

	}

	public String childWindow(String index) {
		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (!parent.equals(string)) {
				driver.switchTo().window(index);
			}

		}
		return index;
	}

	public void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public List<WebElement> getAllOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}
	
	public String getattributevalue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public List<WebElement> selectgetAttributevalue(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}
	public WebElement firstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public void isMultiSelect(WebElement element) {

		Select s = new Select(element);
	}

	public static void closeIcons(List<WebElement> element) throws InterruptedException {
		// List<WebElement> closeIcons1 = driver.findElements(By.xpath(""));
		int size1 = element.size();
		System.out.println(size1);
		for (int i = 0; i <= element.size()+1; i++) {
			int size = element.size();
			System.out.println(size);
			WebElement webElement = element.get(0);
			webElement.click();
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			if (i < element.size()-1) {
				WebElement cartbutton = findLocatorByXpath("//a[@class='cart_btn']");
				cartbutton.click();
				Thread.sleep(3000);

			} else {
				break;
			}
		}

	}

	public String getExcelSingleData(String sheetname, int rownum, int cellnum) throws IOException {
		String res = "";
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\TestNg\\Excel\\Testng.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
				res = format.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				if (numericCellValue == round) {
					res = String.valueOf(round);
				} else {
					res = String.valueOf(numericCellValue);
				}
			}
			break;

		default:
			break;

		}
		return res;

	}

	public void updateExcelData(String sheetname, int rownum, int cellnum, String olddata, String newdata)
			throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven\\Excel\\omr.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals(olddata)) {
			cell.setCellValue(newdata);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	public void createCellInsertData(String sheetname, int rownum, int cellnum, String data) throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven\\Excel\\omr.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

}
