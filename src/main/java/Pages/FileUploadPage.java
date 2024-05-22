package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileChooseButton = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     *
     * @param absolutePathOfFile The complete path of the file to upload
     */
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(fileChooseButton).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }
    public String getUploadedFiles(){
       return driver.findElement(uploadedFiles).getText();
    }

}
