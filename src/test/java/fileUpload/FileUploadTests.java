package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        String fileName="Canva Link.txt";
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\maged\\Downloads\\CV\\"+fileName);
        assertEquals(fileUploadPage.getUploadedFiles(),fileName,"Uploaded file is not the same");
    }
}
