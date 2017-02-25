package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchDriverOld {
	
	public WebDriver driver;
	public WebElement searchbox;
	public WebElement searchbox2;
	public WebElement searchButton;
	public WebElement video;
	public List<WebElement> videos;
	 
	public LaunchDriverOld(){
		//Se inicializa la libreria de gecko driver.
		System.setProperty("webdriver.gecko.driver", "C:/Users/Daniel/Google Drive/Estudio/Bootcamp Automatización de pruebas/geckodriver-v0.14.0-win64/geckodriver.exe");
	     driver = new FirefoxDriver();
	}
	
	@Test
	public void launchDriver() throws InterruptedException{
		//System.out.println("Caso 1");
		driver.get("https://www.youtube.com/");
		searchbox = driver.findElement(By.id("masthead-search-term"));
		searchbox.sendKeys("Rodolfo aicardi");
		
		searchButton = driver.findElement(By.id("search-btn"));
		searchButton.click();
		
		Thread.sleep(3000);
		//wait(3000);
		video = driver.findElement(By.xpath(".//*[@id='item-section-099492']/li[2]/div/div/div[2]/h3"));
		video.click();
		
		videos = driver.findElements(By.xpath(".//*[@id='item-section-099492']/li[2]/div/div/div[2]/h3"));
		//String name = videos.get(2).getText();
		
		//searchbox = driver.findElement(By.xpath(".//*[@id='masthead-search-term']"));
		//searchbox.clear();
		
		//searchbox2 = driver.findElement(By.xpath(".//*[@id='masthead-search-term']"));
		//searchbox2.clear();
				
		//Crear login de gmail o youtube, abrir un video y darle un like al vidio		
	}

}
