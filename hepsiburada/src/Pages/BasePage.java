package Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


public abstract class BasePage {
	protected static WebDriver driver;
	
	//Page Variables
	public String chromedriverPath = "tools/chromedriver/chromedriver.exe";
	public String firefoxdriverPath = "tools/geckodriver/geckodriver.exe";
	public static String productname;
	public static String ordernumber;
	String browser = System.getenv("CURRENTBROWSER");

	//Screenshot
	@Rule
	public TestWatcher watchman = new TestWatcher() {

		@Override
		protected void failed(Throwable e, Description description) {
			File screenshot = new File(description.getClassName() + "-"
					+ description.getMethodName() + "-" + timestamp() + ".png");
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, screenshot);
			} catch (IOException e1) {
				System.out.println("Fail to take screen shot");
			}
			driver.quit();
		}

		@Override
		protected void succeeded(Description description) {
			driver.quit();
		}
	};

	public static String timestamp() {
		return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
	}

	//Cross Browser
	@Before
	public void setup() throws Exception {
		if (browser == null) {
			System.setProperty("webdriver.chrome.driver", chromedriverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hepsiburada.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		switch (browser) {
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", firefoxdriverPath);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hepsiburada.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		default:
			System.setProperty("webdriver.chrome.driver", chromedriverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hepsiburada.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}

	public void thread(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}