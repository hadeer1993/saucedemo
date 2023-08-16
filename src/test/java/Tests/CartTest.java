package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CartPage;

public class CartTest extends TestBases{
	@BeforeTest
	  public void OpenHomeScreen() {
		HomeTest hometest = new HomeTest();
		hometest.login();
        hometest.UserCanAddItemToCart();
	}
	
	@Test(priority = 1)
  public void UserCanAddItemToCart() {
		CartPage cartpage = new CartPage(driver);
        cartpage.Checkout();     
  }


}
