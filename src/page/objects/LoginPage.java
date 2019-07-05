package page.objects;

import org.openqa.selenium.*;

public class LoginPage {

	// Defining of values for web paths
	private static final String LOGIN_USERNAME = "//input[@placeholder='username']";
	private static final String LOGIN_PASSWORD = "//input[@placeholder='password']";
	private static final String LOGIN_BTN = "//input[@name='login']";
	private static final String LOGOUT_BTN = "//a[@id='logoutBtn']";

	// Login "Username"
	public static WebElement getLoginUsername(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGIN_USERNAME));
		return wb;
	}

	// Click on Login "Username"
	public static void clickLoginUsername(WebDriver driver) {
		getLoginUsername(driver).click();

	}

	// Set Login "Username"
	public static void sendKeysLoginUsername(WebDriver driver, String s) {
		getLoginUsername(driver).sendKeys(s);
	}

	// Login "Password"
	public static WebElement getLoginPassword(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGIN_PASSWORD));
		return wb;
	}

	// Click on Login "Password"
	public static void clickLoginPassword(WebDriver driver) {
		getLoginPassword(driver).click();

	}

	// Set Login "Password"
	public static void sendKeysLoginPassword(WebDriver driver, String s) {
		getLoginPassword(driver).sendKeys(s);
	}

	// Login Button
	public static WebElement getLoginButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGIN_BTN));
		return wb;
	}

	// Click on Login Button
	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();

	}

	// Logout Button
	public static WebElement getLogoutButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGOUT_BTN));
		return wb;
	}

	// Click on Logout Button
	public static void clickLogoutButton(WebDriver driver) {
		getLogoutButton(driver).click();

	}
}
