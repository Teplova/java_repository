package yana.tests;


import org.testng.annotations.Test;


public class ContactCreationTest extends TestBase{
//    WebDriver wd;


    @Test
    public void testContactCreationTest() {
        app.getNavigatonHelper().gotoPageGroup();
        app.getContactHelper().addNewContact();
        app.getContactHelper().fillContactForm("Ianina", "Teplova");
        app.getContactHelper().submitContactForm();
    }



//    public static boolean isAlertPresent(FirefoxDriver wd) {
//        try {
//            wd.switchTo().alert();
//            return true;
//        } catch (NoAlertPresentException e) {
//            return false;
//        }
//    }
}
