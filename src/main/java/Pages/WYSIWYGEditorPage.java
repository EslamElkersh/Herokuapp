package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorIframeId="mce_0_ifr";
    private By textArea=By.id("tinymce");
    private By decreaseIndentButton = By.xpath("(//div[@title=\"indentation\"]/button)[2]");
    public WYSIWYGEditorPage(WebDriver driver){
        this.driver=driver;
    }
    public void clearTextArea(){
        switchToEditorFrame();
        driver.findElement(textArea).clear();
        switchToMainFrame();
    }
    public void setTextArea(String text){
        switchToEditorFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToMainFrame();
    }
    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }
    public String getStringFromEditor(){
        switchToEditorFrame();
        String text = driver.findElement(textArea).getText();
        switchToMainFrame();
        return text;
    }
    private void switchToEditorFrame(){
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }
}
