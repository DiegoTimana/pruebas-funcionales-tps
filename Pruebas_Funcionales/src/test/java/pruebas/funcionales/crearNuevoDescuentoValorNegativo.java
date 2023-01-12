package pruebas.funcionales;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class crearNuevoDescuentoValorNegativo {
	
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
		
		driver.findElement(By.linkText("Discount codes")).click();
		
		driver.findElement(By.linkText("New Discount")).click();
		
		driver.findElement(By.id("discountCode")).sendKeys("CODIGO202301");
		
		Select dropDownMenu = new Select(driver.findElement(By.id("discountType")));
		
		dropDownMenu.selectByVisibleText("Amount");
		
		driver.findElement(By.id("discountValue")).sendKeys("-1");
		
		WebElement dateBox1 = driver.findElement(By.id("discountStart"));
		dateBox1.sendKeys("23/01/2023 13:50");
		driver.findElement(By.cssSelector("body > div:nth-child(19) > div > div.modal-footer > button:nth-child(2)")).click();
		
		WebElement dateBox2 = driver.findElement(By.id("discountEnd"));
		dateBox2.sendKeys("15/02/2023 14:00");
		driver.findElement(By.cssSelector("body > div:nth-child(20) > div > div.modal-footer > button:nth-child(2)")).click();
		
		driver.findElement(By.cssSelector("#discountNewForm > div:nth-child(1) > div > div > button")).click();
		
		Thread.sleep(2000);
		
		String alertMessage = driver.findElement(By.id("notify_message")).getText();
		
		boolean successfullMessage = alertMessage.equals("Discount code created successfully");
		
		Assert.assertEquals(successfullMessage, false);
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
