package yana.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


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
        click(By.xpath(".//*[@id='nav']/ul/li[2]/a"));
    }



}
