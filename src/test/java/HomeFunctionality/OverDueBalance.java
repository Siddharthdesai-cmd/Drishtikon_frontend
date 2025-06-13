package HomeFunctionality;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
/**
 * 
 *@author DivyaPrakashAmar
 */
public class OverDueBalance extends BaseClass{

	/**
	 * This is test case number TC_018
	 * This is to verify whether user is able to check their OverDue Balance
	 * @throws InterruptedException
	 */
	@Test(priority = 0)
	public void verifyUserAbleToSeeOverDueBalance() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "2000948";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(2);
		homeScreen.AssertNeedsAttention();
		ls.moreBtn();
		ls.Logout();
	}
	
	/**
	 * This is test case number TC_019
	 * This is to verify whether user is able to check their Overview Business Turnover In MTD
	 * @throws InterruptedException
	 */
	@Test(priority = 1)
	public void userShouldAbleToViewOverviewBusinessTurnoverInMTD() throws InterruptedException {
		String userName="2006982";
		driverUtility.implicitlyWait(20);
//		ls.ClickOnUsersName();
//		ls.SendKeysToUsernameTextField(username);
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(2);
//		homeScreen.clickOnMtdButton();
		ls.moreBtn();
		ls.Logout();
	}

	/*
	 *This is test case number TC_020
	 *This is to verify whether user is able to check their Overview Business Turnover In YTD
	 */
	@Test(priority = 2)
	public void verifyUserShouldAbleToViewOverviewBusinessTurnoverInYTD() throws InterruptedException {
		String userName="2006982";
		driverUtility.implicitlyWait(20);
//		ls.ClickOnUsersName();
//		ls.SendKeysToUsernameTextField(username);
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		homeScreen.clickOnMtdButton();
		ls.moreBtn();
		ls.Logout();
	}

	/**
	 * This is test case number TC_021
	 * This is to verify whether user is able to View Balance Confirmation Button
	 * @throws InterruptedException
	 */
	@Test(priority = 3)
	public void userShouldAbleToViewBalanceConfirmationButton() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		gestureUtility.scrollDown();
//		homeScreen.clickonBalanceConfirmation();
		gestureUtility.clickByAxes(372, 775);
		homeScreen.verifyBalanceConfirmationScreen();
		homeScreen.ClickOnBalanceConfirmationCrossButton();
		ls.moreBtn();
		ls.Logout();
	}
	
	/**
	 * This is test case number TC_022
	 * This is to verify whether user is able to View Balance Confirmation Widget
	 * @throws InterruptedException
	 */
	@Test(priority = 4)
	public void userShouldBeAbleToClickOnTheBalanceConfirmationWidget1() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		gestureUtility.clickByAxes(608, 1090);
		homeScreen.verifyBalanceConfirmationScreen();
		driverUtility.threadWait(4);
		homeScreen.ClickOnBalanceConfirmationCrossButton();
		ls.moreBtn();
		ls.Logout();
	}
	
	/**`
	 * This is test case number TC_023
	 * This is to verify whether user is able to Click ProofOfDelivery
	 * @throws InterruptedException
	 */
	@Test(priority = 5)
	public void verifyUserAbleToClickProofOfDelivery() throws InterruptedException {
		driverUtility.implicitlyWait(20); 
		String userName = "2006982";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys(); 
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		homeScreen.clickonProofofDelivery();
		homeScreen.assertProofOfDeliveryScreenTitle();
		homeScreen.clickOnProofOfDeliveryBackButton();
		driverUtility.threadWait(2);
		ls.moreBtn();
		ls.Logout();
	}
	
	/**
	 * This is test case number TC_024
	 * This is to verify whether user is able to see Marketing Products on Home screen
	 * @throws InterruptedException
	 */
	@Test(priority = 6)
	public void verifyInHomeScreenMarketingProductsShouldBeDisplay() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		gestureUtility.scrollDown();
		homeScreen.assertMarketingAd();
	}

	/**
	 * This is test case number TC_027
	 * This is to verify whether user is able to see Marketing Products on Home screen
	 * @throws InterruptedException
	 */
	@Test(priority = 7)
	public void verifyIfUserHasAlreadySubmitTheBalanceConfirmation() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "2006982";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		homeScreen.verifyBalanceConfirmationWidget();
		ls.moreBtn();
		ls.Logout();
		
	}
