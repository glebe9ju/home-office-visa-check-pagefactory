package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() { PageFactory.initElements(driver, this);
    }
    @FindBy(id="response")
    WebElement selectCountry;
    @FindBy (xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;


    public void chooseCountry(String country){
        Reporter.log("choose country" + country + "to country field" + selectCountry);
        selectByVisibleTextFromDropDown(selectCountry,country);
    }
    public void clickContinueButton(){
        clickOnElement(continueButton);
    }
}
/*
nationalityDropDownList, nextStepButton locators and create
methods 'void selectNationality(String nationality)'
and 'void clickNextStepButton()'
 */