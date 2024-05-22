package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By framesLink = By.xpath("//a[text()=\"Nested Frames\"]");
    public FramesPage(WebDriver driver){
        this.driver=driver;
    }
    public NestedFramesPage clickNestedFrames(){
        driver.findElement(framesLink).click();
        return new NestedFramesPage(driver);
    }
}
