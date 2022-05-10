package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() { PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//div[@class='gem-c-radio govuk-radios__item']//label")
    List<WebElement> visa;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectImmigrationStatus(String status){
        Reporter.log("select status" + status + "to status field" + visa);
        switch (status){
            case "Yes":
                visa.get(0).click();
                break;
            case "NO":
                visa.get(1).click();
                break;
                        }
    }
    public void clickContinueButton() {
        clickOnElement(continueButton);
    }
}
