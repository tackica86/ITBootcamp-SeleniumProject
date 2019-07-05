package page.objects;

import org.openqa.selenium.*;

public class RegistrationPage {
	// Defining of values for web paths
	private static final String FIRSTNAME = "//input[@name='firstname']";
	private static final String LASTNAME = "//input[@name='lastname']";
	private static final String USERNAME = "//div[@class='register_form']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String PASSWORD = "//div[@class='register_form']//input[@name='password']";
	private static final String SUBMIT_BTN = "//input[@id='blue_btn']";

	// Registration "Firstname"
	public static WebElement getFirstName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(FIRSTNAME));
		return wb;
	}

	// Click on "Firstname"
	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	// Set "Firstname"
	public static void sendKeysFirstName(WebDriver driver, String s) {
		getFirstName(driver).sendKeys(s);
	}

	// Registration "Lastname"
	public static WebElement getLastName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LASTNAME));
		return wb;
	}

	// Click on "Lastname"
	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	// Set "Lastname"
	public static void sendKeysLastName(WebDriver driver, String s) {
		getLastName(driver).sendKeys(s);
	}

	// Registration "Username"
	public static WebElement getUserName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(USERNAME));
		return wb;
	}

	// Click on "Username"
	public static void clickUserName(WebDriver driver) {
		getUserName(driver).click();
	}

	// Set "Username"
	public static void sendKeysUserName(WebDriver driver, String s) {
		getUserName(driver).sendKeys(s);
	}

	// Registration "Email"
	public static WebElement getEmail(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EMAIL));
		return wb;
	}

	// Click on "Email"
	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	// Set "Email"
	public static void sendKeysEmail(WebDriver driver, String s) {
		getEmail(driver).sendKeys(s);
	}

	// Registration "Password"
	public static WebElement getPassword(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(PASSWORD));
		return wb;
	}

	// Click on "Password"
	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	// Set "Password"
	public static void sendKeysPassword(WebDriver driver, String s) {
		getPassword(driver).sendKeys(s);
	}

	// Registration Submit button
	public static WebElement getSubmitButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(SUBMIT_BTN));
		return wb;
	}

	// Click onSubmit button
	public static void clickSubmitButton(WebDriver driver) {
		getSubmitButton(driver).click();
	}

}
