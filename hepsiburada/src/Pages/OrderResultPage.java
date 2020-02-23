package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderResultPage extends PageObject{

	public OrderResultPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "button.btn.btn-primary.full")
    private WebElement btn_ContinueSummary;
	
	@FindBy(how = How.CSS, using = "div.order-info-box.order-number > strong")
    private WebElement txt_OrderNumber;
	
	 //Page Methods
    public void GetOrderNumber() {
    	BasePage.ordernumber = txt_OrderNumber.getText();
    	
    }
}
