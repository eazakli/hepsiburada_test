package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeliveryPage extends PageObject{

	public DeliveryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "button.btn.btn-primary.full")
    private WebElement btn_continue;
    
	 //Page Methods
    public void ClickOnContinue(){
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(btn_continue));
    	btn_continue.click();
    }
}