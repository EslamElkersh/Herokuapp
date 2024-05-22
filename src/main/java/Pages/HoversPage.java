package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption= By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver=driver;
    }

    /**
     *
     * @param index starts at 1
     * @return
     */
    public FigureCaptions hoverOverFigure(int index){
        Actions actions = new Actions(driver);
        WebElement figure = driver.findElements(figureBox).get(index-1);
        actions.moveToElement(figure).perform();
        return new FigureCaptions(figure.findElement(boxCaption));

    }

    public class FigureCaptions{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");
        public FigureCaptions(WebElement caption){
            this.caption=caption;
        }
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }
        public String getTitle(){
             return caption.findElement(header).getText();
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
    }

}
