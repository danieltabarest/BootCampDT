package Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestYoutube {

	
	public WebDriver driver;
	public WebElement searchtitle;
	public WebElement boxemail;
	public WebElement boxpass;
	public WebElement searchButton;
	public WebElement selectedvideo;
	public WebElement buttonlike;
	public WebElement buttonnext;
	public WebElement buttonlogin;	
	public WebElement buttonaddaccount;	
	public List<WebElement> videos;
	 
	public TestYoutube(){
		//Se inicializa la libreria de gecko driver.
		System.setProperty("webdriver.gecko.driver", "C:/Users/Daniel/Google Drive/Estudio/Bootcamp Automatización de pruebas/geckodriver-v0.14.0-win64/geckodriver.exe");
	     driver = new FirefoxDriver();
	}
	
	@Test
	public void testYoutube() throws InterruptedException{
		
		//Abrir la página
		driver.get("https://www.youtube.com/");
		
		//buscar el botón acceder
		buttonlogin =  driver.findElement(By.xpath(".//*[@id='yt-masthead-signin']/div/button"));
		buttonlogin.click();
		
		//Esperar a que muestre los resultados
		Thread.sleep(3000);
		
		//login 
		//buttonaddaccount= driver.findElement(By.xpath(".//*[@id='account-chooser-add-account']"));
		//buttonaddaccount.click();
		
		//Esperar a que muestre los resultados
		//Thread.sleep(5000);
		
		boxemail = driver.findElement(By.xpath(".//*[@id='Email']"));
		boxemail.clear();
		boxemail.sendKeys("testpro25@gmail.com");
		
		buttonnext = driver.findElement(By.xpath(".//*[@id='next']"));
		buttonnext.click();
		//Esperar a que muestre los resultados
		Thread.sleep(5000);
		
		//agregamos la contraseña
		boxpass = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		boxpass.clear();
		boxpass.sendKeys("testpro25*");
		
		//presionamos el botón accerder
		buttonlogin = driver.findElement(By.xpath(".//*[@id='signIn']"));
		buttonlogin.click();		
		
		//Esperar a que muestre los resultados
		Thread.sleep(5000);
		
		//Buscar la canción
		searchtitle = driver.findElement(By.id("masthead-search-term"));
		searchtitle.sendKeys("Arduino");
		
		//Presinar el bottón buscar
		searchButton = driver.findElement(By.id("search-btn"));
		searchButton.click();
		
		//Esperar a que muestre los resultados
		Thread.sleep(3000);
		
		//Buscar todos los item de la lista.
		videos = driver.findElements(By.xpath(".//*[@id='results']/ol/li[2]/ol/li/div/div/div/h3"));

		//Esperar que se cargue lainformaión		
		Thread.sleep(3000);
		
		//Seleccionar el video
		selectedvideo = videos.get(3);
		selectedvideo.click();
		
		//Esperar que se cargue lainformaión		
		Thread.sleep(8000);
		//se tiene que hacer scroll para que pueda dar click por que no se encuentra en la pantalla
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");
		
		//buscar el botón like
		buttonlike =  driver.findElement(By.xpath(".//*[@id='watch8-sentiment-actions']/span/span[1]/button"));
		buttonlike.click();
			
		
	}

	
}
