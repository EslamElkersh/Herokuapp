package javaScript;

import Pages.DropDownPage;
import base.BaseTests;
import dropDown.DropDownTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        var largeAndDeepDomePage = homePage.clickLargeAndDeepDOM();
        largeAndDeepDomePage.scrollToTable();
    }
    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
    @Test
    public void testAddMultipleAttributeToDropDown(){
        var dropDownPage=homePage.clickDropDown();
        dropDownPage.addMultipleAttribute();
        var optionsToSelect= List.of("Option 1","Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect),"All options were not selected");
        assertEquals(selectedOptions.size(),optionsToSelect.size(),"Number of selected items is not the same");
    }
}
