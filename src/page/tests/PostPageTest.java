package page.tests;

import java.util.*;

import org.openqa.selenium.*;

import page.objects.*;
import utility.*;

public class PostPageTest {
	// Open Post Page
	public static void testOpenPostPage(WebDriver driver) {
		PostPage.openPostPage(driver);
		if (driver.getCurrentUrl().contains(PostPage.POST_URL)) {
			System.out.println("The page is equals like " + PostPage.POST_URL);
		} else {
			System.out.println("The page is not equals like " + PostPage.POST_URL);
		}
	}

	// Making new post by user input through scanner
	public static void scannerNewPost(WebDriver driver) throws Exception {
		Scanner unos = new Scanner(System.in);
		// New Post Button
		PostPage.clickNewPost(driver);
		// Post Name
		PostPage.clickPostName(driver);
		System.out.println("Enter the name of your post:");
		String postName = unos.nextLine();
		PostPage.sendKeysPostName(driver, postName);
		// Post Location
		PostPage.clickPostLocation(driver);
		System.out.println("Enter the location you want to describe:");
		String postLocation = unos.nextLine();
		PostPage.sendKeysPostLocation(driver, postLocation);

		// Image
		PostPage.sendKeysBrowseButton(driver);

		// Transport
		System.out.println("Choose transport: Walk, Car, Motorbike, " 
		+ "Bicycle or Bus:");
		String transport = unos.nextLine();
		PostPage.selectTransport(driver, transport);
		// Description
		PostPage.clickDescription(driver);
		System.out.println("Descrabe " + postLocation + ":");
		String description = unos.nextLine();
		PostPage.sendKeysDescription(driver, description);
		// Submit post
		PostPage.clickPostButton(driver);
	}

	// Making new post input through Excel
	public static void excelNewPost(WebDriver driver) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_TESTDATA, Constant.SHEET_NAME2);

		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			// New Post Button
			PostPage.clickNewPost(driver);
			// Name
			PostPage.clickPostName(driver);
			data = ExcelUtils.getCellData(i, 1);
			PostPage.sendKeysPostName(driver, data);
			// Location
			PostPage.clickPostLocation(driver);
			data = ExcelUtils.getCellData(i, 2);
			PostPage.sendKeysPostLocation(driver, data);
			// Description
			PostPage.clickDescription(driver);
			data = ExcelUtils.getCellData(i, 0);
			PostPage.sendKeysDescription(driver, data);
			// Submit post
			PostPage.clickPostButton(driver);

		}
	}
}