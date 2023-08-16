package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;

public class HomeTest extends TestBases{
	
	@BeforeTest
	  public void login() {
		LoginTest logintest = new LoginTest();
        logintest.UserCanLogin();
	}
	
	@Test(priority = 1)
    public void UserCanAddItemToCart() {
		HomePage homepage = new HomePage(driver);
        homepage.AddToCart();     
    }

}
