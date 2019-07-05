package page.tests;

import java.util.*;

import org.openqa.selenium.*;

import page.objects.*;
import utility.*;

public class LoginPageTest {
	// Making login by user input through scanner
	public static void scannerLogin(WebDriver driver) throws Exception {
		Scanner unos = new Scanner(System.in);
		// Username login
		LoginPage.clickLoginUsername(driver);
		System.out.println("Enter your username:");
		String username = unos.nextLine();
		LoginPage.sendKeysLoginUsername(driver, username);
		// Password login
		LoginPage.clickLoginPassword(driver);
		System.out.println("Enter your Password:");
		String password = unos.nextLine();
		LoginPage.sendKeysLoginPassword(driver, password);
		// Submit login
		LoginPage.clickLoginButton(driver);
	}
	
	
	// Making login input through Excel
	public static void excelLogin(WebDriver driver) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_TESTDATA, Constant.SHEET_NAME1);

		// Loop that is initiating pass through the Excel table where is collecting data
		// for login
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			// Username Login
			LoginPage.clickLoginUsername(driver);
			data = ExcelUtils.getCellData(i, 2);
			LoginPage.sendKeysLoginUsername(driver, data);
			// Password Login
			LoginPage.clickLoginPassword(driver);
			data = ExcelUtils.getCellData(i, 4);
			LoginPage.sendKeysLoginPassword(driver, data);
			// Submit login
			LoginPage.clickLoginButton(driver);
			// Submit logout
			LoginPage.clickLogoutButton(driver);
		}
	}
}
