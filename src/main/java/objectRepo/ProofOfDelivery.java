package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;
import io.appium.java_client.android.AndroidDriver;

public class ProofOfDelivery extends BaseClass{
	
	AndroidDriver driver;
	public ProofOfDelivery(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.View[@content-desc='Filters']")
	private WebElement FilterButton;
	
	@FindBy(xpath = "//android.widget.RadioButton[@content-desc='Last Week']")
	private WebElement LastWeekRadioButton;
	
	@FindBy(xpath = "//android.widget.RadioButton[@content-desc='Last Month']")
	private WebElement LastMonthRadioButton;
	
	@FindBy(xpath = "//android.widget.RadioButton[@content-desc='Last 3 Months']")
	private WebElement Last3MonthRadioButton;
	
	@FindBy(xpath = "//android.widget.RadioButton[@content-desc='Last 6 Months']")
	private WebElement Last6MonthRadioButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Filters']/android.view.View[1]")
	private WebElement BackArrowButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='All']")
	private WebElement AllButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Discrepancy']")
	private WebElement DiscrepencyButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Pending']")
	private WebElement PendingButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Delivered']")
	private WebElement DeliveryButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Clear All']")
	private WebElement ClearAllButton;
	
	public void clickOnFilterButton() {
		try {
			FilterButton.click();
			System.out.println("Clicked on Filter Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Filter Button");
		}
	}
	
	public void clickOnLastWeekRadioButton() {
		try {
			LastWeekRadioButton.click();
		}catch (Exception e) {
			System.out.println("Not able to click on Last Week RadioButton");
		}
	}
	
	public void clickOnLastMonthRadioButton() {
		try {
			LastMonthRadioButton.click();
			System.out.println("Clicked on Last Month");
		}catch (Exception e) {
			System.out.println("Not able to click on Last Month RadioButton");
		}
	}
	
	public void clickOnBackArrowButton() {
		try {
			BackArrowButton.click();
			System.out.println("clicked on back Arrow Button");
		}catch (Exception e) {
			System.err.println("Not able to click on Back Arrow Button");
		}
	}
	
	public void clickOnLast3MonthRadioButton() {
		try {
			Last3MonthRadioButton.click();
			System.out.println("clicked on Last 3 Month");
		}catch (Exception e) {
			System.out.println("Not able to click on Last 3 Month");
		}
	}
	
	public void clickOnLast6MonthRadioButton() {
		try {
			Last6MonthRadioButton.click();
			System.out.println("clicked on Last 6 Month");
		}catch (Exception e) {
			System.out.println("Not able to click on Last 6 Month");
		}
	}
	
	public void clickOnAllButton() {
		try {
			AllButton.click();
			System.out.println("Clicked on all button");
		}catch (Exception e) {
			System.out.println("Not able to click on All Button");
		}
	}
	
	public void ClickOnDiscrepencyButton() {
		try {
			DiscrepencyButton.click();
			System.out.println("Clicked on Discrepency Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Discrepency Button");
		}
	}
	
	public void ClickOnPendingButton() {
		try {
			PendingButton.click();
			System.out.println("Clicked on Pending Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Pending Button");
		}
	}
	
	public void clickOnDeliveryButton() {
		try {
			DeliveryButton.click();
			System.out.println("Clicked on Delivery Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Delivery Button");
		}
	}
	
	public void clickOnClearAllButton() {
		try {
			ClearAllButton.click();
			System.out.println("Clicked on ClearAll Button");
		}catch (Exception e) {
			System.out.println("Nota able to click on ClearAll Button");
		}
	}
}
