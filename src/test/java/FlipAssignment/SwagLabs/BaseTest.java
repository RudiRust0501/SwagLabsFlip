package FlipAssignment.SwagLabs;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	public AndroidDriver driver;

	@BeforeClass
	public void ConfigureSwagLabs() throws MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel XL API 32");
		options.setApp(
				"//Users//indochatqa1//eclipse-workspace//SwagLabs//src//test//java//resources//Android.SauceLabs.Mobile.app.2.7.1.apk");
		options.setCapability("unicodeKeyboard", false);
		options.setCapability("resetKeyboard", false);
		options.setCapability("systemPort", 8210);

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);

		String userStd = "standard_user";
		// String userLocked = "locked_out_user";
		// String userPro = "problem_user";
		String password = "secret_sauce";
		
		//Input Username
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).sendKeys(userStd);
		
		//Input Password
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).sendKeys(password);

		driver.findElement(By.id("test-LOGIN")).click();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
