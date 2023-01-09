package com.pruebasfuncionalestps;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrecioProducto {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://expresscart-testing-xgxnh.ondigitalocean.app/admin/product/new");
	}
	
	//PRUEBAS PAGINA DE REGISTRO DE NUEVOS PRODUCTOS, CAMPO: PRECIO DEL PRODUCTO

	//CASO DE PRUEBA 1: CLASE VALIDA "99.99"
	@Test
	public void caso1() throws InterruptedException{
		
		WebElement correo = driver.findElement(By.id("email"));
		correo.sendKeys("michelleghblue@gmail.com");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("expresscart");
		WebElement loginbtn = driver.findElement(By.id("loginForm"));
		loginbtn.click();
		
		Thread.sleep(3000);
		//logueado
		WebElement agregarbtn = driver.findElement(By.cssSelector(".nav-item:nth-child(4) > .sidebar-link-addon"));
		agregarbtn.click();
		//pag new produt 
		WebElement titulo = driver.findElement(By.id("productTitle"));
		titulo.sendKeys("Camiseta");
		WebElement precio = driver.findElement(By.id("productPrice"));
		precio.sendKeys("99.99");
		WebElement descripcion = driver.findElement(By.cssSelector(".note-editable"));
		descripcion.sendKeys("Camiseta color amarillo para niño");
		//guardar
		WebElement save = driver.findElement(By.id("frm_edit_product_save"));
		save.click();
		//assert
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.id("notify_message"));
		assertEquals("New product successfully created", result.getText());
	}
	
	//CASO DE PRUEBA 2: CLASE INVALIDA "" (VACIO)
	@Test
	public void caso2() throws InterruptedException{
		
		WebElement correo = driver.findElement(By.id("email"));
		correo.sendKeys("michelleghblue@gmail.com");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("expresscart");
		WebElement loginbtn = driver.findElement(By.id("loginForm"));
		loginbtn.click();
		
		Thread.sleep(3000);
		//logueado
		WebElement agregarbtn = driver.findElement(By.cssSelector(".nav-item:nth-child(4) > .sidebar-link-addon"));
		agregarbtn.click();
		//pag new produt////////////////////////////////////////////////////////
		WebElement titulo = driver.findElement(By.id("productTitle"));
		titulo.sendKeys("Camiseta");
		WebElement precio = driver.findElement(By.id("productPrice"));
		precio.sendKeys("");
		WebElement descripcion = driver.findElement(By.cssSelector(".note-editable"));
		descripcion.sendKeys("Camiseta color amarillo para niño");
		//guardar
		WebElement save = driver.findElement(By.id("frm_edit_product_save"));
		save.click();
		//assert
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[1]/div/h2"));
		assertEquals("New product", result.getText());
	}

	
	  //CASO DE PRUEBA 3: CLASE INVALIDA "Cincuenta"
	  
	  @Test public void caso3() throws InterruptedException{
	  
	  WebElement correo = driver.findElement(By.id("email"));
	  correo.sendKeys("michelleghblue@gmail.com"); WebElement pass = driver.findElement(By.id("password")); 
	  pass.sendKeys("expresscart");
	  WebElement loginbtn = driver.findElement(By.id("loginForm"));
	  loginbtn.click();
	  
	  Thread.sleep(3000); //logueado 
	  WebElement agregarbtn = driver.findElement(By.cssSelector(".nav-item:nth-child(4) > .sidebar-link-addon"));
	  agregarbtn.click(); 
	  //pag new produt 
	  WebElement titulo = driver.findElement(By.id("productTitle")); 
	  titulo.sendKeys("Camiseta");
	  WebElement precio = driver.findElement(By.id("productPrice"));
	  precio.sendKeys("Cincuenta"); 
	  WebElement descripcion =driver.findElement(By.cssSelector(".note-editable"));
	  descripcion.sendKeys("Camiseta color amarillo para niño"); 
	  //guardar
	  WebElement save = driver.findElement(By.id("frm_edit_product_save"));
	  save.click(); 
	  //assert 
	  Thread.sleep(3000); 
	  WebElement result = driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[1]/div/h2"));
	  assertEquals("New product", result.getText());
    }
	
	  //CASO DE PRUEBA 4: CLASE INVALIDA "100"
	  
	  @Test public void caso4() throws InterruptedException{
	  
	  WebElement correo = driver.findElement(By.id("email"));
	  correo.sendKeys("michelleghblue@gmail.com"); WebElement pass = driver.findElement(By.id("password")); 
	  pass.sendKeys("expresscart");
	  WebElement loginbtn = driver.findElement(By.id("loginForm"));
	  loginbtn.click();
	  
	  Thread.sleep(3000); //logueado 
	  WebElement agregarbtn = driver.findElement(By.cssSelector(".nav-item:nth-child(4) > .sidebar-link-addon"));
	  agregarbtn.click(); 
	  //pag new produt 
	  WebElement titulo = driver.findElement(By.id("productTitle")); 
	  titulo.sendKeys("Camiseta");
	  WebElement precio = driver.findElement(By.id("productPrice"));
	  precio.sendKeys("100"); 
	  WebElement descripcion =driver.findElement(By.cssSelector(".note-editable"));
	  descripcion.sendKeys("Camiseta color amarillo para niño"); 
	  //guardar
	  WebElement save = driver.findElement(By.id("frm_edit_product_save"));
	  save.click(); 
	  //assert 
	  Thread.sleep(3000); 
	  WebElement result = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/h5"));
	  assertEquals("Error", result.getText());
  }
	
	  //CASO DE PRUEBA 5: CLASE INVALIDA "80.5"
	  
	  @Test public void caso5() throws InterruptedException{
	  
	  WebElement correo = driver.findElement(By.id("email"));
	  correo.sendKeys("michelleghblue@gmail.com"); WebElement pass = driver.findElement(By.id("password")); 
	  pass.sendKeys("expresscart");
	  WebElement loginbtn = driver.findElement(By.id("loginForm"));
	  loginbtn.click();
	  
	  Thread.sleep(3000); //logueado 
	  WebElement agregarbtn = driver.findElement(By.cssSelector(".nav-item:nth-child(4) > .sidebar-link-addon"));
	  agregarbtn.click(); 
	  //pag new produt 
	  WebElement titulo = driver.findElement(By.id("productTitle")); 
	  titulo.sendKeys("Camiseta");
	  WebElement precio = driver.findElement(By.id("productPrice"));
	  precio.sendKeys("80.5"); 
	  WebElement descripcion =driver.findElement(By.cssSelector(".note-editable"));
	  descripcion.sendKeys("Camiseta color amarillo para niño"); 
	  //guardar
	  WebElement save = driver.findElement(By.id("frm_edit_product_save"));
	  save.click(); 
	  //assert 
	  Thread.sleep(3000); 
	  WebElement result = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/h5"));
	  assertEquals("Error", result.getText());
}
	  
	  //CASO DE PRUEBA 6: CLASE INVALIDA "69.312" 
	  @Test public void caso6() throws InterruptedException{
	  
	  WebElement correo = driver.findElement(By.id("email"));
	  correo.sendKeys("michelleghblue@gmail.com"); WebElement pass = driver.findElement(By.id("password")); 
	  pass.sendKeys("expresscart");
	  WebElement loginbtn = driver.findElement(By.id("loginForm"));
	  loginbtn.click();
	  
	  Thread.sleep(3000); //logueado 
	  WebElement agregarbtn = driver.findElement(By.cssSelector(".nav-item:nth-child(4) > .sidebar-link-addon"));
	  agregarbtn.click(); 
	  //pag new produt 
	  WebElement titulo = driver.findElement(By.id("productTitle")); 
	  titulo.sendKeys("Camiseta");
	  WebElement precio = driver.findElement(By.id("productPrice"));
	  precio.sendKeys("69.312"); 
	  WebElement descripcion =driver.findElement(By.cssSelector(".note-editable"));
	  descripcion.sendKeys("Camiseta color amarillo para niño"); 
	  //guardar
	  WebElement save = driver.findElement(By.id("frm_edit_product_save"));
	  save.click(); 
	  //assert 
	  Thread.sleep(3000); 
	  WebElement result = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/h5"));
	  assertEquals("Error", result.getText());
  }
	  
	  //CASO DE PRUEBA 7: CLASE INVALIDA "-80.00"
	  
	  @Test public void caso7() throws InterruptedException{
	  
	  WebElement correo = driver.findElement(By.id("email"));
	  correo.sendKeys("michelleghblue@gmail.com"); WebElement pass = driver.findElement(By.id("password")); 
	  pass.sendKeys("expresscart");
	  WebElement loginbtn = driver.findElement(By.id("loginForm"));
	  loginbtn.click();
	  
	  Thread.sleep(3000); //logueado 
	  WebElement agregarbtn = driver.findElement(By.cssSelector(".nav-item:nth-child(4) > .sidebar-link-addon"));
	  agregarbtn.click(); 
	  //pag new produt 
	  WebElement titulo = driver.findElement(By.id("productTitle")); 
	  titulo.sendKeys("Camiseta");
	  WebElement precio = driver.findElement(By.id("productPrice"));
	  precio.sendKeys("-80.00"); 
	  WebElement descripcion =driver.findElement(By.cssSelector(".note-editable"));
	  descripcion.sendKeys("Camiseta color amarillo para niño"); 
	  //guardar
	  WebElement save = driver.findElement(By.id("frm_edit_product_save"));
	  save.click(); 
	  //assert 
	  Thread.sleep(3000); 
	  WebElement result = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/h5"));
	  assertEquals("Error", result.getText());
  }

	@After
	public void tearDown() {
		driver.quit();
	}

}
