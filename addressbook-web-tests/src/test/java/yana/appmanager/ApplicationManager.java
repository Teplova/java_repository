package yana.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import sun.plugin2.util.BrowserType;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Created by 123 on 09.07.2018.
 */


public class ApplicationManager {

    WebDriver wd;

    private SessionHelper sessionHelper;
    private NavigatonHelper navigatonHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private String browser;


    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {

        if (Objects.equals(browser, org.openqa.selenium.remote.BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        }        else if (Objects.equals(browser, org.openqa.selenium.remote.BrowserType.CHROME)) {
            wd = new ChromeDriver();

        } else if (Objects.equals(browser, org.openqa.selenium.remote.BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }


        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        navigatonHelper = new NavigatonHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("Admin", "secret");

    }


    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigatonHelper getNavigatonHelper() {
        return navigatonHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
