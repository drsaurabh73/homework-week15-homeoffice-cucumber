package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;
import org.junit.Assert;

public class VisaTest {
    @Given("^I am on Homepage of Homeoffice website$")
    public void iAmOnHomepageOfHomeofficeWebsite() {
    }

    @When("^I click on start button$")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("^I select Nationality \"([^\"]*)\" from the country option$")
    public void iSelectNationalityFromTheCountryOption(String country)  {
        new SelectNationalityPage().selectNationalityAustralia(country);

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().setContinuebutton();
    }

    @And("^I select \"([^\"]*)\" as reason to travel$")
    public void iSelectAsReasonToTravel(String tourist)  {
        new ReasonForTravelPage().selectReasonForTravel(tourist);

    }

    @Then("^I can see \"([^\"]*)\" on the screen$")
    public void iCanSeeOnTheScreen(String message) throws InterruptedException {
        Thread.sleep(1000);

        Assert.assertEquals("",message,new ResultPage().getResultMessage());
    }

    @And("^I select intend to stay for \"([^\"]*)\" on the planing to work page$")
    public void iSelectIntendToStayForOnThePlaningToWorkPage(String academic)  {
        new PlanningToWork().whereYouArePlanningToWork(academic);
    }

    @And("^I click on continue plaing to work page$")
    public void iClickOnContinuePlaingToWorkPage() {
        new PlanningToWork().setClickcontinue();
    }

    @Then("^I can see \"([^\"]*)\" message on the screen$")
    public void iCanSeeMessageOnTheScreen(String message)  {

        Assert.assertEquals("",message,new ResultPage().getResultMessage());
    }

    @And("^I select my partner or family member have uk immigration status yes on family immigration page$")
    public void iSelectMyPartnerOrFamilyMemberHaveUkImmigrationStatusYesOnFamilyImmigrationPage() {
        new FamilyImmigrationStatusPage().clickOnFamilyImmigrationyes();
    }

    @And("^I click on continue button on family immigration page$")
    public void iClickOnContinueButtonOnFamilyImmigrationPage() {
        new FamilyImmigrationStatusPage().clickOnContinue();
    }

    @Then("^I select job type \"([^\"]*)\" on work type page$")
    public void iSelectJobTypeOnWorkTypePage(String worktype)  {
        new PlanningToWork().whereYouArePlanningToWork(worktype);
    }

    @And("^I click on next step on work type page$")
    public void iClickOnNextStepOnWorkTypePage() {
        new PlanningToWork().setClickcontinue();
    }

    @And("^I click on continue planing to work page$")
    public void iClickOnContinuePlaningToWorkPage() {
        new PlanningToWork().setClickcontinue();
    }

    @And("^I click on continue button on duration of stay$")
    public void iClickOnContinueButtonOnDurationOfStay() {
        new DurationOfStaypage().setContinuebutton();
    }

    @And("^I select \"([^\"]*)\" as reason to work$")
    public void iSelectAsReasonToWork(String work)  {
        new ReasonForTravelPage().selectReasonForTravel(work);

    }

    @And("^I select \"([^\"]*)\" as reason to stay$")
    public void iSelectAsReasonToStay(String stay)  {
       new ReasonForTravelPage().selectReasonForTravel(stay);
    }
}
