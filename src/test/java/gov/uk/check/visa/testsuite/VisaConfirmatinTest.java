package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmatinTest extends TestBase {

    StartPage startPage;
    WorkTypePage workTypePage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    DurationOfStayPage durationOfStayPage;

    @BeforeMethod
    public void inIt() {
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        durationOfStayPage = new DurationOfStayPage();
    }

    @Test
    public void anAustralianCominToUKForTourism() {

//Click on start button
        startPage.clickOnStartButton();
//Select a Nationality 'Australia'
        selectNationalityPage.chooseCountry("Australia");
//Click on Continue button
        selectNationalityPage.clickContinueButton();
//Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit("Tourism");
//Click on Continue button
        reasonForTravelPage.clickContinueButton();
//verify result 'You will not need a visa to come to the UK'
        String expectedResult = "You will not need a visa to come to the UK";
        String actualResult = resultPage.verifyResult();
        Assert.assertEquals(actualResult, expectedResult, "Result not found");
    }

    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        //Click on start button
        startPage.clickOnStartButton();
        //Select a Nationality 'Chile'
        selectNationalityPage.chooseCountry("Chile");
        //Click on Continue button
        selectNationalityPage.clickContinueButton();
        //Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        //Click on Continue button
        reasonForTravelPage.clickContinueButton();
        //Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        //Click on Continue button
        durationOfStayPage.clickContinueButton();
        //Select have planning to work for 'Health and care professional'
        workTypePage.selectJobtypeList("Health and care professional");
        //Click on Continue button
        workTypePage.clickContinueButton();
        //verify result 'You need a visa to work in health and care'
        String expectedResult = "You need a visa to work in health and care";
        String actualResult = resultPage.verifyResult();
        Assert.assertEquals(actualResult, expectedResult, "Result not found");
    }
@Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        //Click on start button
    startPage.clickOnStartButton();
    //Select a Nationality 'Colombia'
    selectNationalityPage.chooseCountry("Colombia");
    //Click on Continue button
    selectNationalityPage.clickContinueButton();
    //Select reason 'Join partner or family for a long stay'
    reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
    //Click on Continue button
    reasonForTravelPage.clickContinueButton();
    //Select state My partner of family member have uk immigration status 'yes'
familyImmigrationStatusPage.selectImmigrationStatus("Yes");
    //Click on Continue button
    durationOfStayPage.clickContinueButton();
    //verify result 'You’ll need a visa to join your family or partner in the UK
    String expectedResult = "You’ll need a visa to join your family or partner in the UK";
    String actualResult = resultPage.verifyResult();
    Assert.assertEquals(actualResult, expectedResult, "Result not found");
    }



}
