package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "productSearch")
	private WebElement txt_productSearch;

	@FindBy(how = How.ID, using = "buttonProductSearch")
	private WebElement btn_ProductSearch;

	@FindBy(how = How.ID, using = "cartItemCount")
	private WebElement cartItemCount;

	@FindBy(how = How.ID, using = "CartButton")
	private WebElement btn_Basket;

	 //Page Methods
	public void ProductSearch() {
		txt_productSearch.clear();
		txt_productSearch.sendKeys("kitap");
		btn_ProductSearch.click();
	}

	public void ClickOnBasket() {
		btn_Basket.click();
	}

}