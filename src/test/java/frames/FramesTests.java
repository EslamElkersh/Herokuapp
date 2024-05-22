package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FramesTests extends BaseTests {
    @Test
    public void testFrames(){
        String leftFrame="frame-left";
        String bottomFrame="frame-bottom";
        var frames=homePage.clickFrames();
        var nestedFrames=frames.clickNestedFrames();
        assertTrue(nestedFrames.getFrameText(bottomFrame).contains("BOTTOM"),"Wrong Text");
        assertTrue(nestedFrames.getFrameText(leftFrame).contains("LEFT"),"Wrong Text");
    }

}
