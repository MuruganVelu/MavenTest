package MavenTest.MavenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MavenJenkinTest {
	@Test
	public void keyBoardAction() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "G:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		System.out.println("URL Launched");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("apple").build().perform();
		System.out.println("Test");
		
	
	}

}
