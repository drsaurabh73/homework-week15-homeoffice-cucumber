package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    public static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='result-info']//div[2]/h2")
    WebElement resultMessage;

    public String getResultMessage(){
        log.info("Getting result  " + resultMessage.toString());
        return getTextFromElement(resultMessage);
    }

    public void confirmResultMessage(String expectedMessage){

        System.out.println(getResultMessage());

    }
}
