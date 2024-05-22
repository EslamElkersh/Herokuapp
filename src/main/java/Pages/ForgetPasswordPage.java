package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");
    public ForgetPasswordPage(WebDriver driver){
        this.driver=driver;
    }

    public void setEmailField(){
        driver.findElement(emailField).sendKeys("eslam@example.com");
    }
    public MessageSentPage clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new MessageSentPage(driver);
    }
}
