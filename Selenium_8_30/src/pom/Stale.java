package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
//		WebElement searchTF = driver.findElement(By.id("small-searchterms"));
//		Thread.sleep(5000);
//		searchTF.sendKeys("mobiles",Keys.ENTER);
//		searchTF.sendKeys("selenium");
		WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(5000);
		wp.getSearchTF().sendKeys("mobiles",Keys.ENTER);
		wp.getSearchTF().sendKeys("selenium");
	}

}
