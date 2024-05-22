package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[text()=\"Click for JS Alert\"]");
    private By triggerConfirmButton = By.xpath("//button[text()=\"Click for JS Confirm\"]");
    private By triggerPromptButton = By.xpath("//button[text()=\"Click for JS Prompt\"]");


    private By resultMessage = By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickJsAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getResultMessage(){
        return driver.findElement(resultMessage).getText();
    }
    public void clickJsConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void dismissConfirm(){
        driver.switchTo().alert().dismiss();
    }
    public String getJsConfirmMessage(){
        return driver.switchTo().alert().getText();
    }
    public void clickJsPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public void enterPromptText(String promptMessage){
        driver.switchTo().alert().sendKeys(promptMessage);
    }
    public void acceptPrompt(){
        driver.switchTo().alert().accept();
    }

}
