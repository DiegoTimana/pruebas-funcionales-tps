package pruebas.funcionales;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class crearUsuarioCampoPasswordVacio {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://expresscart-testing-xgxnh.ondigitalocean.app/admin/login");
	}
	
	@Test
	public void testGooglePage() throws InterruptedException {
		
		WebElement emailAddress = driver.findElement(By.name("email"));
		emailAddress.sendKeys("michelleghblue@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("expresscart");
		
		driver.findElement(By.id("loginForm")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Users")).click();
		
		driver.findElement(By.linkText("New user")).click();
		
		driver.findElement(By.id("usersName")).sendKeys("ricardo_2688");
		
		driver.findElement(By.id("userEmail")).sendKeys("ricardo26@gmail.com");
		
		driver.findElement(By.cssSelector("#userNewForm > .form-group:nth-child(4) > .form-control")).sendKeys("@aB1234=12a");
		
		driver.findElement(By.id("btnUserAdd")).click();
		
		Thread.sleep(2000);
		
		boolean alertMessagePresent = driver.findElement(By.id("notify_message")).isDisplayed();
		
		Assert.assertEquals(alertMessagePresent, false);
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
