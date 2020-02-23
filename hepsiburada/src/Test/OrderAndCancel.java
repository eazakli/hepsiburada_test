package Test;

import org.junit.Test;
import Pages.BasePage;
import Pages.BasketPage;
import Pages.CommonPage;
import Pages.DeliveryPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyOrdersPage;
import Pages.OrderResultPage;
import Pages.PaymentPage;
import Pages.ProductDetailPage;
import Pages.SearchResultPage;
import Pages.SummaryPage;

public class OrderAndCancel extends BasePage {

	@Test
	public void openweb() throws Exception {

		// CommonPage
		CommonPage commonpage = new CommonPage(driver);
		commonpage.CheckPage("https://www.hepsiburada.com/");
		commonpage.ClickonLogin();

		// Login
		LoginPage login = new LoginPage(driver);
		login.Login();

		// ProductSearch
		HomePage home = new HomePage(driver);
		home.ProductSearch();

		SearchResultPage searchresult = new SearchResultPage(driver);
		searchresult.CheckSearchResutltPage();
		searchresult.SelectProductonResultPage();

		// GotoProductDetail
		ProductDetailPage productdetail = new ProductDetailPage(driver);
		commonpage.CheckPage(productname);
		productdetail.AddToBasket();

		home.ClickOnBasket();
		commonpage
				.CheckPage("https://www.hepsiburada.com/ayagina-gelsin/sepetim");

		// BasketPage
		BasketPage basketpage = new BasketPage(driver);
		basketpage.ClickOnContinueCheckout();

		// DeliveryPage
		DeliveryPage deliverypage = new DeliveryPage(driver);
		commonpage
				.CheckPage("https://www.hepsiburada.com/ayagina-gelsin/teslimat");
		deliverypage.ClickOnContinue();

		// PaymentPage
		PaymentPage paymentpage = new PaymentPage(driver);
		commonpage
				.CheckPage("https://www.hepsiburada.com/ayagina-gelsin/odeme");
		paymentpage.ClickOnPaymentType();
		paymentpage.ClickOnBank();
		paymentpage.ClickOnContinueCheckout();
		paymentpage.ClickOnEftbutton();
		paymentpage.ClickOnEftContinueButton();

		// SummaryPage
		SummaryPage summarypage = new SummaryPage(driver);
		commonpage
				.CheckPage("https://www.hepsiburada.com/ayagina-gelsin/siparis-ozeti");
		summarypage.ClickOnContinue();

		OrderResultPage orderresultpage = new OrderResultPage(driver);
		commonpage
				.CheckPage("https://www.hepsiburada.com/ayagina-gelsin/siparis-tamamlandi");
		orderresultpage.GetOrderNumber();

		// MyOrders & Cancel
		commonpage.ClickOnMyOrders();
		MyOrdersPage myordersPage = new MyOrdersPage(driver);
		myordersPage.ClickOnTheOrder();
		myordersPage.ClickOnCancelTheOrder();
		myordersPage.SetCancelRequest();
	}
}
