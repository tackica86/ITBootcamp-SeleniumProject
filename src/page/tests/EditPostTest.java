package page.tests;

import java.util.*;

import org.openqa.selenium.*;

import page.objects.*;

public class EditPostTest {
	// Making edit post by user input through scanner
	public static void scannerEditPost(WebDriver driver) throws Exception {
		Scanner unos = new Scanner(System.in);
		// Edit Post more
		EditPost.clickPostMore(driver);
		// Edit Post
		EditPost.clickEditPost(driver);
		// Edit Post Name
		EditPost.clickEditPostName(driver);
		System.out.println("Enter the name of your post:");
		String postName = unos.nextLine();
		EditPost.sendKeysEditPostName(driver, postName);
		// Edit Post Location
		EditPost.clickEditPostLocation(driver);
		System.out.println("Enter the location you want to describe:");
		String postLocation = unos.nextLine();
		EditPost.sendKeysEditPostLocation(driver, postLocation);
		// Image
		EditPost.sendKeysEditBrowseButton(driver);
		// Transport
		System.out.println("Choose transport: Walk, Car, Motorbike, " 
		+ "Bicycle or Bus:");
		String transport = unos.nextLine();
		EditPost.selectEditTransport(driver, transport);
		// Description
		EditPost.clickEditDescription(driver);
		System.out.println("Descrabe " + postLocation + ":");
		String description = unos.nextLine();
		EditPost.sendKeysEditDescription(driver, description);
		// Submit post
		EditPost.clickEditPostButton(driver);
	}
}
