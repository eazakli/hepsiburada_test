package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SummaryPage extends PageObject {

	public SummaryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "button.btn.btn-primary.full")
    private WebElement btn_ContinueSummary;
	
	 //Page Methods
    public void ClickOnContinue() {
    	btn_ContinueSummary.click();
    }
}
