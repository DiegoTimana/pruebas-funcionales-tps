package com.pruebasfuncionalestps;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescripcionProducto {
	
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://expresscart-testing-xgxnh.ondigitalocean.app/admin/product/new");
	}
	
	//PRUEBAS PAGINA DE REGISTRO DE NUEVOS PRODUCTOS, CAMPO: DESCRIPCION DEL PRODUCTO
	
	//CASO DE PRUEBA 1: CLASE VALIDA "Camiseta para niño, con estampado de los power rangers talla 34"
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
		titulo.sendKeys("Camiseta power rangers");
		WebElement precio = driver.findElement(By.id("productPrice"));
		precio.sendKeys("99.99");
		WebElement descripcion = driver.findElement(By.cssSelector(".note-editable"));
		descripcion.sendKeys("Camiseta para niño, con estampado de los power rangers talla 34");
		//guardar
		WebElement save = driver.findElement(By.id("frm_edit_product_save"));
		save.click();
		//assert
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.id("notify_message"));
		assertEquals("New product successfully created", result.getText());
	}
	
	
	//CASO DE PRUEBA 2: CLASE INVALIDA "Camiseta"
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
		//pag new produt 
		WebElement titulo = driver.findElement(By.id("productTitle"));
		titulo.sendKeys("Camiseta Soda Stereo");
		WebElement precio = driver.findElement(By.id("productPrice"));
		precio.sendKeys("99.99");
		WebElement descripcion = driver.findElement(By.cssSelector(".note-editable"));
		descripcion.sendKeys("Camiseta");
		//guardar
		WebElement save = driver.findElement(By.id("frm_edit_product_save"));
		save.click();
		Thread.sleep(3000); //se espera para hacer otro click porque el boton de guardar se desactiva por razones desconocidas por un momento
		save.click();
		//assert
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/h5"));
		assertEquals("Error", result.getText());
	}
	
	//CASO DE PRUEBA 3: CLASE INVALIDA "" (vacio)
	@Test
	public void caso3() throws InterruptedException{
		
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
		titulo.sendKeys("Camiseta Vans");
		WebElement precio = driver.findElement(By.id("productPrice"));
		precio.sendKeys("99.99");
		WebElement descripcion = driver.findElement(By.cssSelector(".note-editable"));
		descripcion.sendKeys("");
		//guardar
		WebElement save = driver.findElement(By.id("frm_edit_product_save"));
		save.click();
		Thread.sleep(4000); 
		save.click();
		//assert
		Thread.sleep(3000);
		WebElement result = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/h5"));
		assertEquals("Error", result.getText());
	}

	@After
	public void tearDown() {
		//driver.quit();
	}


}
