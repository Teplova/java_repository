package yana.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import yana.appmanager.ApplicationManager;

/**
 * Created by 123 on 03.05.2018.
 */
public class TestBase {


    protected final ApplicationManager app = new
            ApplicationManager(BrowserType.FIREFOX);





    @BeforeMethod
    public void setUp() throws Exception {

        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
