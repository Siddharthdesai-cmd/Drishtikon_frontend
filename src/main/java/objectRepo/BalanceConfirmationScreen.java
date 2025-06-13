package objectRepo;


<<<<<<< HEAD
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;

/**
 * 
 *@author DivyaPrakashAmar
 */
public class BalanceConfirmationScreen {
	
	AndroidDriver driver;
	public BalanceConfirmationScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc='Proceed']")
	private WebElement balanceConfirmationProceedButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='View Statement']")
	private WebElement balanceConfirmationViewStatementbutton;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	private WebElement balanceConfirmationCrossbutton;
	
	
	public void clickOnBalanceConfirmationProceedButton() {
		try {
			balanceConfirmationProceedButton.click();
			System.out.println("Clicked on Balance Confirmation Proceed Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Balance Confirmation Proceed Button");
		}
	}
	
	public void clickOnBalanceConfirmationCrossButton() {
		try {
			balanceConfirmationCrossbutton.click();
			System.out.println("Clicked on Balance Confirmation Crossbutton");
		}catch (Exception e) {
			System.out.println("Not able to click on Balance Confirmation Crossbutton");
		}
	}
	
	public void ClickOnBalanceConfirmationViewStatementButton() {
		try {
			balanceConfirmationViewStatementbutton.click();
			System.out.println("Clicked on Balance Confirmation ViewStatement Button");
		}catch (Exception e) {
			System.out.println("Not able to click on BalanceConfirmation ViewStatement Button");
		}
	}
	
	
=======
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

/**
 * 
 *@author DivyaPrakashAmar
 */
public class BalanceConfirmationScreen {
	
	AndroidDriver driver;
	public BalanceConfirmationScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc='Proceed']")
	private WebElement balanceConfirmationProceedButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='View Statement']")
	private WebElement balanceConfirmationViewStatementbutton;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")
	private WebElement balanceConfirmationCrossbutton;
	
	public void verifyPDF() {
		WebElement pdf = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Ms. ISHAR POULTRY LAYER FARMS\r\n"
				+ "PARMINDER SINGH\r\n"
				+ "Vill Udaypur Kataiya, Nigohi Road\r\n"
				+ "242001 SHAHJAHANPUR-HARDOI\r\n"
				+ "INDIA\r\n"
				+ "Account Statement\r\n"
				+ "Date\r\n"
				+ "06.05.2025\r\n"
				+ "Telephone\r\n"
				+ "Fax\r\n"
				+ "Your account with us\r\n"
				+ "1013473\r\n"
				+ "New NEFT/RTGS details:\r\n"
				+ "Virtual A/c: GODCEN1013473, IFSC:\r\n"
				+ "HDFC0001943\r\n"
				+ "Account statement from06.04.2025 to 06.05.2025.\r\n"
				+ "Opening Balance as on 06.04.2025 : 3,265,205.12 .\r\n"
				+ "Post.Date Doc. No. Ref Doc No Type Debit Credit Text\r\n"
				+ "TOTAL\r\n"
				+ "Closing Balance as on 06.05.2025 : 3,265,205.12 \r\n"
				+ "Page 1 of 2\r\n"
				+ "\")"));
		try {
			assertTrue(pdf.isDisplayed());
		}catch (Exception e) {
			System.out.println("pdf not downloaded");
		}
	}
	
//	public void ClickOnPdfBack
	
	@FindBy(xpath = "//android.view.View[contains(@content-desc,'Balance was already been denied')]")
	private WebElement message;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Confirm']")
	private WebElement confirmButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View")
	private WebElement BalanceConfirmationTitle;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Yes, Confirm']")
	private WebElement YesConfirmButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Balance was already confirmed. it cannot be confirmed multiple times in a month.']")
	private WebElement balanceConfirmationOkMessage;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Balance was already been denied on 21st January 2025; it cannot be denied multiple times within the same month.']")
	private WebElement DenialMessage;
	
	
	public void clickOnBalanceConfirmationProceedButton() {
		try {
			balanceConfirmationProceedButton.click();
			System.out.println("Clicked on Balance Confirmation Proceed Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Balance Confirmation Proceed Button");
		}
	}
	
	public void clickOnBalanceConfirmationCrossButton() {
		try {
			balanceConfirmationCrossbutton.click();
			System.out.println("Clicked on Balance Confirmation Crossbutton");
		}catch (Exception e) {
			System.out.println("Not able to click on Balance Confirmation Crossbutton");
		}
	}
	
	public void ClickOnBalanceConfirmationViewStatementButton() {
		try {
			balanceConfirmationViewStatementbutton.click();
			System.out.println("Clicked on Balance Confirmation ViewStatement Button");
		}catch (Exception e) {
			System.out.println("Not able to click on BalanceConfirmation ViewStatement Button");
		}
	}
	
	public void verifyMessage() {
		try {
			
			assertTrue(message.isDisplayed());
			System.out.println(" Displayed message");
		}catch (Exception e) {
			System.out.println("Not Displayed message");
		}
	}
	
	public void ClickOnConfirmButton() {
		try {
			confirmButton.click();
			System.out.println("Clicked on confirm Button");
		}catch (Exception e) {
			System.out.println("Not able to click on confirm Button");
		}
	}
	
	public void ClickOnCancelButton() {
		try {
			cancelButton.click();
			System.out.println("Clicked on Cancel Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Cancel Button");
		}
	}
	
	public void verifyBalanceConfirmationTitle() {
		try {
			assertTrue(BalanceConfirmationTitle.isDisplayed());
			System.out.println("Title is displayed");
		}catch (Exception e) {
			System.out.println("Title is not displayed");
		}
	}
	
	public void ClickOnYesConfirmButton() {
		try {
			YesConfirmButton.click();
			System.out.println("Clicked on YesConfirm Button");
		}catch (Exception e) {
			System.out.println("Not able to click on YesConfirm Button");
		}
	}
	
	public void VerifyBalanceConfirmationOkMessage() {
		try {
			assertTrue(balanceConfirmationOkMessage.isDisplayed());
			System.out.println("Message is dispayed ");
		}catch (Exception e) {
			System.out.println("Message is not displayed ");
		}
	}
	
	public void verifyDenialMessage() {
		if(DenialMessage.isDisplayed()){
			System.out.println("displayed");
		}else {
			System.out.println("not displayed");
		}
	}
>>>>>>> branch 'master' of https://github.com/TEGodrej/Drishtikon_frontend.git
}
