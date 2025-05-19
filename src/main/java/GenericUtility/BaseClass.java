package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import objectRepo.BalanceConfirmationScreen;
import objectRepo.DefaulterUser;
import objectRepo.HomeScreen;
import objectRepo.LoginScreen;
import objectRepo.ProofOfDelivery;
 

/**
 * @author testing.engineer2
 */
public class BaseClass {
	
	public static AndroidDriver driver;
	public LoginScreen ls;
	public DriverUtility driverUtility;
	public GestureUtility gestureUtility;
	public HomeScreen homeScreen;
	public BalanceConfirmationScreen balanceConfirmationScreen;
	public DefaulterUser defaulterUser;
	public AppiumDriverLocalService service ;
	public FileUtility fileUtility;
	public ProofOfDelivery proofOfDelivery;
	
	@BeforeMethod
	public void launchApp() throws InterruptedException, IOException {
//		/*
//		 * this is to start the appium server
//		 */			
//					
//					
//		File file = new File(FileUtility.getDataFromProperty("mainJSPath"));
//	    service = new AppiumServiceBuilder().withAppiumJS(file).withIPAddress(FileUtility.getDataFromProperty("ipAddress")).usingPort(Integer.parseInt(FileUtility.getDataFromProperty("portNumber"))).build();
//		service.start();
						
		/*         
		 * Fetching data from property file
		 * 
		 */			
					String platformName=FileUtility.getDataFromProperty("platformName");
					String DeviceName=FileUtility.getDataFromProperty("DeviceName");
					String automationName=FileUtility.getDataFromProperty("automationName");
					String udid=FileUtility.getDataFromProperty("UDID");
					String appActivty=FileUtility.getDataFromProperty("appActivity");
					String appPackage=FileUtility.getDataFromProperty("appPackage");
					String noReset=FileUtility.getDataFromProperty("noReset");
					
					DesiredCapabilities desiredCapability=new DesiredCapabilities();
					desiredCapability.setCapability("platformName", platformName);
					desiredCapability.setCapability("deviceName", DeviceName);
					desiredCapability.setCapability("automationName", automationName);
					desiredCapability.setCapability("UDID", udid);
					desiredCapability.setCapability("noReset", noReset);
					desiredCapability.setCapability("appActivity", appActivty);
					desiredCapability.setCapability("appPackage", appPackage);
					
//		   DesiredCapabilities cap = new DesiredCapabilities();
//
//	        cap.setCapability("deviceName", "Redmi A2");
//	        cap.setCapability("UDID", "WKAQCYCQKROVDE4L"); // ✅ should be lowercase "udid"
//	        cap.setCapability("platformName", "Android");
//	        cap.setCapability("automationName", "UiAutomator2");
//	        cap.setCapability("noReset", true);                     
//	 
//	        // Optional: include if you're launching the app directly via session
//	        cap.setCapability("appPackage", "com.godrej.distributorcrm");
//	        cap.setCapability("appActivity", "com.godrej.distributorcrm.MainActivity");

	        // ✅ Include the /wd/hub path
	        URL url = URI.create("http://localhost:4723").toURL();
	         driver = new AndroidDriver(url, desiredCapability);
	         
//	         if(driver.isDeviceLocked()) {
//		        	System.out.println("Unlocking device....");
//		        	driver.pin("1,2,3,4");
//		        	driver.unlockDevice();
//		        }else {
//		        	System.out.println("Devices is unlock");
//		        }

	        // ✅ Activate the app (optional since you're already launching it via caps)
	        driver.activateApp("com.godrej.distributorcrm");
	        System.out.println("Application Started...");
	        
	        
	        
	        Thread.sleep(5000);
	
	
	        ls = new LoginScreen(driver);
	        driverUtility = new DriverUtility(driver);
	        gestureUtility = new GestureUtility(driver);
	        homeScreen = new HomeScreen(driver);
	        balanceConfirmationScreen = new BalanceConfirmationScreen(driver);
	        defaulterUser = new DefaulterUser(driver);
	        fileUtility = new FileUtility();
	        proofOfDelivery = new ProofOfDelivery(driver);
	        
	}
	
//	@AfterMethod
//	public void CloseApp() {
//		
//		
//		driver.terminateApp("com.godrej.distributorcrm");		
//	}
	

	
}
