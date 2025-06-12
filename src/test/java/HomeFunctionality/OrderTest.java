package HomeFunctionality;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class OrderTest extends BaseClass{

	/**
	 * This is test case number TC_104
	 */
	@Test
	public void verifyConfirmedOrderStatus() {

		driverUtility.implicitWait(10);
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.clickOnfirstWidget();
	}
	
	/**
	 * This is test case number TC_105
	 */
	@Test
	public void verifyConfirmedOrderValue() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.clickOnfirstWidget();
		driverUtility.threadWait(2);
		orderScreen.verifyOrderDetails();
	}
	
	/**
	 * This is test case numnber TC_106
	 */
	@Test
	public void ToCheckConfirmedOrderStatus() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.clickOnfirstWidget();
	}
	
	/**
	 * this is test cases Number TC_111
	 */
	@Test
	public  void verifyCheckOrderValueAndVolumeOfConfirmedOrders() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.clickOnfirstWidget();
		driverUtility.threadWait(4);
		orderScreen.verifyOrder();
	}
	
	/**
	 * This is test case number TC_112
	 */
	@Test
	public void verifyCheckOrderValueAndVolumeOfDispatchOrders() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.clickOnfirstWidget();
		driverUtility.threadWait(4);
		orderScreen.verifyOrder();
	}
	
	/**
	 * This is test case number TC_113
	 */
	@Test
	public void verifyDownloadInvoiceFromTheDispatchOrder() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(2);
		orderScreen.clickOnDispatchedButton();
		driverUtility.threadWait(2);
		orderScreen.clickOnSecondOrder();
		driverUtility.threadWait(2);
		orderScreen.verifySecondOrderDetails();
	}
	
	/**
	 * This is test case number TC_114
	 */
	@Test
	public void verifyUserAbleToViewDetailsOnProofOfDelivery() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		gestureUtility.scrollDown();
		orderScreen.clickOnSecondOrder();
//		orderScreen.clickOnProofOfDelivery();
		driverUtility.threadWait(4);
		gestureUtility.clickByAxes(620, 1361);
		driverUtility.threadWait(4);
		orderScreen.verifySecondOrderDetail();
	}
	
	@Test
	public void UserAbleToViewOrderDetailsWithMaterialAndQuantity() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		gestureUtility.scrollDown();
		orderScreen.clickOnSecondOrder();
//		orderScreen.clickOnProofOfDelivery();
		driverUtility.threadWait(4);
		gestureUtility.clickByAxes(620, 1361);
		driverUtility.threadWait(4);
		orderScreen.verifySecondOrderDetail();
	}
	
	@Test
	public void UserAbleToClickOnConfirmDeliveryButton() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		gestureUtility.scrollDown();
		orderScreen.clickOnSecondOrder();
		orderScreen.clickOnProofOfDelivery();
		driverUtility.threadWait(4);
		gestureUtility.clickByAxes(620, 1361);
		driverUtility.threadWait(4);
		orderScreen.ClickOnConfirmDeliveryButton();
		orderScreen.ClickOnCancelButton();
	}
	
	@Test
	public void ToCheckTheDateFilterOptionWhenLastMonthIsSelectedItShouldWorkAsExpected() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnLastWeekButton();
		orderScreen.clickOnApplyButton();
	}
	
	
	@Test
	public void ToCheckTheDateFilterOptionWhenLast3MonthIsSelectedItShouldWorkAsExpected() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnLast3MonthButton();
		orderScreen.clickOnApplyButton();
	}
	
	@Test
	public void ToCheckTheDateFilterOptionWhenLast6MonthIsSelectedItShouldWorkAsExpected() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnLast6MonthButton();
		orderScreen.clickOnApplyButton();
		
   }
	
	/**
	 * test 152,53,54
	 */
	@Test
	public void TheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyLast6MonthAndConfirmed() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnLast6MonthButton();
		orderScreen.clickOnApplyButton();
		orderScreen.clickOnConfirmButton();
		orderScreen.verifyConfirmedOrder();
	}
	
	@Test
	public void TheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyCustomRangeAndConfirmed() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
//		orderScreen.clickOnLast6MonthButton();
		orderScreen.clickOnCustomRange();
		
		orderScreen.clickOnApplyButton();
		orderScreen.clickOnConfirmButton();
		orderScreen.verifyConfirmedOrder();
	}
	
	@Test
	public void TheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyLastWeekAndDispatched() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnLastWeekButton();
		
		orderScreen.clickOnApplyButton();
		orderScreen.clickOnDispatchedButton();
		orderScreen.verifySecondOrderDetail();
	}
	
	@Test
	public void TheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyLast3MonthAndDispatched() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnLast3MonthButton();
		
		orderScreen.clickOnApplyButton();
		orderScreen.clickOnDispatchedButton();
		orderScreen.verifySecondOrderDetail();
	}
	
	
	@Test
	public void TheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyLast6MonthAndDispatched() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnLast6MonthButton();
		
		orderScreen.clickOnApplyButton();
		orderScreen.clickOnDispatchedButton();
		orderScreen.verifySecondOrderDetail();
	}
	
	@Test
	public void TheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyCustomRangeAndDispatch() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnCustomRange();
		
		orderScreen.clickOnApplyButton();
		orderScreen.clickOnDispatchedButton();
		orderScreen.verifySecondOrderDetail();
	}
	
	@Test
	public void TheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyLast6MonthAndDelivered() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnLast6MonthButton();
		orderScreen.clickOnStatusButton();
		orderScreen.ClickOnConfirmCheckBox();
		orderScreen.ClickOnDispatchCheckBox();
		orderScreen.clickOnApplyButton();
		orderScreen.VerifyDeliveryDetails();
	}
	
	@Test
	public void TheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyCustomRangeAndDelivered() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnCustomRange();
		orderScreen.clickOnStatusButton();
		orderScreen.ClickOnConfirmCheckBox();
		orderScreen.ClickOnDispatchCheckBox();
		orderScreen.clickOnApplyButton();
		orderScreen.VerifyDeliveryDetails();
	}
	
	@Test
	
	public void ToCheckTheStatusFilterOptionWhenConfirmedIsSelectedItShouldWorkAsExpected() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnStatusButton();
		orderScreen.ClickOnConfirmCheckBox();
		orderScreen.ClickOnDispatchCheckBox();
		orderScreen.clickOnApplyButton();
		orderScreen.VerifyDeliveryDetails();
	}
	
	
@Test
	
	public void ToCheckTheStatusFilterOptionWhenDispatchIsSelectedItShouldWorkAsExpected() {
		driverUtility.implicitWait(10);
//		homeScreen.clickOnOrderButton();
		gestureUtility.clickByAxes(221, 1425);
		driverUtility.threadWait(4);
		orderScreen.ClickOnFilterButton();
		orderScreen.clickOnStatusButton();
		orderScreen.ClickOnConfirmCheckBox();
		orderScreen.ClickOnDispatchCheckBox();
		orderScreen.clickOnApplyButton();
		orderScreen.VerifyDeliveryDetails();
	}
}