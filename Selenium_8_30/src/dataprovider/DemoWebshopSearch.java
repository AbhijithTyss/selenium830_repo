package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebshopSearch {
	@DataProvider
	public String[] dataSender() {
		String[] data= {"qwertyyu","qwertyuio","12345678","qwertyu123","qwerty!@#$%"};
		return data;
	}
	
	@Test(dataProvider ="dataSender" )
	public void search(String data) {
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys(data);
	}
}
