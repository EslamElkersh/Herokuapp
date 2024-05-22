package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testSlider(){
        var horizontaSlider=homePage.clickHorizontalSlider();
        horizontaSlider.incrementSlider();
        assertEquals(horizontaSlider.getCounter(),"4","The counter is not Correct");
    }
}
