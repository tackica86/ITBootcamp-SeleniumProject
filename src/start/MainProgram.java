package start;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.graph.ElementOrder.Type;

import page.tests.*;

public class MainProgram {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Enter the number of tests you want to do:\n" + "\t1 - Automation Registration Test\n"
				+ "\t2 - Manual Registration Test\n" + "\t3 - Automation Login Test\n" + "\t4 - Manual Login Test\n"
				+ "\t5 - Automation Post Creating\n" + "\t6 - Manual Post Create\n" + "\t7 - Edit Post\n"
				+ "\t8 - Delete Post");
		TypeT type = TypeT.valueOfType(unos.nextInt());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		try {
			if (type == TypeT.AutomaticRegistration) {
				HomePageTest.testOpenHomePage(driver);
				RegistrationPageTest.excelRegistration(driver);
			} else if (type == TypeT.ManualRegistration) {
				HomePageTest.testOpenHomePage(driver);
				RegistrationPageTest.scannerRegistration(driver);
			} else if (type == TypeT.AutomaticLogin) {
				HomePageTest.testOpenHomePage(driver);
				LoginPageTest.excelLogin(driver);
			} else if (type == TypeT.ManualLogin) {
				HomePageTest.testOpenHomePage(driver);
				LoginPageTest.scannerLogin(driver);
			} else if (type == TypeT.AutomaticCreatePost) {
				HomePageTest.testOpenHomePage(driver);
				LoginPageTest.scannerLogin(driver);
				PostPageTest.excelNewPost(driver);
			} else if (type == TypeT.ManualCreatePost) {
				HomePageTest.testOpenHomePage(driver);
				LoginPageTest.scannerLogin(driver);
				PostPageTest.scannerNewPost(driver);
			} else if (type == TypeT.EditPost) {
				HomePageTest.testOpenHomePage(driver);
				LoginPageTest.scannerLogin(driver);
				EditPostTest.scannerEditPost(driver);
			} else if (type == TypeT.DeletePost) {
				HomePageTest.testOpenHomePage(driver);
				LoginPageTest.scannerLogin(driver);
				DeletePostTest.scannerDeletePost(driver);
			} else {
				System.err.println("\nYou entered wrong parameters!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}
}