package login;

import base.BaseTests;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
       LoginPage loginPage = homePage.clickFormAuthentication();
       loginPage.setUserNameField();
       loginPage.setPasswordField();
       SecureAreaPage secureAreaPage =loginPage.clickLogin();
       assertTrue(secureAreaPage.getAlertMessage().contains("You logged into a secure area!"),
               "The Alert Message is incorrect");
    }

}