=======
	 * This is testcase number TC_018
	 * This is to verify wheather user is able to check their OverDue Balance
	 * @throws InterruptedException
	 */
	@Test(priority = 0)
	public void verifyUserAbleToSeeOverDueBalance() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "2000948";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(2);
		homeScreen.AssertNeedsAttention();
		ls.moreBtn();
		ls.Logout();
	}
	
	/**
	 * This is testcase number TC_019
	 * This is to verify wheather user is able to check their Overview Business Turnover In MTD
	 * @throws InterruptedException
	 */
	@Test(priority = 1)
	public void userShouldAbleToViewOverviewBusinessTurnoverInMTD() throws InterruptedException {
		String userName="2006982";
		driverUtility.implicitlyWait(20);
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(2);
//		homeScreen.clickOnMtdButton();
		ls.moreBtn();
		ls.Logout();
	}

	/*
	 *This is testcase number TC_020
	 *This is to verify wheather user is able to check their Overview Business Turnover In YTD
	 */
	@Test(priority = 2)
	public void verifyUserShouldAbleToViewOverviewBusinessTurnoverInYTD() throws InterruptedException {
		String userName="2006982";
		driverUtility.implicitlyWait(20);
//		ls.ClickOnUsersName();
//		ls.SendKeysToUsernameTextField(username);
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		homeScreen.clickOnMtdButton();
		ls.moreBtn();
		ls.Logout();
	}

	/**
	 * This is testcase number TC_021
	 * This is to verify wheather user is able to View Balance Confirmation Button
	 * @throws InterruptedException
	 */
	@Test(priority = 3)
	public void userShouldAbleToViewBalanceConfirmationButton() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		gestureUtility.scrollDown();
//		homeScreen.clickonBalanceConfirmation();
		gestureUtility.clickByAxes(372, 775);
		homeScreen.verifyBalanceConfirmationScreen();
		homeScreen.ClickOnBalanceConfirmationCrossButton();
		ls.moreBtn();
		ls.Logout();
	}
	
	/**
	 * This is testcase number TC_022
	 * This is to verify wheather user is able to View Balance Confirmation Widget
	 * @throws InterruptedException
	 */
	@Test(priority = 4)
	public void userShouldBeAbleToClickOnTheBalanceConfirmationWidget() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		gestureUtility.clickByAxes(608, 1090);
		homeScreen.verifyBalanceConfirmationScreen();
		driverUtility.threadWait(4);
		homeScreen.ClickOnBalanceConfirmationCrossButton();
		ls.moreBtn();
		ls.Logout();
	}
	
	/**
	 * This is testcase number TC_023
	 * This is to verify wheather user is able to Click ProofOfDelivery
	 * @throws InterruptedException
	 */
	@Test(priority = 5)
	public void verifyUserAbleToClickProofOfDelivery() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "2006982";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		homeScreen.clickonProofofDelivery();
		homeScreen.assertProofOfDeliveryScreenTitle();
		homeScreen.clickOnProofOfDeliveryBackButton();
		driverUtility.threadWait(2);
		ls.moreBtn();
		ls.Logout();
	}
	
	/**
	 * This is test case number TC_024
	 * This is to verify wheather user is able to see Marketing Products on Home screen
	 * @throws InterruptedException
	 */
	@Test(priority = 6)
	public void verifyInHomeScreenMarketingProductsShouldBeDisplay() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		gestureUtility.scrollDown();
		homeScreen.assertMarketingAd();
	}

	/**
	 * This is test case number TC_027
	 * This is to verify wheather user is able to see Marketing Products on Home screen
	 * @throws InterruptedException
	 */
	@Test(priority = 7)
	public void verifyIfUserHasAlreadySubmitTheBalanceConfirmation() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "2006982";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		homeScreen.verifyBalanceConfirmationWidget();
		ls.moreBtn();
		ls.Logout();
		
	}
	
	/**
	 * This method includes Test case number Tc_028 and TC_029
	 * Tjis is to verify whether user is able to download PDF 
	 * @throws InterruptedException
	 */
	@Test
	public void verifyWhetherUserAbleToViewStatementInPDF() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
//		homeScreen.ClickOnBalanceConfirmationWidget();
		gestureUtility.clickByAxes(605, 1096);
		balanceConfirmationScreen.ClickOnBalanceConfirmationViewStatementButton();
		driverUtility.threadWait(10);
	}
	
	/**
	 * This is TC_030
	 * @throws InterruptedException
	 */
	@Test
	public void verifyIfUserHasSubmitTheBalanceConfirmation() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
