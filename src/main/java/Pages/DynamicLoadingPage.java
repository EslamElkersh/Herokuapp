package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By examle1Link=By.xpath("//a[contains(.,\"hidden\")]");
    private By examle2Link=By.xpath("//a[contains(.,\"fact\")]");


    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }
    public DynamicLoadingExample1Page clickExample1Link(){
        driver.findElement(examle1Link).click();
        return new DynamicLoadingExample1Page(driver);
    }
    public DynamicLoadingExample2Page clickExample2Link(){
        driver.findElement(examle2Link).click();
        return new DynamicLoadingExample2Page(driver);
    }
    public DynamicLoadingExample2Page rightClickExample2Link(){
        driver.findElement(examle2Link).sendKeys(Keys.CONTROL,Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }


}
