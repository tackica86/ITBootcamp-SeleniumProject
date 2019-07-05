package page.objects;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class EditPost {
	private static final String POST_MORE = "fa-ellipsis-v";
	private static final String POST_EDIT = "fa-edit";
	private static final String EDIT_POST_NAME = "//input[@id='title']";
	private static final String EDIT_POST_LOCATION = "//input[@id='location']";
	private static final String EDIT_POST_BROWSE_BTN = "//input[@id='editImage']";
	private static final String EDIT_POST_TRANSPORT = "//select[@id='transport']";
	private static final String EDIT_POST_DESCRIPTION = "//textarea[@id='description']";
	private static final String EDIT_POST_BTN = "//div[@class='popupEdit']//input[@name='postSubmit']";

	// Post - edit button
	public static WebElement postMore(WebDriver driver) {
		WebElement wb = driver.findElement(By.className(POST_MORE));
		return wb;
	}

	// Click on post more
	public static void clickPostMore(WebDriver driver) {
		postMore(driver).click();
		
	}

	// Edit post
	public static WebElement editPost(WebDriver driver)  {
		List<WebElement> list = driver.findElements(By.className(POST_EDIT));
		return list.get(0);
	}

	// Click on Edit post
	public static void clickEditPost(WebDriver driver) {
		editPost(driver).click();
	}

	// Find a Post Name
	public static WebElement editPostName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDIT_POST_NAME));
		return wb;
	}

	// Click on Post Name
	public static void clickEditPostName(WebDriver driver) {
		editPostName(driver).click();
		editPostName(driver).clear();

	}

	// Set Post name
	public static void sendKeysEditPostName(WebDriver driver, String s) {
		editPostName(driver).sendKeys(s);
	}

	// Find a Post Location
	public static WebElement editPostLocation(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDIT_POST_LOCATION));
		return wb;
	}

	// Click on Post location
	public static void clickEditPostLocation(WebDriver driver) {
		editPostLocation(driver).click();
		editPostLocation(driver).clear();
	}

	// Set Post Location
	public static void sendKeysEditPostLocation(WebDriver driver, String s) {
		editPostLocation(driver).sendKeys(s);
	}

	// Find Browse Image Button
	public static WebElement getEditBrowseButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDIT_POST_BROWSE_BTN));
		return wb;
	}

	// Set Image
	public static void sendKeysEditBrowseButton(WebDriver driver) {
		getEditBrowseButton(driver).sendKeys("C:\\Users\\Tamara\\Desktop\\Tamara\\SeleniumProjecet\\gumene.jpg");
	}

	// Select from dropdown manu Transport
	public static void selectEditTransport(WebDriver driver, String s) {
		Select transport = new Select(driver.findElement(By.xpath(EDIT_POST_TRANSPORT)));
		transport.selectByVisibleText(s);
	}

	// Find Description
	public static WebElement editDescription(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDIT_POST_DESCRIPTION));
		return wb;
	}

	// Click on Description
	public static void clickEditDescription(WebDriver driver) {
		editDescription(driver).click();
		editDescription(driver).clear();
	}

	// Set Description
	public static void sendKeysEditDescription(WebDriver driver, String s) {
		editDescription(driver).sendKeys(s);
	}

	// Find Post Button
	public static WebElement editPostButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDIT_POST_BTN));
		return wb;
	}

	// Click on Post Button
	public static void clickEditPostButton(WebDriver driver) {
		editPostButton(driver).click();
	}
}