package forgetPassword;

import Pages.ForgetPasswordPage;
import Pages.MessageSentPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgetPasswordTests extends BaseTests {
    @Test
    public void testForgetPasswordMessage(){
        ForgetPasswordPage forgetPasswordPage = homePage.clickForgetPassword();
        forgetPasswordPage.setEmailField();
        MessageSentPage messageSentPage=forgetPasswordPage.clickRetrievePasswordButton();
        String alertMessage = messageSentPage.getAlertMessage();
        assertTrue(alertMessage.contains("Internal Server Error"),"message is not the same");
    }
}
