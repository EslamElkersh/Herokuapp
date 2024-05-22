package base;

import Pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.CookieManager;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
   @BeforeClass
    public void setUp(){
        driver = new ChromeDriver(getChromeOptions());
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        goHome();

    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    public WindowManager getWindowManager(){
       return new WindowManager(driver);
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
       if(ITestResult.FAILURE==result.getStatus())
       {
           var camera =(TakesScreenshot)driver;
           File screenShot = camera.getScreenshotAs(OutputType.FILE);
           try {
               Files.move(screenShot,new File("resources/screenShots/"+result.getName()+"+.png"));
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
    }
    private ChromeOptions getChromeOptions(){
       ChromeOptions options = new ChromeOptions();

       // options.addArguments("--window-size=1920,1080");
       options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
       options.setExperimentalOption("useAutomationExtension", false);
        //options.addArguments("--headless");
       return options;
    }
public CookieManager getCookieManager(){
       return new CookieManager(driver);
}
}
