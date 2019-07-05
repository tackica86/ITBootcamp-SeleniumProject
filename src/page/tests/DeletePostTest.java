package page.tests;

import java.util.*;

import org.openqa.selenium.*;

import page.objects.*;

public class DeletePostTest {
	// Making delete post by user input through scanner
	public static void scannerDeletePost(WebDriver driver) throws Exception {
		Scanner unos = new Scanner(System.in);
		System.out.println("Enter number of posts that you want to delete:");
		int n = unos.nextInt();
		for (int i = 0; i < n; i++) {
			DeletePost.clickPostMore(driver);
			DeletePost.clickDeletePost(driver);
		}
	}
}