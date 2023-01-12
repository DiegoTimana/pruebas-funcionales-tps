// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class PruebasDescripcionCarritoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void pruebasDescripcionCarrito() {
    // Test name: Pruebas Descripcion Carrito
    // Step # | name | target | value
    // 1 | open | /admin/login | 
    driver.get("https://expresscart-testing-xgxnh.ondigitalocean.app/admin/login");
    // 2 | setWindowSize | 1116x608 | 
    driver.manage().window().setSize(new Dimension(1116, 608));
    // 3 | click | id=email | 
    driver.findElement(By.id("email")).click();
    // 4 | type | id=email | michelleghblue@gmail.com
    driver.findElement(By.id("email")).sendKeys("michelleghblue@gmail.com");
    // 5 | click | id=password | 
    driver.findElement(By.id("password")).click();
    // 6 | type | id=password | expresscart
    driver.findElement(By.id("password")).sendKeys("expresscart");
    // 7 | sendKeys | id=password | ${KEY_ENTER}
    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    // 8 | click | linkText=General settings | 
    driver.findElement(By.linkText("General settings")).click();
    // 9 | click | name=cartDescription | 
    driver.findElement(By.name("cartDescription")).click();
    // 10 | type | name=cartDescription | expressCart
    driver.findElement(By.name("cartDescription")).sendKeys("expressCart");
    // 11 | click | id=btnSettingsUpdate | 
    driver.findElement(By.id("btnSettingsUpdate")).click();
    // 12 | assertText | id=notify_message | Settings successfully updated
    assertThat(driver.findElement(By.id("notify_message")).getText(), is("Settings successfully updated"));
  }
}
