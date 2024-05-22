package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1Link();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refresh();
        getWindowManager().goTo("http://www.google.com");
    }
    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testSwitchToNewTab(){
        var buttonPage = homePage.clickDynamicLoading().rightClickExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(),"Start button is not displayed");

    }
}
