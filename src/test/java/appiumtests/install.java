package appiumtests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class install {
	
	
		@Test
		public void Install() throws MalformedURLException{
			
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("platformName", "android");
			dc.setCapability("deviceName", "sunmiTesting");
			dc.setCapability("automationName", "Uiautomator2");
			dc.setCapability("UDID", "V305233H20021");
			URL url = URI.create("http://localhost:4723").toURL();
			
			AndroidDriver driver=new AndroidDriver(url, dc);
			driver.installApp("C:\\Users\\testing.engineer\\Downloads\\app-armeabi-v7a-release.apk");
//			driver.isAppInstalled();
		}

		}
