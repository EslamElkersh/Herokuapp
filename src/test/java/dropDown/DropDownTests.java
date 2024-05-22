package dropDown;

import Pages.DropDownPage;
import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;


public class DropDownTests extends BaseTests {
    @Test
    public void testSelectedOption(){
        String option = "Option 1";
        DropDownPage dropDownPage=homePage.clickDropDown();
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,
                "The number of selected options is not the same");
        assertTrue(selectedOptions.contains(option),"Incorrect selected option");
    }

}
