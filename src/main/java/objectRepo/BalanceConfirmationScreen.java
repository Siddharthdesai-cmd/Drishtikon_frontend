package objectRepo;


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
	
	
}
