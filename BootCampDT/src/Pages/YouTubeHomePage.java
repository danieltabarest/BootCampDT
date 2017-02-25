package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouTubeHomePage {

	//Ejemplo de page object model
	@FindBy(id="masthead-search-term")
	public WebElement searchBox;
	
	@FindBy(id="search-btn")
	public WebElement searchButton;
	
	public WebDriver driver;
	
	public YouTubeHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchVideo(String videoname)
	{
		searchBox.sendKeys(videoname);
	}
	
	public void clickOnSearch()
	{
		searchButton.click();
	}
	
	
	//-----------------------
	public void searchVideoB(String videoname)
	{
		searchBox.sendKeys(videoname);
		clickOnSearchB();
	}
	
	private void clickOnSearchB()
	{
		searchButton.click();
	}
	
	//----------------------------
	
	public void searchVideoC(String videoname)
	{
		searchBox.sendKeys(videoname);
		searchButton.click();
	}
	
	//----------------------------
	
	public void searchVideoD(String videoname)
	{
		searchBox.sendKeys(videoname);
		searchButton.click();
	}
	
	public boolean isduumieDisplay()
	{
		return true;// searchDummie.i
	}
}
