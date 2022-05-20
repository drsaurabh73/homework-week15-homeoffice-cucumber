package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlanningToWork extends Utility {
    public static final Logger log = LogManager.getLogger(PlanningToWork.class.getName());

    public PlanningToWork() {
        PageFactory.initElements(driver, this);
    }

    //Health and care professional
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement careprofessional;

    //Digital technology professional
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement technologyprofessional;
    //Academic or researcher
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement academicorresearcher;
    //Work in arts or culture
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement artorculture;
    //Professional sportsperson
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement sportsperson;
    //Religious worker
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement religiousworker;
    //I want to start a business
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement iwanttostartbusiness;
    //I want to do another type of job - show me other work visas
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement iwanttodoanotherjob;
    // continue
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickcontinue;

    public void setClickcontinue() {
        clickOnElement(clickcontinue);
    }

    public void whereYouArePlanningToWork(String typeofWork) {

        switch (typeofWork) {
            case "Health and care professional":
                clickOnElement(careprofessional);
                log.info("Clicking on Health and care professional" + careprofessional.toString());
                break;
            case "Digital technology professional":
                clickOnElement(technologyprofessional);
                log.info("Clicking on Digital technology professional" + technologyprofessional.toString());
                break;
            case "Academic or researcher":
                clickOnElement(academicorresearcher);
                log.info("Clicking on Academic or researcher" + academicorresearcher.toString());
                break;
            case "Work in arts or culture":
                clickOnElement(artorculture);
                log.info("Clicking on Work in arts or culture" + artorculture.toString());
                break;
            case "Professional sportsperson":
                clickOnElement(sportsperson);
                log.info("Clicking on Professional sportsperson" + sportsperson.toString());
                break;
            case "Religious worker":
                clickOnElement(religiousworker);
                log.info("Clicking on Religious worker" + religiousworker.toString());
                break;
            case "I want to start a business":
                clickOnElement(iwanttostartbusiness);
                log.info("Clicking on I want to start a business" + iwanttostartbusiness.toString());
                break;
            case "I want to do another type of job - show me other work visas":
                clickOnElement(iwanttodoanotherjob);
                log.info("Clicking on I want to do another type of job - show me other work visas" + iwanttodoanotherjob.toString());
                break;
            default:
                System.out.println("not valid reason for work visa");
        }


    }

}