//		homeScreen.ClickOnBalanceConfirmationWidget();
		gestureUtility.clickByAxes(605, 1096);
		balanceConfirmationScreen.ClickOnBalanceConfirmationViewStatementButton();
		driverUtility.threadWait(7);
	}
	
	/**
	 * This is test case number TC_031
	 * @throws InterruptedException
	 */
	@Test
	public void verifyUserAbleToClickOnProceedOnTheBalanceConfimationWidget() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(5);
		gestureUtility.clickByAxes(605, 1096);
		balanceConfirmationScreen.clickOnBalanceConfirmationProceedButton();
	}
	/**
	 * This is test case number TC_043
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void IfUserDenyTheTransactionBalanceConfirmation() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "2013495";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(3);
		defaulterUser.ClickOnCancleButton();
		driverUtility.threadWait(5);
		gestureUtility.clickByAxes(605, 1096);
		balanceConfirmationScreen.verifyMessage();
		
	}
	/**
	 * This is test case number TC_044
	 * This is to verify Before confirming the balance confirming the balance confirmation transaction user able to click on cancel button
	 * @throws InterruptedException
	 */
	@Test
	public void verifyBeforeConfirmingTheBalanceConfirmingTheBalanceConfirmationTransactionUserAbletoClickOnCancelButton() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(3);
		defaulterUser.ClickOnCancleButton();
		gestureUtility.clickByAxes(605, 1096);
		balanceConfirmationScreen.clickOnBalanceConfirmationProceedButton();
		balanceConfirmationScreen.ClickOnConfirmButton();
		balanceConfirmationScreen.ClickOnCancelButton();
	}
	/**
	 * This is test case number TC_045
	 * This is to verify user can confirm balance through balance confirmation widget
	 * @throws InterruptedException
	 */
	@Test
	public void verifyIfUserWantToSubmitTheBalanceConfirmationThroughBalanceConfirmationWidget() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(3);
		defaulterUser.ClickOnCancleButton();
		gestureUtility.clickByAxes(605, 1096);
		balanceConfirmationScreen.clickOnBalanceConfirmationProceedButton();
		balanceConfirmationScreen.ClickOnConfirmButton();
		balanceConfirmationScreen.ClickOnYesConfirmButton();
	}
	/**
	 * This is test case Number TC_046
	 * This is to verify after confirming balance , BalanceConfirmation 
	 * @throws InterruptedException
	 */
	@Test
	public void UserAbleToClickOnBellIconAboveOfTheScreenRightSideOfTheGodrejagrovetName() throws InterruptedException {
		driverUtility.implicitlyWait(40);
		String userName = "1013473";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(3);
//		gestureUtility.clickByAxes(369, 1103);
		homeScreen.clickonBalanceConfirmation();
		balanceConfirmationScreen.VerifyBalanceConfirmationOkMessage();
	}
	/**
	 * This is test case number TC_047
	 * @throws InterruptedException
	 */
	@Test
	public void verifyUserShouldAbleToViewBalanceConfirmationIfTransactionIsSubmit() throws InterruptedException {
		driverUtility.implicitlyWait(20);
		String userName = "2018447 ";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.VFcode4sendkeys();
		ls.submitBtnClick();
		driverUtility.threadWait(3);
		gestureUtility.clickByAxes(362, 1090);
		balanceConfirmationScreen.ClickOnBalanceConfirmationViewStatementButton();
	}
	/**
	 * This is test case number TC_062
	 * @throws InterruptedException
	 * verifyTheCancelButtonShouldFunctionProperlyInTheUpdateQuantitySection
	 * verifyIfUserDenyTheTransactionBalanceConfirmation
	 */
	@Test
	public void verifyTheCancelButtonShouldFunctionProperlyInTheUpdateQuantitySection1() throws InterruptedException {
//		driverUtility.implicitlyWait(20);
//		String userName = "2018447 ";	
//		ls.clickOnUserNameAndSendKeys(userName);
//		ls.clickTandC();
//		ls.sendOTP();
//		ls.VFcode1sendkeys();
//		ls.VFcode2sendkeys();
//		ls.VFcode3sendkeys();
//		ls.VFcode4sendkeys();
//		ls.submitBtnClick();
		driverUtility.threadWait(8);
		gestureUtility.clickByAxes(310, 1081);
		driverUtility.threadWait(5);
		balanceConfirmationScreen.verifyDenialMessage();
	}
