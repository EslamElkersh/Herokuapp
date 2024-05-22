package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLinks("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLinks("Dropdown");
        return new DropDownPage(driver);
    }
    public ForgetPasswordPage clickForgetPassword(){
        clickLinks("Forgot Password");
        return new ForgetPasswordPage(driver);
    }
    public HoversPage clickHovers(){
        clickLinks("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLinks("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLinks("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public AlertsPage clickJavaScricptAlerts(){
        clickLinks("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLinks("File Upload");
        return new FileUploadPage(driver);
    }
    public ContextMenuPage clickContextMenu(){
        clickLinks("Context Menu");
        return new ContextMenuPage(driver);
    }
    public WYSIWYGEditorPage clickWYSIWYGEditor(){
        clickLinks("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }
    public FramesPage clickFrames(){
        clickLinks("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLinks("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDOMPage clickLargeAndDeepDOM(){
        clickLinks("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLinks("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLinks("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    private void clickLinks(String link) {
        driver.findElement(By.linkText(link)).click();
    }

}
