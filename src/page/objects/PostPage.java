package page.objects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PostPage {

	// Defining of values for web paths
	public static final String POST_URL = "http://localhost/izlet/dashboard.php";
	private static final String CREATE_POST = "//a[contains(text(),'Make a post')]";
	private static final String POST_NAME = "//input[@placeholder='Naziv']";
	private static final String POST_LOCATION = "//input[@placeholder='Lokacija']";
	private static final String BROWSE_BTN = "//input[@id='image']";
	private static final String TRANSPORT = "//div[@class='popupPost']//select[@name='transport']";
	private static final String DESCRIPTION = "//textarea[@placeholder='Opis']";
	private static final String POST_BTN = "//div[@class='popupPost']//input[@name='postSubmit']";

	// Open Post page
	public static void openPostPage(WebDriver driver) {
		driver.get(POST_URL);
	}

	// Find "Make A Post" Button
	public static WebElement getNewPost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(CREATE_POST));
		return wb;
	}

	// Click on "Make A Post" Button
	public static void clickNewPost(WebDriver driver) {
		getNewPost(driver).click();
	}

	// Find a "Post Name"
	public static WebElement getPostName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(POST_NAME));
		return wb;
	}

	// Click on "Post Name"
	public static void clickPostName(WebDriver driver) {
		getPostName(driver).click();
	}

	// Set "Post Name"
	public static void sendKeysPostName(WebDriver driver, String s) {
		getPostName(driver).sendKeys(s);
	}

	// Find a "Post Location"
	public static WebElement getPostLocation(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(POST_LOCATION));
		return wb;
	}

	// Click on "Post Location"
	public static void clickPostLocation(WebDriver driver) {
		getPostLocation(driver).click();
	}

	// Set "Post Location"
	public static void sendKeysPostLocation(WebDriver driver, String s) {
		getPostLocation(driver).sendKeys(s);
	}

	// Find "Browse" Image Button
	public static WebElement getBrowseButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(BROWSE_BTN));
		return wb;
	}

	// Set Image
	public static void sendKeysBrowseButton(WebDriver driver) {
		getBrowseButton(driver).sendKeys("C:\\Users\\Tamara\\Desktop\\Tamara\\SeleniumProjecet\\bombonice.jpg");
	}

	// Select from dropdown manu "Transport"
	public static void selectTransport(WebDriver driver, String s) {
		Select transport = new Select(driver.findElement(By.xpath(TRANSPORT)));
		transport.selectByVisibleText(s);
	}

	// Find "Description" 
	public static WebElement getDescription(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(DESCRIPTION));
		return wb;
	}

	// Click on "Description" 
	public static void clickDescription(WebDriver driver) {
		getDescription(driver).click();
	}

	// Set "Description"
	public static void sendKeysDescription(WebDriver driver, String s) {
		getDescription(driver).sendKeys(s);
	}

	// Find "Post" Button
	public static WebElement getPostButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(POST_BTN));
		return wb;
	}

	// Click on "Post" Button
	public static void clickPostButton(WebDriver driver) {
		getPostButton(driver).click();
	}

}
