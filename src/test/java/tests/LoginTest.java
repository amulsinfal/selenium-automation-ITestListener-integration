package tests;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.ConfigReader;

public class LoginTest extends BaseTest {

	@Test(priority = 1, groups = { "Sanity, Regression" }, description = "Test to verify login with valid credentials.")
	public void testLoginWithValidCredentials() {
		LoginPage loginPage = new LoginPage(driver);
		ProductsPage productsPage = loginPage.login(ConfigReader.getValue("QA", "validUser"),ConfigReader.getValue("QA", "validPass"));
		assertTrue(productsPage.isPageDisplayed(), "Products Page is not displayed.");
	}

	@Test(priority = 2, groups = { "Regression" }, description = "Test to verify login with locked credentials.")
	public void testLoginWithLockedCredentials() {
		// Skipped for testing ITestListener implementation.
		throw new SkipException("This test is Intentionally skipped for ITestListener test.");
	}

	@Test(priority = 3, groups = { "Regression" }, description = "Test to verify login with invalid credentials.")
	public void testLoginWithInvalidCredentials() {
		// Failed for testing ITestListener implementation.
	    fail("This test is Intentionally failed for ITestListener test.");
	}
}
