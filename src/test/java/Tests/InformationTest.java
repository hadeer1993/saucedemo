package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.InformationPage;

public class InformationTest extends TestBases{
	@BeforeTest
	  public void OpenCartScreen() {
		CartTest carttest = new CartTest();
		carttest.OpenHomeScreen();
		carttest.UserCanAddItemToCart();
	}
	
	@Test(priority = 1)
        public void UserAddInfo() {
		InformationPage infopage = new InformationPage(driver);
        infopage.User_Login("Hadeer" , "Ali" , "2005");     
}


}
