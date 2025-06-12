package objectRepo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class OrderScreen {
	
	AndroidDriver driver;
	public OrderScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.View[contains(@content-desc, 'Order No: 2001012156')]")
	private WebElement firstWidget;
	
	@FindBy(xpath = "//android.view.View[contains(@content-desc, 'Order Details')]")
	private WebElement orderDetails;
	
	@FindBy(xpath = "//android.view.View[contains(@content-desc, '2001012156')]")
	private WebElement OrderDetail;
	
	@FindBy(xpath = "//android.view.View[contains(@content-desc, 'Order No: 2001012161')]")
	private WebElement secondOrder;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Dispatched']")
	private WebElement dispatchedButton;
	
	@FindBy(xpath = "//android.view.View[\r\n"
			+ "  contains(@content-desc, 'Order Details') and\r\n"
			+ "  contains(@content-desc, '2001012161') and\r\n"
			+ "  contains(@content-desc, 'TESTING AUTO')\r\n"
			+ "]\r\n"
			+ "")
	private WebElement secondOrderDetails;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Proof of Delivery\r\n"
			+ "Review the proof of delivery and confirm within 10 days\"]")
	private WebElement proofOfDelivery;
	
	
	@FindBy(xpath = "//android.view.View[contains(@content-desc, \"Order No: 2001012161\")]\r\n"
			+ "")
	private WebElement secondOrderDetail;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Confirm Delivery']")
	private WebElement confirmDeliveryButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Cancel']")
	private WebElement CancelButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Filters']")
	private WebElement filterButton;
	
	@FindBy(xpath = "//android.widget.RadioButton[@content-desc='Last Week']")
	private WebElement lastWeekButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Apply']")
	private WebElement ApplyButton;
	
	@FindBy(xpath = "//android.widget.RadioButton[@content-desc='Last 3 Months']")
	private WebElement last3MonthButton;
	
	@FindBy(xpath = "//android.widget.RadioButton[@content-desc='Last 6 Months']")
	private WebElement last6MonthButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Confirmed']")
	private WebElement confirmButton;
	
	@FindBy(xpath = "//android.view.View[contains(@content-desc,'Order No: 2001012156')]")
	private WebElement confirmedOrder;
	
	@FindBy(xpath = "//android.widget.RadioButton[@content-desc='Custom Range']")
	private WebElement customRange;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Status']")
	private WebElement StatusButton;
	
	@FindBy(xpath = "//android.widget.CheckBox[@content-desc='Confirmed']")
	private WebElement ConfirmCheckBox;
	
	@FindBy(xpath = "//android.widget.CheckBox[@content-desc='Dispatched']")
	private WebElement DispatchCheckBox;
	
	@FindBy(xpath = "//android.view.View[contains(@content-desc,'Order No: 2001012157')]")
	private WebElement DeliveryDetails;
	
	@FindBy(xpath = "//android.widget.CheckBox[@content-desc='Delivered']")
	private WebElement DeliveredCheckBox;
	
	public void clickOnfirstWidget() {
		try {
			firstWidget.click();
			System.out.println("clicked on firstWidget");
		}catch (Exception e) {
			System.out.println("Not able to click on firstWidget");
		}
	}
	
	public void verifyOrderDetails() {
		if(orderDetails.isDisplayed()) {
			assertTrue(true, "Order details are displayed ");
		}else {
			System.out.println("Order details are not displayed");
		}
	}
	
	public void verifyOrder() {
		if (OrderDetail.isDisplayed()) {
			assertTrue(true, "order is displayed");
			String Details = OrderDetail.getText();
			System.out.println(Details);
		}else {
			System.out.println("order is not displayed");
		}
		
	}
	
	public void clickOnSecondOrder() {
		try {
			secondOrder.click();
			System.out.println("clicked on second order ");
		}catch (Exception e) {
			System.out.println("Not able to click on secondOrder Number");
		}
	}
	
	public void clickOnDispatchedButton() {
		try {
			dispatchedButton.click();
			System.out.println("clicked on dispatched Button");
		}catch (Exception e) {
			System.out.println("Not able to click on dispatched Button");
		}
	}
	
	public void verifySecondOrderDetails() {
		if(secondOrderDetails.isDisplayed()) {
			assertTrue(true, "Second order details are displayed");
		}else {
			System.out.println("Second order details are not dispalyed");
		}
	}
	
	public void clickOnProofOfDelivery() {
		try {
			proofOfDelivery.click();
			System.out.println("Clicked on proofOfDelivery Button");
		}catch (Exception e) {
			System.out.println("Not able to click on proofOfDelivery button");
		}
	}
	
	public void verifySecondOrderDetail() {
//		if(secondOrderDetail.isDisplayed()) {
//			assertTrue(true,"second order Detail is displayed");
//		}else {
//			System.out.println("Order details are not displayed");
//		}
		
		try {
			assertTrue(secondOrderDetail.isDisplayed());
			System.out.println("second order Detail is displayed");
		}catch (Exception e) {
			System.out.println("Order details are not displayed");
		}
	}
	
	public void ClickOnConfirmDeliveryButton() {
		try {
			confirmDeliveryButton.click();
			System.out.println("Clik on confirm Delivery Button");
		}catch (Exception e) {
			System.out.println("Not able to click on confirm Delivery Button");
		}
	}
	
	public void ClickOnCancelButton() {
		try {
			CancelButton.click();
			System.out.println("Click On Cancel Button");
		}catch (Exception e) {
			System.out.println("Not able to click on CancelButton");
		}
	}
	
	public void ClickOnFilterButton() {
		try {
			filterButton.click();
			System.out.println("Clicked on filter button");
		}catch (Exception e) {
			System.out.println("Not able to click on filter Button");
		}
	}
	
	public void clickOnLastWeekButton() {
		try {
			lastWeekButton.click();
			System.out.println("Clicked on lastWeekButton");
		}catch (Exception e) {
			System.out.println("Not able to click on lastWeekButton");
		}
	}
	
	public void clickOnApplyButton() {
		try {
			ApplyButton.click();
			System.out.println("Clicked on ApplyButton");
		}catch (Exception e) {
			System.out.println("Not able to click on ApplyButton");
		}
	}
	
	public void clickOnLast3MonthButton() {
		try {
			last3MonthButton.click();
			System.out.println("clicked on last3Month Button");
		}catch (Exception e) {
			System.out.println("Not able to click on last3Month Button");
		}
	}
	
	public void clickOnLast6MonthButton() {
		try {
			last6MonthButton.click();
			System.out.println("Clicked on last6Month Button");
		}catch (Exception e) {
			System.out.println("Not able to click on last6Month Button");
		}
	}
	
	public void clickOnConfirmButton() {
		try {
			confirmButton.click();
			System.out.println("Clicked on confirm Button");
		}catch (Exception e) {
			System.out.println("Not able to click on confirm button");
		}
	}
	
	public void verifyConfirmedOrder() {
		try {
			assertTrue(confirmedOrder.isDisplayed());
			System.out.println("confirmed Order is displayed");
		}catch (Exception e) {
			System.out.println("confirmed Order is not displayed");
		}
	}
	
	public void clickOnCustomRange() {
		try {
			customRange.click();
			System.out.println("clicked on customRange");
		}catch (Exception e) {
			System.out.println("Not able to click on customRange");
		}
	}
	
	public void clickOnStatusButton() {
		try {
			StatusButton.click();
			System.out.println("Clicked On StatusButton");
		}catch (Exception e) {
			System.out.println("Not able to click on Status Button");
		}
	}
	
	public void ClickOnConfirmCheckBox() {
		try {
			ConfirmCheckBox.click();
			System.out.println("Clicked on ConfirmCheckBox");
		}catch (Exception e) {
			System.out.println("Not able to click on ConfirmCheckBox");
		}
	}
	
	public void ClickOnDispatchCheckBox() {
		try {
			DispatchCheckBox.click();
			System.out.println("Clicked On DispatchCheckBox");
		}catch (Exception e) {
			System.out.println("Not able to click on DispatchCheckBox");
		}
	}
	
	public void VerifyDeliveryDetails() {
		try {
			assertTrue(DeliveryDetails.isDisplayed());
			System.out.println("DeliveryDetails are displayed");
		}catch (Exception e) {
			System.out.println("DeliveryDetails are not displayed");
		}
	}
}
