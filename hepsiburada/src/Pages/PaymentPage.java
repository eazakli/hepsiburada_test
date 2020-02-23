package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage extends PageObject{

	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	
    @FindBy(how = How.CSS, using = "a.accordion-title.paymentType-2")
    private WebElement btn_paymentName;
    
    @FindBy(how = How.CLASS_NAME, using = "input-select")
    private WebElement rd_bank;
    
	@FindBy(how = How.CSS, using = "button.btn.btn-primary.full")
    private WebElement btn_ContinueCheckout;
	
	@FindBy(how = How.CSS, using = "div.eft-button.iban-eft")
    private WebElement btn_eft;
	
	@FindBy(how = How.CSS, using = "button.btn.long")
    private WebElement btn_eftcontinue;
	
	 //Page Methods
    public void ClickOnContinueCheckout() {
    	btn_ContinueCheckout.click();
    }
    
    public void ClickOnPaymentType(){
    	btn_paymentName.click();
    }
    
    public void ClickOnBank(){
    	rd_bank.click();
    }
    
    public void ClickOnEftbutton(){
    	btn_eft.click();
    }
    
    public void ClickOnEftContinueButton(){
    	btn_eftcontinue.click();
    }
}
