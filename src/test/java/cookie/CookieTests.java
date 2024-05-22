package cookie;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;


public class CookieTests extends BaseTests {
    @Test
    public void testDeleteCookies(){
        var cookieManager=getCookieManager();
        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets","%7B%7");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie),"Cookie was not deleted");
    }
}
