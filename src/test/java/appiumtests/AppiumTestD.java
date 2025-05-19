package appiumtests;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;


public class AppiumTestD extends BaseClass{

	

	@Test (priority = 0)
	public void verifyLoginScreen() throws InterruptedException {
	String userName = "2000948";	
	ls.clickOnUserNameAndSendKeys(userName);
	ls.clickTandC();
	ls.sendOTP();
	ls.VFcode1sendkeys();
	ls.VFcode2sendkeys();
	ls.VFcode3sendkeys();
	ls.VFcode4sendkeys();
	ls.submitBtnClick();            
	ls.moreBtn();
	ls.Logout();

	}	
	

	@Test (priority = 1)
	public void verifyLogout() throws InterruptedException {
		
	String userName = "2000948";	
	ls.clickOnUserNameAndSendKeys(userName);
	ls.clickTandC();
	ls.sendOTP();
	ls.VFcode1sendkeys();
	ls.VFcode2sendkeys();
	ls.VFcode3sendkeys();
	ls.VFcode4sendkeys();
	ls.submitBtnClick();            
	ls.moreBtn();
	ls.Logout();

	}	
	
	@Test (priority = 2)
	public void blockedUser() throws InterruptedException {
		
	ls.DefaulterUser();
	ls.clickTandC();
	ls.sendOTP();
	ls.VFcode1sendkeys();
	ls.VFcode2sendkeys();
	ls.VFcode3sendkeys();
	ls.VFcode4sendkeys();
	ls.submitBtnClick();            
	ls.assertDefaulter();

	}	
	
	@Test (priority = 3)
	public void Defaulteraftercancel() throws InterruptedException {
		
	ls.DefaulterUser();
	ls.clickTandC();
	ls.sendOTP();
	ls.VFcode1sendkeys();
	ls.VFcode2sendkeys();
	ls.VFcode3sendkeys();
	ls.VFcode4sendkeys();
	ls.submitBtnClick();            
	ls.assertDefaulter();
	ls.DefaulterclicksCancel();

	}	
	
	
	@Test (priority = 4)
	public void verifyLoginwithouttermsandConditions() throws InterruptedException {
		
		String userName = "2000948";	
		ls.clickOnUserNameAndSendKeys(userName);;
	    ls.assertSendOTP();
	
	}	
	
	@Test (priority = 5)
	public void invalid() throws InterruptedException {
		
		ls.inValidUser();
		ls.clickTandC();
		ls.sendOTP();
		ls.assertBlocked();

	} 
	
	@Test (priority = 6)
	public void onlyoneOTP() throws InterruptedException {
		
		
		String userName = "2000948";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.submitBtnNotEnabled();
		
		
	}
	
	@Test (priority = 7)
	public void onlytwoOTP() throws InterruptedException {
		
		
		String userName = "2000948";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.submitBtnNotEnabled();           
		
	}
	
	@Test (priority = 8)
	public void onlythreeOTP() throws InterruptedException {
		
		
		String userName = "2000948";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.submitBtnNotEnabled();          
	
		
	}
	
	@Test (priority = 9)
	public void multipleValuesOTP() throws InterruptedException {
		
		
		String userName = "2000948";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.doubledigitOTP();
		ls.VFcode4sendkeys();
		ls.submitBtnNotEnabled();          

	}
	@Test
	public void verifyOfflineLogin() throws InterruptedException {
		String userName = "2000948";	
		ls.clickOnUserNameAndSendKeys(userName);
		ls.clickTandC();
		ls.sendOTP();
//		ls.VFcode1sendkeys();
//		ls.VFcode2sendkeys();
		driverUtility.turnOffWifi();
		driverUtility.threadWait(5);
		homeScreen.clickOnAlertOkButton();
		driverUtility.turnOnWifi();
	}

}
