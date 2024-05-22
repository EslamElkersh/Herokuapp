package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testContextClick(){
        var contextMenuPage=homePage.clickContextMenu();
        contextMenuPage.rightClickBoxField();
        assertEquals(contextMenuPage.getAlertMessage(),"You selected a context menu","Alert Message is not the same");
        contextMenuPage.acceptAlert();
    }
}
