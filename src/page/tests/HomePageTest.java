package page.tests;

import org.openqa.selenium.*;

import page.objects.*;

public class HomePageTest {

	public static void testOpenHomePage(WebDriver driver) {
		//Open Home Page
		HomePage.openHomePage(driver);
		if (driver.getCurrentUrl().contains(HomePage.PAGE_URL)) {
			System.out.println("The page is equals like " + HomePage.PAGE_URL);
		} else {
			System.out.println("The page is not equals like " + HomePage.PAGE_URL);
		}
	}
}