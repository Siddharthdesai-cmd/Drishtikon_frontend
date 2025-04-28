package GenericUtility;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import objectRepo.LoginScreen;
 

/**
 * @author testing.engineer2
 */
public class BaseClass {
	
	public static AndroidDriver driver;
	public LoginScreen ls;
	
	@BeforeMethod
	public void launchApp() throws MalformedURLException, InterruptedException {
		
		   DesiredCapabilities cap = new DesiredCapabilities();

	        cap.setCapability("deviceName", "Galaxy A35 5G");
	        cap.setCapability("udid", "RZCY12RW62D"); // ✅ should be lowercase "udid"
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("automationName", "UiAutomator2");
	        cap.setCapability("noReset", true);                     
	 
	        // Optional: include if you're launching the app directly via session
	        cap.setCapability("appPackage", "com.godrej.distributorcrm");
	        cap.setCapability("appActivity", "com.godrej.distributorcrm.MainActivity");

	        // ✅ Include the /wd/hub path
	        URL url = URI.create("http://localhost:4723").toURL();
	         
//	        URL url = new URL("http://127.0.0.1:4723/wd/hub");
	    

	        // AndroidDriver with <MobileElement>
	         driver = new AndroidDriver(url, cap);

	        // ✅ Activate the app (optional since you're already launching it via caps)
	        driver.activateApp("com.godrej.distributorcrm");

	        System.out.println("Application Started...");
	        
	        Thread.sleep(5000);
	
	
	        ls = new LoginScreen(driver);
	}
	
	@AfterMethod
	public void CloseApp() {
		
		
		driver.terminateApp("com.godrej.distributorcrm");		
	}
	

	
}
