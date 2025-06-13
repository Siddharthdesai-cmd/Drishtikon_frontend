package objectRepo;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
/**
 *@author DivyaPrakashAmar
 */
public class HomeScreen extends BaseClass{
	
	AndroidDriver driver;
	public HomeScreen(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement back;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home\r\n"
			+ "Tab 1 of 5\"]")
	private WebElement orderButton;
	
	public void clickonProofofDelivery() {
	WebElement POD = driver.findElement(AppiumBy.accessibilityId("Proof Of\nDelivery"));
	POD.click(); 
	}
	
	
	public void clickonBalanceConfirmation() {
	WebElement balConf = driver.findElement(AppiumBy.accessibilityId("Balance\nConfirmation"));
	balConf.click(); 
	}
	
	public void verifyLogo() {
		WebElement Logo = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className('android.widget.ImageView').instance(0)"));
		Logo.isDisplayed();
	}
	
	@FindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Your account has an overdue balance')]")
	private WebElement needsAttention;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Proof Of\r\n"
			+ "Delivery\"]")
	private WebElement proofOfDelivery;

	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Ok']")
	private WebElement alertOkButton;
	
//	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Overview\r\n"
//			+ "MTD\"]")
//	private WebElement mtdButton;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View")
	private WebElement balanceConfirmationScreen;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	private WebElement balanceConfirmationCrossButton;

	@FindBy(xpath = "//android.view.View[@content-desc='Proof of Delivery']")
	private WebElement proofOfDeliveryScreenTitle;
	
	@FindBy(className = "android.widget.ImageView")
	private WebElement proofOfDeliveryBackButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Business Turnover\r\n"
			+ "₹ 0.0\r\n"
			+ "Last Year (May)\r\n"
			+ "₹ 0.0\r\n"
			+ "Needs Attention\"]/android.view.View[3]/android.view.View/android.widget.ImageView[2]")
	private WebElement marketingAd;
	
//	@FindBy(xpath = "//android.widget.ImageView[@content-desc='Balance Confirmation\r\n"
//			+ "Confirm your balance before 15th May\r\n"
//			+ "Confirm now to avoid penalty']")
//	private WebElement BalanceConfirmationWidget;
	
	public void AssertNeedsAttention() {
		try {
			assertTrue(needsAttention.isDisplayed());
			System.out.println(needsAttention.getText());
			System.out.println("Needs Attention is displayed");
		}catch (Exception e) {
			System.out.println("Needs Attention Message is not displayed");
		}
		
	}
	
	public void clickOnAlertOkButton() {
		try {
			alertOkButton.click();
			System.out.println("clicked on Alert Ok Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Alert OK Button");
		}
	}
	
	public void clickOnMtdButton() {
		try {
			WebElement mtdButton = driver.findElement(AppiumBy.accessibilityId("Overview\nMTD"));
			mtdButton.click();
			System.out.println("Clicked on MTD Button");
		}catch (Exception e) {
			System.out.println("Not able to click on MTD Button ");
		}
	}
	
	public void verifyBalanceConfirmationScreen() {
		try {
			assertTrue(balanceConfirmationScreen.isDisplayed());
			System.out.println("Balance confirmation page is displayed");
		}catch (Exception e) {
			System.out.println("Balance confirmation page is not displayed");
		}
		
	}
	
	public void ClickOnBalanceConfirmationCrossButton() {
		try {
			balanceConfirmationCrossButton.click();
			System.out.println("clicked on Balance Confirmation back button");
		} catch (Exception e) {
			System.out.println("Not able to click on Balance Confirmation Back Button");
		}
	}
	
	public void assertProofOfDeliveryScreenTitle() {
		try {
			assertTrue(proofOfDeliveryScreenTitle.isDisplayed());
			System.out.println("Screen title is displayed");
		}catch (Exception e) {
			System.out.println("Proof of Delivery screen title is not displayed");
		}
	}
	
	public void clickOnProofOfDeliveryBackButton() {
		try {
			proofOfDeliveryBackButton.click();
			System.out.println("Clicked on proofOfDelivery BackButton");
		}catch (Exception e) {
			System.out.println("Not able to click on proofOfDelivery BackButton");
		}
	}
	
	public void assertMarketingAd() {
		try {
			List<WebElement>Ads=driver.findElements(AppiumBy.xpath("//android.view.View[@content-desc=\"Business Turnover\r\n"
			+ "₹ 0.0\r\n"
			+ "Last Year (May)\r\n"
			+ "₹ 0.0\r\n"
			+ "Needs Attention\"]/android.view.View[3]/android.view.View/android.widget.ImageView[2]"));
			boolean isAdPresent=Ads.isEmpty()||!Ads.get(0).isDisplayed();
              assertTrue(isAdPresent,"Marketing ad is displayed");
//              System.out.println("Marketing ad is displayed");
		}catch (Exception e) {
			System.out.println("Exception occurred while verifying Marketing Ads: "+ e.getMessage());
		}
	}
	
	public void verifyBalanceConfirmationWidget() {
	    try {
	        List<WebElement> widgets = driver.findElements(
	            AppiumBy.accessibilityId("Balance Confirmation\\nConfirm your balance before 15th May\\nConfirm now to avoid penalty")
	        );

	        // Pass the assertion if the widget is either not present or not displayed
	        boolean isNotDisplayed = widgets.isEmpty() || !widgets.get(0).isDisplayed();
	        assertTrue(isNotDisplayed, "Widget should not be displayed");

	        System.out.println("BalanceConfirmation Widget is not displayed");
	    } catch (Exception e) {
	        System.out.println("Exception occurred while verifying BalanceConfirmation Widget: " + e.getMessage());
	    }
	}
	
	public void ClickOnBalanceConfirmationWidget() {
		 WebElement widget = driver.findElement(
	            AppiumBy.accessibilityId("Balance Confirmation\\nConfirm your balance before 15th May\\nConfirm now to avoid penalty")
	        );
		 widget.click();
		
	}
	
	public void clickOnOrderButton() {
		try {
//			orderButton.click();
//			System.out.println("clicked on order Button");
			WebElement order = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Orders\r\n"
					+ "Tab 2 of 5\")"));
			order.click();
		}catch (Exception e) {
			System.out.println("Not able to click on order Button");
		}
	}

	

}
