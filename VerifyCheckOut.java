package FlipAssignment.SwagLabs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class VerifyCheckOut extends BaseTest {
	String firstname = "Rudi";
	String lastname = "Rust";
	String zip = "11160";

	@SuppressWarnings("deprecation")
	public void addToCart() {
		// Get title and price SauceLabsBackPack
		String title = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]"))
				.getText();
		System.out.println(title);
		String price = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[1]"))
				.getText();
		System.out.println(price);

		// Get title and price SauceLabsBikeLight
		String titlebikelight = driver
				.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Item title\"])[2]")).getText();
		System.out.println(titlebikelight);
		String price2 = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[2]"))
				.getText();
		System.out.println(price2);

		// Add to Cart
		driver.findElement(
				By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView"))
				.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(
				By.xpath("//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]/android.widget.TextView"))
				.click();

		// open cart
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView"))
				.click();

		// check out
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]")).click();

		// check out information
		String checkoutinfo = driver.findElement(By.id("00000000-0000-014f-ffff-ffff000001b7")).getText();
		System.out.println(checkoutinfo);

		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]"))
				.sendKeys(firstname);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]")).sendKeys(lastname);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]")).sendKeys(zip);

		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]")).click();

		// Check Out overview
		String checkoutover = driver.findElement(By.id("00000000-0000-014f-ffff-ffff000001e4")).getText();
		System.out.println(checkoutover);

		driver.findElement(By.xpath(
				"//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: OVERVIEW\"]/android.view.ViewGroup/android.widget.TextView[5]"))
				.getText();

		// click finish
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]/android.widget.TextView"))
				.click();

		// check out complete
		String checkoutcomp = driver.findElement(By.id("00000000-0000-014f-ffff-ffff000002ef")).getText();
		System.out.println(checkoutcomp);

		String thanks = driver.findElement(By.xpath(
				"//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]"))
				.getText();
		System.out.println(thanks);

		driver.findElement(By.xpath(
				"//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.ImageView"))
				.isEnabled();
	}

}
