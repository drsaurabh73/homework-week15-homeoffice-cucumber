package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {
    public static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

        @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectyes;
//    @CacheLookup
//    @FindBy(xpath = "//div[@class='govuk-radios']//input[@id='response-0']")
//    WebElement selectyes;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement gocontinue;

    public void clickOnFamilyImmigrationyes() {
        log.info("Clicking on Family Immigration yes" + selectyes.toString() + "<br>");
        clickOnElement(selectyes);
    }

    public void clickOnContinue() {
        log.info("Clicking on go to continue" + gocontinue.toString() + "<br>");
        clickOnElement(gocontinue);
    }
}
