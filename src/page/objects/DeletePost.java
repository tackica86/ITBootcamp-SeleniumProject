package page.objects;

import java.util.*;

import org.openqa.selenium.*;

public class DeletePost {
	private static final String POST_MORE = "fa-ellipsis-v";
	private static final String POST_DELETE = "fa-trash-alt";

	// Post more button
	public static WebElement getPostMore(WebDriver driver) {
		WebElement wb = driver.findElement(By.className(POST_MORE));
		return wb;
	}

	// Click on post more
	public static void clickPostMore(WebDriver driver) {
		getPostMore(driver).click();
	}

	// Delete post
	public static WebElement deletePost(WebDriver driver) throws InterruptedException {
		List<WebElement> list = driver.findElements(By.className(POST_DELETE));
		return list.get(0);
	}

	// Click on Delete post
	public static void clickDeletePost(WebDriver driver) throws InterruptedException {
		// for (int i=0; i<n; i++) {
		deletePost(driver).click();

	}
}
