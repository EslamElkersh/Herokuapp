package hovers;

import Pages.HoversPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        int index=2;
        HoversPage hoversPage= homePage.clickHovers();
        HoversPage.FigureCaptions captions= hoversPage.hoverOverFigure(index);
        assertTrue(captions.isCaptionDisplayed(),"The caption is not displayed");
        assertEquals(captions.getTitle(),"name: user"+index,"The title is not the same");
        assertEquals(captions.getLinkText(),"View profile","The link text is not the same");
        assertTrue(captions.getLink().endsWith("/users/"+index),"The link is incorrect");

    }
}
