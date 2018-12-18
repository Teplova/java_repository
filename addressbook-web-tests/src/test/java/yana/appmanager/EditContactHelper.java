package yana.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by 123 on 17.12.2018.
 */
public class EditContactHelper extends HelperBase {

    @FindBy(id = "maintable")
    List<WebElement> listOfElements;

//    @FindBy(xpath = ".//*[text()='"+contactName+"']);
//    protected WebElement checkBox;

    @FindBy (xpath = ".//*[text()='Teplova']")
    private WebElement contactName;




    public EditContactHelper(WebDriver wd) {
        super(wd);
    }

    public void  clickDeleteContactButton(){
        click(By.xpath(".//*[@value='Delete']"));
    }

    public boolean ckeckContactNameInInput(String spareName){
        return contactName.getAttribute("value").equals(spareName);
    }



    public void deletingContactUntilPresent(String contactName) {
        int counter = 0;
        while(isContactInList(contactName)){
            clickOnContact(contactName);
            clickDeleteContactButton();
            counter++;
            if (counter >100){

                Assert.fail("More than 100 items");

            }
        }

    }

    private void clickOnContact(String contactName) {
        click((By)contactNameElement (contactName));
    }

    private boolean isContactInList (String contactName){
       return isElementDisplayed(By.xpath(".//*[text()='"+contactName+"']"));
    }


    private WebElement contactNameElement(String contactName) {
        return wd.findElement(By.xpath(".//*[text()='"+contactName+"']"));
    }

    public boolean isElementDisplayed(By by) {
        try {
            return isElementDisplayed((By) wd.findElement(by));
        } catch ( Exception e ) {
            return false;
        }

    }


    public void gotoHomePage() {
        click(By.xpath(".//*[@id='nav']/ul/li[1]/a"));
    }
}
