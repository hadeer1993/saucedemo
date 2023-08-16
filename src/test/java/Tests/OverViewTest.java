package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.InformationPage;
import Pages.OverViewPage;

public class OverViewTest extends TestBases{
	@BeforeTest
	  public void InformationScreen() {
		InformationTest infotest = new InformationTest();
		infotest.OpenCartScreen();
		infotest.UserAddInfo();
	}
	
	@Test(priority = 1)
      public void UserAddInfo() {
		OverViewPage viewpage = new OverViewPage(driver);
        viewpage.Finish();    
}
}