//	
//	@Test
//	public void verifyTheDiscrepancyFilterButtonShouldFunctionProperly() {
//		
//	}
	
	
	
	/**
	 * This is test case number TC_086
	 * need assertion
	 */
	@Test
	public void verifyTheLastMonthDateFilterButtonShouldFunctionProperly() {
		driverUtility.implicitlyWait(20);
		driverUtility.threadWait(8);
		gestureUtility.clickByAxes(117, 697);
		proofOfDelivery.clickOnFilterButton();
		proofOfDelivery.clickOnLastMonthRadioButton();
		proofOfDelivery.clickOnBackArrowButton();
		// apply button to be added
	}
	
	
	/**
	 * This is test case Number TC_087
	 * This is to verify whether user is able to apply last 3 month Filter option
	 */
	@Test
	public void verifyTheLast3MonthsDateFilterButtonShouldFunctionProperly() {
		driverUtility.implicitlyWait(20);
		driverUtility.threadWait(8);
		gestureUtility.clickByAxes(117, 697);  // clicking on Proof of delivery
		proofOfDelivery.clickOnFilterButton();
		proofOfDelivery.clickOnLast3MonthRadioButton();
		proofOfDelivery.clickOnBackArrowButton();
		// apply button to be added
	}
	
	/**
	 * This test case number TC_088
	 * This is to verify whether user is able to apply last 6 month Filter option
	 */
	@Test
	public void verifyTheLast6MonthsDateFilterButtonShouldFunctionProperly() {
		driverUtility.implicitlyWait(20);
		driverUtility.threadWait(8);
		gestureUtility.clickByAxes(117, 697);   // clicking on Proof of delivery
		proofOfDelivery.clickOnFilterButton();
		proofOfDelivery.clickOnLast6MonthRadioButton();
		proofOfDelivery.clickOnBackArrowButton();
		// apply button to be added
	}
	
	/**
	 * This is test case number TC_097
	 * This is to verify that user is able to apply
	 */
	@Test
	public void verifyTheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyLast3MonthAndDelivered() {
		driverUtility.implicitlyWait(20);
		driverUtility.threadWait(8);
		gestureUtility.clickByAxes(117, 1078);   // clicking on Proof of delivery
		proofOfDelivery.clickOnFilterButton();
		proofOfDelivery.clickOnLast3MonthRadioButton();
		proofOfDelivery.clickOnBackArrowButton();
		driverUtility.threadWait(10);
//		gestureUtility.scrollByDirection("left",32 );
		proofOfDelivery.clickOnDeliveryButton();
	}
	
	/**
	 * This is test case number TC_098
	 * This is to verify that user is able to apply Both The Date And Status Filters Simultaneously Last 6Month And Delivered
	 */
	@Test
	public void verifyTheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyLast6MonthAndDelivered() {
		driverUtility.implicitlyWait(20);
		driverUtility.threadWait(8);
		gestureUtility.clickByAxes(117, 1078);   // clicking on Proof of delivery
		proofOfDelivery.clickOnFilterButton();
		proofOfDelivery.clickOnLast6MonthRadioButton();
		proofOfDelivery.clickOnBackArrowButton();
		driverUtility.threadWait(10);
//		gestureUtility.scrollByDirection("left",32 );
		proofOfDelivery.clickOnDeliveryButton();
	}
	
	/**
	 * This is test case number TC_099
	 * This is to verify that user is able to apply Both The Date And Status Filters Simultaneously Last 6Month And Pending
	 */
	@Test
	public void verifyTheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyLast6MonthAndPending() {
		driverUtility.implicitlyWait(20);
		driverUtility.threadWait(8);
		gestureUtility.clickByAxes(117, 1078);   // clicking on Proof of delivery
		proofOfDelivery.clickOnFilterButton();
		proofOfDelivery.clickOnLast6MonthRadioButton();
		proofOfDelivery.clickOnBackArrowButton();
		driverUtility.threadWait(2);
		proofOfDelivery.ClickOnPendingButton();
	}
	
	
	/**
	 * This is test case number TC_100
	 * This is to verify that user is able to apply Both The Date And Status Filters Simultaneously Last 6Month And Discrepancy
	 */
	@Test
	public void verifyTheFilterButtonShouldApplyBothTheDateAndStatusFiltersSimultaneouslyLast6MonthAndDiscrepancy() {
		driverUtility.implicitlyWait(20);
		driverUtility.threadWait(8);
		homeScreen.clickonProofofDelivery();
//		gestureUtility.clickByAxes(117, 1078);   // clicking on Proof of delivery
//		proofOfDelivery.clickOnFilterButton();
//		proofOfDelivery.clickOnLast6MonthRadioButton();
//		proofOfDelivery.clickOnBackArrowButton();
//		driverUtility.threadWait(2);
//		proofOfDelivery.ClickOnDiscrepencyButton();
	}
	
	/**
	 * This is test case number TC_101
	 * This is to verify Clear All Filter button is working properly
	 */
	@Test
	public void verifyClearAllFilterShouldBeWork() {
		driverUtility.implicitlyWait(20);
		driverUtility.threadWait(8);
		gestureUtility.clickByAxes(117, 1078);   // clicking on Proof of delivery
		proofOfDelivery.clickOnFilterButton();
		proofOfDelivery.clickOnClearAllButton();
	}
	
	
>>>>>>> branch 'master' of https://github.com/TEGodrej/Drishtikon_frontend.git
	
}
