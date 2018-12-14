package yana.tests;


import org.testng.annotations.Test;

/**
 * Created by 123 on 16.07.2018.
 */
public class GroupModificationTest extends TestBase {

    @Test
    public void testModificationGroup() {
        app.getNavigatonHelper().gotoPageGroup();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm("Test2", "Test2", "test3");
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnGroupPage();


    }


}
