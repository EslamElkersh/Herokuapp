package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IFrameEditorTests extends BaseTests {
    @Test
    public void testEditor(){
        String text1="Hello ";
        String text2="World";
        var editorPage= homePage.clickWYSIWYGEditor();
        editorPage.clearTextArea();
        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getStringFromEditor(),text1+text2,"The text is incorrect");
    }

}
