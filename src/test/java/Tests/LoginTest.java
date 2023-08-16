package Tests;
import Pages.LoginPage;

import java.time.Duration;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends TestBases {

    LoginPage loginpage;
    
    @BeforeTest
    public void OpenChrome() {
    	driver.navigate().to("https://www.saucedemo.com/");
    }


    @Test(priority = 1)
    public void UserCanLogin() {
        loginpage = new LoginPage(driver);
        loginpage.User_Login("standard_user", "secret_sauce");     
    }

}