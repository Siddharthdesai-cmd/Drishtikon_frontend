package appiumtests;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import GenericUtility.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import objectRepo.LoginScreen;
import objectRepo.homeScreen;



//public class AppiumTestD {
	 
//	public static void main(String[] args) throws MalformedURLException {
//		DesiredCapabilities dc= new DesiredCapabilities();
////		DesiredCapabilities dc=new DesiredCapabilities();
//		dc.setCapability("platformName", "android");
//		dc.setCapability("deviceName", "sunmiTesting");
//		dc.setCapability("automationName", "Uiautomator2");
//		dc.setCapability("UDID", "WKAQCYCQKROVDE4L");
////		dc.setCapability("app", "");
//		URL url = URI.create("http://localhost:4723").toURL();
//		
//		AndroidDriver driver=new AndroidDriver(url, dc);
////		driver.installApp("C:\\Users\\testing.engineer\\Downloads\\fms-operator-development-v1.17.22.apk");
////		driver.isAppInstalled();
//		
//		driver.activateApp("com.godrej.distributorcrm");
//		
//	}
//}
//




public class AppiumTestD extends BaseClass{

//	public AppiumTestD(AndroidDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}

//	homeScreen screen = new homeScreen(null);
	

	@Test (priority = 0)
	public void verifyLoginScreen() throws InterruptedException {
		
	ls.clickOnUserName();
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
		
	ls.clickOnUserName();
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
		
	ls.clickOnUserName();
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
		
		
		ls.clickOnUserName();
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.submitBtnNotEnabled();
		
		
	}
	
	@Test (priority = 7)
	public void onlytwoOTP() throws InterruptedException {
		
		
		ls.clickOnUserName();
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.submitBtnNotEnabled();           
		
	}
	
	@Test (priority = 8)
	public void onlythreeOTP() throws InterruptedException {
		
		
		ls.clickOnUserName();
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.VFcode3sendkeys();
		ls.submitBtnNotEnabled();          
	
		
	}
	
	@Test (priority = 9)
	public void multipleValuesOTP() throws InterruptedException {
		
		
		ls.clickOnUserName();
		ls.clickTandC();
		ls.sendOTP();
		ls.VFcode1sendkeys();
		ls.VFcode2sendkeys();
		ls.doubledigitOTP();
		ls.VFcode4sendkeys();
		ls.submitBtnNotEnabled();          

		
	}
	
	
	

		
	}
	
	
	
	
	
	
	
//        DesiredCapabilities cap = new DesiredCapabilities();
//
//        cap.setCapability("deviceName", "Galaxy A35 5G");
//        cap.setCapability("udid", "RZCY12RW62D"); // ✅ should be lowercase "udid"
//        cap.setCapability("platformName", "Android");
//        cap.setCapability("automationName", "UiAutomator2");
//        cap.setCapability("noReset", true);                     
// 
//        // Optional: include if you're launching the app directly via session
//        cap.setCapability("appPackage", "com.godrej.distributorcrm");
//        cap.setCapability("appActivity", "com.godrej.distributorcrm.MainActivity");
//
//        // ✅ Include the /wd/hub path
//        URL url = URI.create("http://localhost:4723").toURL();
//         
////        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//    
//
//        // AndroidDriver with <MobileElement>
//        AndroidDriver driver = new AndroidDriver(url, cap);
//
//        // ✅ Activate the app (optional since you're already launching it via caps)
//        driver.activateApp("com.godrej.distributorcrm");
//
//        System.out.println("Application Started...");
//        
//        Thread.sleep(5000);
//        
        
        
        
//        WebElement UserName = driver.findElement(AppiumBy.className("android.widget.EditText"));
//        
//        UserName.click();
//        System.out.println("Clicked on UserName");
//        Thread.sleep(3000);
//        UserName.sendKeys("2000948");
//        Thread.sleep(5000);
//        
        //zz
        
            
//        
//        WebElement TandC = driver.findElement(AppiumBy.className(
//     		    "android.widget.CheckBox"));
//        
//        TandC.click();
//        System.out.println("Clicked on Terms and condition");
//        Thread.sleep(5000);
//        
        
        
//        WebElement sendOTP = driver.findElement(AppiumBy.className(
//     		    "android.widget.Button"));
//        
//        sendOTP.click();
//        System.out.println("Clicked on Send OTP button");
//        Thread.sleep(7000);
      
//        
//        WebElement VFcode1 = driver.findElement(AppiumBy.androidUIAutomator(
//     		    "new UiSelector().className(\"android.widget.EditText\").instance(0)"));
//        VFcode1.click();
//        VFcode1.sendKeys("1");
//        
//        Thread.sleep(2000);
//        
//        WebElement VFcode2 = driver.findElement(AppiumBy.androidUIAutomator(
//     		    "new UiSelector().className(\"android.widget.EditText\").instance(1)"));
//        VFcode2.click();
//        VFcode2.sendKeys("2");
//        
//       Thread.sleep(2000);
//        
//        WebElement VFcode3 = driver.findElement(AppiumBy.androidUIAutomator(
//     		    "new UiSelector().className(\"android.widget.EditText\").instance(2)"));
//        VFcode3.click();
//        VFcode3.sendKeys("3");
//             
//        Thread.sleep(2000);
//        
//        WebElement VFcode4 = driver.findElement(AppiumBy.androidUIAutomator(
//     		    "new UiSelector().className(\"android.widget.EditText\").instance(3)"));
//        VFcode4.click();
//        VFcode4.sendKeys("4");
//        
//        System.out.println("Entered OTP");
//        Thread.sleep(2000); 
//        
//        WebElement Submitbtn = driver.findElement(AppiumBy.className(
//     		    "android.widget.Button"));
//        Submitbtn.click();
//        System.out.println("Clicked on Submit Button");
//   
        
        
        // Unused but to be used later
        
//        
//        WebElement overDue = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc, 'overdue balance')]"));
//        
//        overDue.click();
//        
////        assertTrue(overDue.isDisplayed());
//        try {
//        	 assertTrue(overDue.isDisplayed());
//        	 System.out.println("Displayed ");
//		} catch (Exception e) {
//			System.out.println("Not Displayed");
//		}
//        
//        Thread.sleep(7000); 
//        WebElement Morebtn = driver.findElement(AppiumBy.accessibilityId("More\nTab 5 of 5"));
//        Morebtn.click();
//        
//        Thread.sleep(2000); 
//        WebElement LogoutButton = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Logout\"]"));
//        LogoutButton.click(); 
        
        
        
        
        
        
        

  
//        System.out.println("Application ended...");
        
        
        // It's good practice to close the session
//        driver.quit(); 
//    }


