package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import Chains.SearchsChain;
import Pages.YouTubeHomePage;
import Pages.YouTubeResultsPage;

public class LaunchDriver {
	
	public WebDriver driver; 
	private YouTubeHomePage  youtubeHomePage;
	private YouTubeResultsPage  youtubeResultsPage;
	//private SearchsChain  searchChain;
	 
	public LaunchDriver(){
		//Se inicializa la libreria de gecko driver.
		System.setProperty("webdriver.gecko.driver", "C:/Users/Daniel/Google Drive/Estudio/Bootcamp Automatización de pruebas/geckodriver-v0.14.0-win64/geckodriver.exe");
	     driver = new FirefoxDriver();
	     youtubeHomePage = new YouTubeHomePage(driver);
	     youtubeResultsPage = new YouTubeResultsPage(driver);
	}
	
	@Test
	public void launchDriverA() throws InterruptedException{
		
		driver.get("https://www.youtube.com/");
		youtubeHomePage.searchVideo("Rodolfo aicardi");
		youtubeHomePage.clickOnSearch();
		Assert.assertTrue(youtubeResultsPage.isVideoTwoDisplayed());
	}
	
	
	@Test
	public void launchDriverB() throws InterruptedException{
		
		driver.get("https://www.youtube.com/");
		youtubeHomePage.searchVideoB("Rodolfo aicardi");
		
	}
	
	
	@Test
	public void launchDriverC() throws InterruptedException{
		
		driver.get("https://www.youtube.com/");
		youtubeHomePage.searchVideoC("Rodolfo aicardi");
		
	}
	
	@Test
	public void launchDriverD() throws InterruptedException{
		
		driver.get("https://www.youtube.com/");
		youtubeHomePage.searchVideoD("Rodolfo aicardi");
		
	}
	

	
	@Test
	public void launchDriverChain() throws InterruptedException{
		
		driver.get("https://www.youtube.com/");
		//searchChain.youtubeHomePage.searchBox()
		//youtubeHomePage.searchVideoB("Rodolfo aicardi");
		
	}
	

}
