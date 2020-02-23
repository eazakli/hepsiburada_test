package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasketPage extends PageObject{

	public BasketPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.CSS, using = "button.btn.btn-primary.full")
    private WebElement btn_ContinueCheckout;
	
	
	 //Page Methods
    public void ClickOnContinueCheckout() {
    	btn_ContinueCheckout.click();
    }
}
