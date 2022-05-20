package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {
    public static final Logger log = LogManager.getLogger(StartPage.class.getName());
    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    // accept cookies = //button[@data-track-action='Cookie banner accepted']
    @FindBy (xpath = "//button[@data-track-action='Cookie banner accepted']")
    WebElement acceptcookies;


    @FindBy (xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startnow;


    public void clickOnacceptCookies() {
        clearTextToElement(acceptcookies);
        log.info("Clicking on accept cookies " + acceptcookies.toString());
    }


    public void clickStartNow() {
        clickOnElement(startnow);
        log.info("Clicking on Start Now"+ startnow.toString()+ "<br>");
    }

}
