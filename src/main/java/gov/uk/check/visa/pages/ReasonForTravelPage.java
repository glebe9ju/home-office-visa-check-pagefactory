package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='govuk-radios']//label")
//    @FindBy(xpath = "//fieldset[@class='govuk-fieldset']//label")
    List<WebElement> reasonList;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickContinue;

    public void selectReasonForVisit(String reason) {
        Reporter.log("select reason for visiting" + reason + "to reason field" + reasonList);
        for (WebElement reasonEl : reasonList) {
            if (reasonEl.getText().contains(reason))
            {clickOnElement(reasonEl);
            break;}
        }
    }

    public void clickContinueButton() {
        clickOnElement(clickContinue);
    }


}