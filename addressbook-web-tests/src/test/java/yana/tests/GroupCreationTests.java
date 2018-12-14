package yana.tests;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigatonHelper().gotoPageGroup();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm("Test2", null, null);
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnGroupPage();
    }

}
