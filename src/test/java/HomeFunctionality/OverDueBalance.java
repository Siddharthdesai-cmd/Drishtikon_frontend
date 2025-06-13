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
	
}
