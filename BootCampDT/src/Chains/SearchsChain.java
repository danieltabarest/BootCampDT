package Chains;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;

import Pages.YouTubeHomePage;
import Pages.YouTubeResultsPage;

public class SearchsChain {
	
	public YouTubeHomePage  youtubeHomePage;
	public YouTubeResultsPage  youtubeResultsPage;


	public SearchsChain(WebDriver driver)
	{
	  youtubeHomePage = new YouTubeHomePage(driver);
  	  youtubeResultsPage = new YouTubeResultsPage(driver);
	}
	
	
	public void SearchsandSelectVideo(String NameofArtist,String NameOfVideo)
	{
	  youtubeHomePage.searchBox.sendKeys(NameofArtist);
	  youtubeHomePage.searchButton.click();
	}
	
	public void SearchsVideo(String NameofArtist,String NameOfVideo)
	{
	  youtubeHomePage.searchBox.sendKeys(NameOfVideo);
	  youtubeHomePage.searchButton.click();
	}

}
