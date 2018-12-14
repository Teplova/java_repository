package yana.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by 123 on 14.07.2018.
 */
public class NavigatonHelper extends HelperBase {



    public NavigatonHelper(WebDriver wd) {
        super (wd);
    }

    public void gotoPageGroup() {
       click(By.linkText("groups"));
    }
}


