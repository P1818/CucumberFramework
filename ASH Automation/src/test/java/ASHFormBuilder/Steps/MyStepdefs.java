package ASHFormBuilder.Steps;

import ASHFormBuilder.PageObjects.poNominee;
import ASHFormBuilder.Utilities.clsCommon;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.control;


/**
 * Created by amey.rajapure on 2/6/2017.
 */
public class MyStepdefs {
    clsCommon element = new clsCommon();
    poNominee obj = new poNominee();
    WebDriver driver;


    @Given("^I am logged into Website$")
    public void iAmLoggedIntoWebsite() throws Throwable {
        System.setProperty("webdriver.firefox.marionette", "D:\\ASH_Automation\\ASH Automation\\src\\test\\java\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.navigate().to("http://rav-vm-srv-106/Awards-Form-Builder/Award/FormBuilder/414");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        element.returnElement(driver,"ID", obj.txt_UserName).sendKeys("paul.coppo@sat.aphp.fr");
        element.returnElement(driver,"ID", obj.txt_Password).sendKeys("ash2017");
        element.returnElement(driver,"ID", obj.btn_SignIn).click();

        Thread.sleep(2000);

        WebElement MasterControlContainer = element.returnElement(driver,"ID", obj.conter_MasterControls_ID);
        List<WebElement> MasterControlItems = MasterControlContainer.findElements(By.xpath(".//*[contains(@class,\"section-set-control\")]"));
        WebElement MasterControl_Nominee = null;
        System.out.println("MasterControlItems.size() = " +MasterControlItems.size());

        for(int i=0; i<MasterControlItems.size();i++){
            String sType = MasterControlItems.get(i).getAttribute("type");
            System.out.println("SType = " +sType);
            if (sType.equalsIgnoreCase("Nominee")){
                //MasterControlItems.get(i).click();
                MasterControl_Nominee = MasterControlItems.get(i);
                System.out.println("MasterControl_Nominee = " +MasterControl_Nominee);
                //MasterControl_Nominee.click();
                break;
            }
        }


        Actions action = new Actions(driver);
        //action.dragAndDrop(MasterControl_Nominee, element.returnElement(driver, "ID", obj.frm_Destn)).build().perform();
        action.clickAndHold(MasterControl_Nominee).build().perform();
        action.moveToElement(element.returnElement(driver, "ID", obj.frm_Destn)).build().perform();
        action.release(element.returnElement(driver, "ID", obj.frm_Destn)).build().perform();

    }

    @Then("^Nominee Controls should be displayed$")
    public void nomineeControlsShouldBeDisplayed() throws Throwable {
        /*System.out.println("Inside Then: " +element.returnElement(driver,"XPATH", obj.lbl_FirstName).getText());
        System.out.println("Inside Then: " +element.returnElement(driver,"XPATH", obj.lbl_LastName).getText());

        System.out.println("Inside Then: " +element.returnElement(driver,"XPATH", obj.txt_FirstName).getAttribute("type"));
        System.out.println("Inside Then: " +element.returnElement(driver, "XPATH", obj.rbtn_Gender).getAttribute("type"));*/
        System.out.println("nomineeControlsShouldBeDisplayed()");

    }
}
