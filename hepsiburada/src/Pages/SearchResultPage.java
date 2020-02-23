package Pages;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultPage extends PageObject{

    public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "div.box.product")
    private WebElement div_productonresultpage;
	
	@FindBy(how = How.ID, using = "productresults")
    private WebElement div_checkproductresultpage;
	
	public void SelectProductonResultPage(){
		BasePage.productname = div_productonresultpage.findElement(By.cssSelector("a")).getAttribute("href");
		div_productonresultpage.click();
	}

	 //Page Methods
	public void CheckSearchResutltPage(){
		assertTrue(div_productonresultpage.isDisplayed());
	}
	
}
