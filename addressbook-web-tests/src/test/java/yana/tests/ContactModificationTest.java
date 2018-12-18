package yana.tests;


import org.testng.annotations.Test;

/**
 * Created by 123 on 17.12.2018.
 */
public class ContactModificationTest extends TestBase {


    @Test
    public void testContactModificationTest(){
        app.getNavigatonHelper().gotoPageGroup();
        app.getEditContactHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm("lola","Lola!");
        app.getContactHelper().submitcontactModification();
        app.getContactHelper().returnToHomePage();

    }


}
