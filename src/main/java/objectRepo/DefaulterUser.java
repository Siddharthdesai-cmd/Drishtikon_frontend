package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class DefaulterUser {
	
	AndroidDriver driver;
	public DefaulterUser(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}

	@FindBy(xpath = "//android.widget.Button[@content-desc='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Pay Now']")
	private WebElement PayNowButton;
	
	public void ClickOnCancleButton() {
		try {
			cancelButton.click();
			System.out.println("Clicked on CanCel Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Cancel Button");
		}
	}
}
