package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.*;

public class LoginPage extends PageObject{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
 
    @FindBy(how = How.ID, using = "email")
    private WebElement txt_email;
    
    @FindBy(how = How.ID, using = "password")
    private WebElement text_password;
    
    @FindBy(how = How.CLASS_NAME, using = "btn-login-submit")
    private WebElement btn_giris;

    @FindBy(how = How.CSS, using = "section.login-box.box")
    private WebElement section_checkloginpage;
   
	 //Page Methods
    public void CheckLoginPage()
    {
    	assertTrue(section_checkloginpage.isDisplayed());
    }
    
    public void Login() {
    	txt_email.sendKeys("eazakli.test@gmail.com");
    	text_password.sendKeys("Test3419@5");
    	btn_giris.click();
    }
}
