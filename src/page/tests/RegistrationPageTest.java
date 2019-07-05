package page.tests;

import java.util.*;

import org.openqa.selenium.*;

import page.objects.*;
import utility.*;

public class RegistrationPageTest {
	// Making registration by user input through scanner
	public static void scannerRegistration(WebDriver driver) {
		Scanner unos = new Scanner(System.in);

		// Firstname registration
		RegistrationPage.clickFirstName(driver);
		System.out.println("Enter your first name:");
		String firstName = unos.nextLine();
		RegistrationPage.sendKeysFirstName(driver, firstName);

		// Lastname registration
		RegistrationPage.clickLastName(driver);
		System.out.println("Enter your last name:");
		String lastName = unos.nextLine();
		RegistrationPage.sendKeysLastName(driver, lastName);

		// Username registration
		RegistrationPage.clickUserName(driver);
		System.out.println("Enter your username:");
		String username = unos.nextLine();
		RegistrationPage.sendKeysUserName(driver, username);

		// Email registration
		RegistrationPage.clickEmail(driver);
		System.out.println("Enter your email:");
		String Email = unos.nextLine();
		RegistrationPage.sendKeysEmail(driver, Email);

		// Password registration
		RegistrationPage.clickPassword(driver);
		System.out.println("Enter your password:");
		String password = unos.nextLine();
		RegistrationPage.sendKeysPassword(driver, password);

		// Submit registration
		RegistrationPage.clickSubmitButton(driver);
	}

	// Making registration input through Excel
	public static void excelRegistration(WebDriver driver) throws Exception {
		String data;

		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_TESTDATA, Constant.SHEET_NAME1);

		// Loop that is initiating pass through the Excel table where is collecting data
		// for registration
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			// Firstname registration
			RegistrationPage.clickFirstName(driver);
			data = ExcelUtils.getCellData(i, 0);
			RegistrationPage.sendKeysFirstName(driver, data);
			// Lastname registration
			RegistrationPage.clickLastName(driver);
			data = ExcelUtils.getCellData(i, 1);
			RegistrationPage.sendKeysLastName(driver, data);
			// Username registration
			RegistrationPage.clickUserName(driver);
			data = ExcelUtils.getCellData(i, 2);
			RegistrationPage.sendKeysUserName(driver, data);
			// Email registration
			RegistrationPage.clickEmail(driver);
			data = ExcelUtils.getCellData(i, 3);
			RegistrationPage.sendKeysEmail(driver, data);
			// Password registration
			RegistrationPage.clickPassword(driver);
			data = ExcelUtils.getCellData(i, 4);
			RegistrationPage.sendKeysPassword(driver, data);
			// Submit registration
			RegistrationPage.clickSubmitButton(driver);
		}
	}
}
