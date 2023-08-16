package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverViewPage extends PageBases{

	public OverViewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 @FindBy(id="finish")
	    WebElement Finish_Button;

	    public void Finish()
	    {
	        clickbutton(Finish_Button);
	    }

}
