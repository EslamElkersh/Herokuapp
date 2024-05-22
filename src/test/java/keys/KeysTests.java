package keys;

import Pages.KeyPressesPage;
import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testBackSpace(){
        KeyPressesPage keyPressesPage=homePage.clickKeyPresses();
        keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE","message is not the same");
    }
   /* @Test
    public void testPi(){
       KeyPressesPage keyPressesPage= homePage.clickKeyPresses();
       keyPressesPage.enterPi();
    }*/
}
