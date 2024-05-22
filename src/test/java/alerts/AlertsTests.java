package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertPage=homePage.clickJavaScricptAlerts();
        alertPage.clickJsAlert();
        alertPage.acceptAlert();
        assertEquals(alertPage.getResultMessage(),
                "You successfully clicked an alert",
                "The result message is not the same");
    }
    @Test
    public void testDismissConfirm(){
        var alertPage=homePage.clickJavaScricptAlerts();
        alertPage.clickJsConfirm();
        assertEquals(alertPage.getJsConfirmMessage(),"I am a JS Confirm","confirm message is not the same");
        alertPage.dismissConfirm();
        assertEquals(alertPage.getResultMessage(),"You clicked: Cancel","Result message is not the same");

    }
    @Test
    public void testPrompt(){
        String promptText="Hello";
        var alertPage=homePage.clickJavaScricptAlerts();
        alertPage.clickJsPrompt();
        alertPage.enterPromptText(promptText);
        alertPage.acceptPrompt();
        assertEquals(alertPage.getResultMessage(),"You entered: "+promptText,"Prompt message is not the same");

    }

}
