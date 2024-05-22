package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MessageSentPage {
    private WebDriver driver;
    private By alertMessage = By.tagName("h1");
    public MessageSentPage(WebDriver driver){
        this.driver=driver;
    }
    public String getAlertMessage(){
        return driver.findElement(alertMessage).getText();
    }
}
