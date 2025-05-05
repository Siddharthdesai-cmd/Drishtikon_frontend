package GenericUtility;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import objectRepo.HomeScreen;
import objectRepo.LoginScreen;
 

/**
 * @author testing.engineer2
 */
public class BaseClass {
	
	public static AndroidDriver driver;
	public LoginScreen ls;
	public DriverUtility driverUtility;
	public GestureUtility gestureUtility;
	public HomeScreen homeScreen;
	
	@BeforeMethod
	public void launchApp() throws MalformedURLException, InterruptedException {
		
		   DesiredCapabilities cap = new DesiredCapabilities();

	        cap.setCapability("deviceName", "Redmi A2");
	        cap.setCapability("UDID", "WKAQCYCQKROVDE4L"); // ✅ should be lowercase "udid"
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("automationName", "UiAutomator2");
	        cap.setCapability("noReset", true);                     
	 
	        // Optional: include if you're launching the app directly via session
	        cap.setCapability("appPackage", "com.godrej.distributorcrm");
	        cap.setCapability("appActivity", "com.godrej.distributorcrm.MainActivity");

	        // ✅ Include the /wd/hub path
	        URL url = URI.create("http://localhost:4723").toURL();
	         driver = new AndroidDriver(url, cap);

	        // ✅ Activate the app (optional since you're already launching it via caps)
	        driver.activateApp("com.godrej.distributorcrm");
	        System.out.println("Application Started...");
	        
	        Thread.sleep(5000);
	
	
	        ls = new LoginScreen(driver);
	        driverUtility = new DriverUtility(driver);
	        gestureUtility = new GestureUtility(driver);
	        homeScreen = new HomeScreen(driver);
	        
	}
	
	@AfterMethod
	public void CloseApp() {
		
		
		driver.terminateApp("com.godrej.distributorcrm");		
	}
	

	
}
