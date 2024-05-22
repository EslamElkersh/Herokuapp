package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By boxField = By.id("hot-spot");
    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
    }
    public void rightClickBoxField(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(boxField)).perform();
    }
    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
