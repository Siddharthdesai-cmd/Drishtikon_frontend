package objectRepo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LoginScreen extends BaseClass{

	
	AndroidDriver driver;
	public LoginScreen(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className = "android.widget.EditText")
	private WebElement userName;
	
	public void ClickOnUsersName() {
		try {
			driverUtility.threadWait(15);
			userName.click();
			driverUtility.threadWait(2);
			System.out.println("Clicked on username");
			driverUtility.threadWait(2);
		}catch (Exception e) {
			System.out.println("Not able to click on username");
		}
	}
	
	public void SendKeysToUsernameTextField(String key) {
		try {
			driverUtility.threadWait(2);
			userName.sendKeys(key);
			String value = userName.getText();
			System.out.println("Entered value "+ value);
			driverUtility.threadWait(2);
		}catch (Exception e) {
			System.out.println("Not able to sendkeys to username ");
		}
	}
	
	public void clickOnUserNameAndSendKeys(String key) throws InterruptedException {
		
		Thread.sleep(5000);
		 WebElement UserName = driver.findElement(AppiumBy.className("android.widget.EditText"));
	        UserName.click(); 
	        System.out.println("Clicked on UserName");
	        Thread.sleep(3000);
	        UserName.sendKeys(key);
	        Thread.sleep(5000);
	        driver.hideKeyboard();
	        
	}
	
	public void DefaulterUser() throws InterruptedException {
		
		String userName = "2019549";
		Thread.sleep(5000);
		 WebElement UserName = driver.findElement(AppiumBy.className("android.widget.EditText"));
	        UserName.click(); 
	        System.out.println("Clicked on UserName");
	        Thread.sleep(3000);
	        UserName.sendKeys(userName);
	        Thread.sleep(5000);
	        driver.hideKeyboard();
	        
	}
	
	public void inValidUser() throws InterruptedException {
		
		String invalid = "2000941";
		WebElement UserName = driver.findElement(AppiumBy.className("android.widget.EditText"));
        UserName.click(); 
        System.out.println("Clicked on UserName");
        Thread.sleep(3000);
        UserName.sendKeys(invalid);
        Thread.sleep(5000);
        driver.hideKeyboard();
	}
	
	public void clickTandC() throws InterruptedException{
		
        WebElement TandC = driver.findElement(AppiumBy.className(
     		    "android.widget.CheckBox"));
        
        TandC.click();
        System.out.println("Clicked on Terms and condition");
        Thread.sleep(5000);
		
	}                                         

	public void assertSendOTP() throws InterruptedException {
		
        WebElement sendOTP = driver.findElement(AppiumBy.className(
     		    "android.widget.Button"));
        
        assertTrue(!sendOTP.isEnabled());
        System.out.println("assert otp button disabled");
        Thread.sleep(7000);
	}
	
	
	public void sendOTP() throws InterruptedException {
		
        WebElement sendOTP = driver.findElement(AppiumBy.className(
     		    "android.widget.Button"));
        
        sendOTP.click();
        System.out.println("Clicked on Send OTP button");
        Thread.sleep(3000);
	}
	
	public void VFcode1sendkeys() throws InterruptedException {
		
		WebElement VFcode1 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
		
        VFcode1.click();
        Thread.sleep(1000);
        VFcode1.sendKeys("1");
        
        Thread.sleep(2000);
	}
	
	public void VFcode2sendkeys() throws InterruptedException {
		
        WebElement VFcode2 = driver.findElement(AppiumBy.androidUIAutomator(
     		    "new UiSelector().className(\"android.widget.EditText\").instance(1)"));
        VFcode2.click();
        VFcode2.sendKeys("2");
        
       Thread.sleep(2000);
	}
	
	public void VFcode3sendkeys() throws InterruptedException {
		
        WebElement VFcode3 = driver.findElement(AppiumBy.androidUIAutomator(
     		    "new UiSelector().className(\"android.widget.EditText\").instance(2)"));
        VFcode3.click();
        Thread.sleep(2000);
        VFcode3.sendKeys("3");
        
       
	}
	
	public void VFcode4sendkeys() throws InterruptedException {
		
        WebElement VFcode4 = driver.findElement(AppiumBy.androidUIAutomator(
     		    "new UiSelector().className(\"android.widget.EditText\").instance(3)"));
        VFcode4.click();
        VFcode4.sendKeys("4");
        
       Thread.sleep(2000);
	}
	
	public void doubledigitOTP() throws InterruptedException {
		
        WebElement VFcode3 = driver.findElement(AppiumBy.androidUIAutomator(
     		    "new UiSelector().className(\"android.widget.EditText\").instance(2)"));
        VFcode3.click();
        VFcode3.sendKeys("34");
        
       Thread.sleep(2000);
	}
	
	public void submitBtnClick() throws InterruptedException {
		
		Thread.sleep(4000);
        WebElement Submitbtn = driver.findElement(AppiumBy.className(
     		    "android.widget.Button"));
        Submitbtn.click();
        System.out.println("Clicked on Submit Button");
        
        
	}
	
	public void submitBtnNotEnabled() throws InterruptedException {
		
		Thread.sleep(4000);
        WebElement Submitbtn = driver.findElement(AppiumBy.className(
     		    "android.widget.Button"));
        assertTrue(!Submitbtn.isEnabled());   
        System.out.println("Clicked on Submit Button");
        
        
	}
	
	
	public void moreBtn() throws InterruptedException {
		
		Thread.sleep(5000); 
      WebElement Morebtn = driver.findElement(AppiumBy.accessibilityId("More\nTab 5 of 5"));
      Morebtn.click();
     
	}	
	
	public void Logout() throws InterruptedException {
		
      Thread.sleep(4000); 
      WebElement LogoutButton = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Logout\"]"));
      LogoutButton.click(); 
	
	}
	
	
	public void assertBlocked() throws InterruptedException {
		
		Thread.sleep(4000); 
		WebElement BlockedTest = driver.findElement(AppiumBy.accessibilityId("Blocked User"));
		assertTrue(BlockedTest.isDisplayed());
		System.out.println("Message displayed");
	}
	
	
	
	public void assertDefaulter() throws InterruptedException {
		
		Thread.sleep(4000); 
		WebElement BlockedTest = driver.findElement(AppiumBy.accessibilityId("Defaulter User"));
		assertTrue(BlockedTest.isDisplayed());
		System.out.println("Message displayed");
	}
	
	public void DefaulterclicksCancel() throws InterruptedException {
		
		Thread.sleep(4000); 
		WebElement BlockedTest = driver.findElement(AppiumBy.accessibilityId("Cancel"));
		assertTrue(BlockedTest.isDisplayed());
		System.out.println("Message displayed");
	}
	
	
	
	
	
}
 