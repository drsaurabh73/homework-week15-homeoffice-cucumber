package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStaypage extends Utility {
private static final Logger log = LogManager.getLogger(DurationOfStaypage.class.getName());
    public DurationOfStaypage() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessthansixmonth;

    @FindBy (xpath = "//input[@id='response-1']")
    WebElement morethansixmonth;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continuebutton;

    public void setContinuebutton() {
        clickOnElement(continuebutton);
    }

    public void clickonSixMonthorLess() {
        clickOnElement(lessthansixmonth);
        log.info("Clicking on Six month of less"+ lessthansixmonth.toString()+ "<br>");
    }

    public void clickOnMoreThanSixMonth() {
        clickOnElement(morethansixmonth);
        log.info("Clicking on More than six month"+ morethansixmonth.toString()+ "<br>");
    }

    public void selectLengthOfStay(String moreOrLess) {


        switch (moreOrLess) {
            case "6 months or less":
                clickOnElement(lessthansixmonth);
                log.info("Clicking on 6 months or less"+ lessthansixmonth.toString()+ "<br>");
                break;
            case "longer than 6 months":
                clickOnElement(morethansixmonth);
                log.info("Clicking on longer than 6 months"+ morethansixmonth.toString()+ "<br>");
                break;
            default:
                System.out.println("not valid choice");

        }
    }


}

