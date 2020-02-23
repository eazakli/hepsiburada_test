package Pages;

import static org.junit.Assert.assertTrue;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyOrdersPage extends PageObject{

	public MyOrdersPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.CSS, using = "div.order-number.e2e-orderRow-orderNumber > small > b")
    private List<WebElement> btn_order;
	
	@FindBy(how = How.CSS, using = "button.hb-button.hb-button--secondary")
    private WebElement btn_canceltheorder;
	
	@FindBy(how = How.CSS, using = "body > div.ReactModalPortal > div > div > div.cancel-line-item > div.cancel-line-item__content > div > div > div > label > div.selectbox-placeholder")
    private WebElement combobox_cancel;
	
	@FindBy(how = How.CSS, using = "div.selectbox-result > ul > li:nth-child(1)")
    private WebElement combobox_cancelrequest;
	
	@FindBy(how = How.CSS, using = "body > div.ReactModalPortal > div > div > div.cancel-line-item > div.cancel-line-item__footer > button")
    private WebElement btn_cancelonrequest;
	
	@FindBy(how = How.CSS, using = "body > div.ReactModalPortal > div > div > div.cancel-line-item > div.alert-inner-bar.alert-inner-bar--success > span")
    private WebElement txt_checkcancelrequest;
		
	@FindBy(how = How.CSS, using = "body > div.ReactModalPortal > div > div > button > svg")
	private WebElement btn_close;
	
	
	 //Page Methods
    public void ClickOnTheOrder() {
    	btn_order.get(0).click();
    }
    
    public void ClickOnCancelTheOrder() throws InterruptedException{
    	Thread.sleep(3000);
    	btn_canceltheorder.click();
    }
    
    public void SetCancelRequest() throws InterruptedException{
    	Thread.sleep(3000);
    	combobox_cancel.click();
    	combobox_cancelrequest.click();

    	btn_cancelonrequest.click();
    	assertTrue(txt_checkcancelrequest.isDisplayed());
    	btn_close.click();
    }

}
