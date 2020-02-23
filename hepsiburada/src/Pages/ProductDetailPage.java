package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailPage extends PageObject{

	public ProductDetailPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "addToCart")
    private WebElement btn_addToCart;
	
	 //Page Methods
	public void AddToBasket(){
		btn_addToCart.click();
	}
	
}
