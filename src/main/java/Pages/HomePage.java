package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBases{

    public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement AddToCart_btn;

    @FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
    WebElement Cart_Icon;


    public void AddToCart()
    {
    	clickbutton(AddToCart_btn);
        clickbutton(Cart_Icon);
    }

}
