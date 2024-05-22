package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {
    private WebDriver driver;

    public NestedFramesPage(WebDriver driver){
        this.driver=driver;
    }

    public String getFrameText(String name){
        if(name=="frame-bottom")
         {switchToFrame(name);}
        else {
                switchToFrame("frame-top");
                switchToFrame(name);
             }
        String text= driver.findElement(By.tagName("body")).getText();
        switchToMain();
        return text;
    }

    private void switchToFrame(String name){

            driver.switchTo().frame(name);

    }
    private void switchToMain(){
        driver.switchTo().parentFrame();
    }

}
