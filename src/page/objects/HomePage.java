package page.objects;

import org.openqa.selenium.*;

public class HomePage {
	// Defining of values for web paths
	public static final String PAGE_URL = "http://localhost/izlet";

	// Open Home page
	public static void openHomePage(WebDriver driver) {
		driver.get(PAGE_URL);
	}
}
