package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends PageBases{

	public InformationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="first-name")
    WebElement First_Name;

    @FindBy(id="last-name")
    WebElement Last_Name;

    @FindBy(id="postal-code")
    WebElement Postal_Code;
    
    @FindBy(id="continue")
    WebElement Continue_Button;

    public void User_Login(String first , String last , String code)
    {
        sendtext(First_Name, first);
        sendtext(Last_Name, last);
        sendtext(Postal_Code, code);
        clickbutton(Continue_Button);
    }

}
