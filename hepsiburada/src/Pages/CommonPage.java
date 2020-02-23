package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage extends PageObject {

	public CommonPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(how = How.CSS, using = "button.btn.btn-primary.full")
    private WebElement btn_ContinueCheckout;
	
	@FindBy(how = How.XPATH, using = "//*[@id='myAccount']/div[2]/div/ul/li")
    private List<WebElement> link_MyOrders;
	
	@FindBy(how = How.ID, using = "myAccount")
    private WebElement drpdwn_myAccount;
    
    @FindBy(how = How.ID, using = "login")
    private WebElement drpdwn_login;
	
    
	 //Page Methods
    public void CheckPage(String CheckURL) throws InterruptedException {
    	Thread.sleep(3000);
    	Assert.assertEquals(driver.getCurrentUrl(), CheckURL);
    }


    public void ClickonLogin() {
    	drpdwn_myAccount.click();
    	drpdwn_login.click();
    }
    
    public void ClickOnMyOrders(){
    	
    	drpdwn_myAccount.click();
    	link_MyOrders.get(0).click();
    }
}
