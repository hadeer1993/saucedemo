package Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.HashMap;

public class TestBases {
	public static WebDriver driver;

    public static String downloadPath = System.getProperty("user.dir") + "\\Downloads";

    public static FirefoxOptions firefoxOption() {
        FirefoxOptions option = new FirefoxOptions(); 
        option.addPreference("browser.download.folderList", 2);
        option.addPreference("browser.download.dir", downloadPath);
        option.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
        option.addPreference("browser.download.manager.showWhenStarting", false);
        option.addPreference("pdf.disabled", true);
        return option;
    }

    public static ChromeOptions chromeOption() {
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default.content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadPath);
        options.setExperimentalOption("prefs", chromePrefs);
        // options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return options;
    }

    @BeforeTest
    @Parameters({ "browser" })
    public void startdriver(@Optional("chrome") String browsername) {
        if (browsername.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOption());
        } else if (browsername.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(firefoxOption());
        }
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @AfterClass
    public void stopdriver() {
        // driver.quit();
    }

    @AfterMethod
    public void takescreenshotonfail(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Test case failed");
            System.out.println("Taking Screenshot .......");
            
        }
    }
    
    public void OpenChrome(String url){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to(url);
    }
    
    public static void ClickEnterAction() {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER);
		action.perform();
	}
    
    public static void PasteAction() {
		Actions action=new Actions(driver);
		action.keyDown( Keys.CONTROL ).sendKeys( "v" ).keyUp( Keys.CONTROL ).build().perform();
	}
    
    public static void DownAction() {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN);
		action.perform();
	}
    
    

}
