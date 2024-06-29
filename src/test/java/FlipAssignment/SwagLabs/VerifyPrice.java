package FlipAssignment.SwagLabs;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyPrice extends BaseTest {
    @Test
	public void highToLow () throws MalformedURLException
	{
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView")).click();
		
		//check high price1 and label
		if (driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")).isDisplayed())
		{
			System.out.println("AssertText Title1 Success");
		}
		else if (driver.findElement(By.xpath("“//android.widget.TextView[@content-desc=\"test-Price\"])[1]”")).isDisplayed())
		{
		System.out.println("AssertText Price1 success");
		} 
		else 
		{ 
			System.out.println("AssertText failed");
		}
		
		//check high price2
		String price2 = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[2]")).getText();
		System.out.println(price2);
		
		//check high price3
		String price3 = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[3]")).getText();
		System.out.println(price3);
		
		//check high price4
		String price4 = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[4]")).getText();
		System.out.println(price4);
	
	}
    
    public void lowToHigh () throws MalformedURLException 
    {
    	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
    	driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView")).click();
    	
    	//check low price1
    	String element = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[1]")).getText();
    	System.out.println(element);
    	
    	//check low price2
    	String price2 = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[2]")).getText();
    	System.out.println(price2);
    	
    	//check low price3
    	String price3 = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[3]")).getText();
    	System.out.println(price3);
    	
    	//check low price4
    	String price4 = driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[4]")).getText();
    	System.out.println(price4);
    }
}


