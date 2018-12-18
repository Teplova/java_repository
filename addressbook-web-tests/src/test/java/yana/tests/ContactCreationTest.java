package yana.tests;


import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ContactCreationTest extends TestBase{
//    WebDriver wd;


    @Test
    public void testContactCreationTest() {
        app.getNavigatonHelper().gotoPageGroup();
        app.getContactHelper().addNewContact();
        app.getContactHelper().fillContactForm("Ianina", "Teplova");
        app.getContactHelper().submitContactForm();
        app.getContactHelper().returnToHomePage();
        app.getContactHelper().deleteCreatedContact();
        app.getContactHelper().returnToHomePage();

//        app.getContactHelper().returnToHomePage();
    }



    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
