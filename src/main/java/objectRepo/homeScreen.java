package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class homeScreen {
	
	AndroidDriver driver;
	public homeScreen(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//android.widget.ImageView")
	private WebElement back;
	
	public void clickonProofofDelivery() {
	WebElement POD = driver.findElement(AppiumBy.androidUIAutomator(
		    "new UiSelector().className(\"android.widget.ImageView\").instance(4)"));
	POD.click(); 
	}
	
	
	public void clickonBalanceConfirmation() {
	WebElement balConf = driver.findElement(AppiumBy.androidUIAutomator(
		    "new UiSelector().className(\\\"android.widget.ImageView\\\").instance(5)"));
	balConf.click(); 
	}
	
	public void verifyLogo() {
		WebElement Logo = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)"));
		Logo.isDisplayed();
	}
	

	
	
	

}
