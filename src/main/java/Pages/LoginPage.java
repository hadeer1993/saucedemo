package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBases{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(id="user-name")
    WebElement User_Name;

    @FindBy(id="password")
    WebElement User_Password;

    @FindBy(id="login-button")
    WebElement Login_Button;

    public void User_Login(String username , String password)
    {
        sendtext(User_Name, username);
        sendtext(User_Password, password);
        clickbutton(Login_Button);
    }
}

