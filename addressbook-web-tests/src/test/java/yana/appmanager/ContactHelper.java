package yana.appmanager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


/**
 * Created by 123 on 05.12.2018.
 */
public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);

    }

    public void submitContactForm() {
        click(By.name("submit"));
    }

    public void fillContactForm(String firstname, String lastname) {

        type(By.name("firstname"),firstname);
        type(By.name("lastname"),lastname);
    }

    public void addNewContact() {
        click(By.linkText("add new"));
    }


    public void returnToHomePage() {
        click (By.linkText("home"));
    }

    public void initContactModification(){
        click(By.cssSelector("img[atl='Edit']"));
    }

    public void submitcontactModification(){
        click(By.name("update"));
    }


    public void deleteCreatedContact() {
        click(By.xpath("//*[@id = 'MassCB']"));
        click(By.xpath(".//input[@value='Delete']"));
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));

    }
}
