package yana;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        gotoPageGroup();
        initGroupCreation();
        fillGroupForm("Test2", "Test2", "test3");
        submitGroupCreation();
        returnGroupPage();
    }

}
