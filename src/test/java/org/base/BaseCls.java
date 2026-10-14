package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseCls {
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	public static Actions a;
	public static Alert a1;
	public static JavascriptExecutor js;
	public static Robot r;
	public static Select s;

	public static WebDriver getDriver() {
		return tldriver.get();
	}

	public static void setDriver(WebDriver driver) {
		tldriver.set(driver);
	}

	public static void openchrome() {
		ChromeDriver cd = new ChromeDriver();
		setDriver(cd);
	}

	public static void openfire() {
		FirefoxDriver ff = new FirefoxDriver();
		setDriver(ff);
	}

	public static void openedge() {
		EdgeDriver ed = new EdgeDriver();
		setDriver(ed);
	}

	public static void launchUrl(String Url) {
		getDriver().get(Url);
	}

	public static void maxWin() {
		getDriver().manage().window().maximize();
	}

	public static void closeTheTab() {
		getDriver().close();
	}

	public static void quiteTheBrowser() {
		getDriver().quit();
	}

	public static void conditionalWait(int sec) {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public static void WaitClick(WebElement ref) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(ref));
	}
	public static void WaitFrame(int num) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(num));
	}

	public static String title() {
		return getDriver().getTitle();
	}

	public static String currentUrl() {
		return getDriver().getCurrentUrl();
	}

	public static void passTheValues(WebElement ref, String value) {
		ref.sendKeys(value);
	}

	public static void pressTheButton(WebElement ref) {
		ref.click();
	}

	public static String getTheText(WebElement ref) {
		return ref.getText();
	}

	public static void getTheAttribute(WebElement ref, String value) {
		ref.getAttribute(value);
	}

	public static void moveTo(WebElement ref) {
		a = new Actions(getDriver());
		a.moveToElement(ref).perform();
	}

	public static void robotTab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public static void robotEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void robotdown() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	public static void robotEscape() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
	}

	public static void rightClick(WebElement ref) {
		a.contextClick(ref).perform();
	}

	public static void doubleClick(WebElement ref) {
		a.doubleClick(ref).perform();
	}

	public static void acceptAlert() {
		a1 = getDriver().switchTo().alert();
		a1.accept();
	}

	public static void dismissAlert() {
		a1.dismiss();
	}

	public static void jsSendkeys(WebElement ref, String value) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].setAttribute('value')", value, ref);
	}

	public static void jsClick(WebElement ref) {
		js.executeScript("arguments[0].click()", ref);
	}

	public static void jsScroll(WebElement ref) {
		js.executeScript("arguments[0].ScrollIntoView()", ref);
	}

	public static void clear(WebElement ref) {
		ref.clear();
	}

	public static void takeShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File f = ts.getScreenshotAs(OutputType.FILE);
		File f1 = new File(path);
		FileUtils.copyFile(f, f1);
	}

	public static void switchWindow(int ref) {

		Set<String> windowHandles = getDriver().getWindowHandles();

		List<String> li = new ArrayList<String>();
		li.addAll(windowHandles);
		String s = li.get(ref);
		getDriver().switchTo().window(s);
	}

	public static void switchframe(int index) {
		getDriver().switchTo().frame(index);
	}

	public static void mainframe() {
		getDriver().switchTo().defaultContent();
	}

	public static void parentframe() {
		getDriver().switchTo().parentFrame();
	}

	public static void selectin(WebElement ref, int index) {
		s = new Select(ref);
		s.selectByIndex(index);
	}

	public static void selectvis(WebElement ref, String value) {
		s = new Select(ref);
		s.selectByVisibleText(value);
	}

	public static Boolean displayed(WebElement ref) {
		boolean dis = ref.isDisplayed();
		return dis;

	}
	public static void propertyUrl() {
		
	}

	public static String readDataFromExcel(String inkspired, String Sheet1, int row, int cell) throws IOException {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\InkSpiredBDD\\SourceFile\\"+inkspired+".xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);

		Sheet sheet = book.getSheet(Sheet1);
		Row r = sheet.getRow(row);
		Cell c = r.getCell(cell);
		String s1;
		if (c.getCellType() == 1) {
			s1 = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dcv = c.getDateCellValue();
			SimpleDateFormat sd = new SimpleDateFormat("DD-MM-YYYY");
			s1 = sd.format(dcv);

		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			s1 = String.valueOf(l);
		}
		return s1;
	}
}
