package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider =By.cssSelector(".sliderContainer input");
    private By counter = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }
    public void incrementSlider(){
       for (int i=0;i<8;i++)
           driver.findElement(slider).sendKeys(Keys.ARROW_UP);
    }
    public String getCounter(){
       return driver.findElement(counter).getText();
    }
}
