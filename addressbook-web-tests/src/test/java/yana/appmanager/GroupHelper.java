package yana.appmanager;

import com.sun.javafx.binding.ExpressionHelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by 123 on 14.07.2018.
 */
public class GroupHelper extends HelperBase {
    WebDriver wd;


    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(String name, String header, String footer) {
        type(By.name("group_name"), name);
        type(By.name("group_header"), header);
        type(By.name("group_footer"), footer);
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroup() {

        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }


    public void submitGroupModification() {
        click (By.name("update"));
    }
}
