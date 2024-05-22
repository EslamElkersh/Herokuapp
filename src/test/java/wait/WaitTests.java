package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntillHidden(){
        var dynamicLoadingPage=homePage.clickDynamicLoading();
        var example1=dynamicLoadingPage.clickExample1Link();
        example1.clickStartButton();
        assertEquals(example1.getTextMessage(),"Hello World!","Loaded message is not Correct");
    }
    @Test
    public void testWaitRendering(){
        var dynamicLoadingPage=homePage.clickDynamicLoading();
        var example2=dynamicLoadingPage.clickExample2Link();
        example2.clickStartButton();
        assertEquals(example2.getTextMessage(),"Hello World!","Loaded message is not Correct");
    }

}
