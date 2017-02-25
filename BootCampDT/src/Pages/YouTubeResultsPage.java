package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouTubeResultsPage {
	
	public WebDriver driver;
	
	public YouTubeResultsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	//Ejemplo de page object model
	@FindBy(xpath=".//*[@id='item-section-099492']/li[2]/div/div/div[2]/h3")
	public WebElement videoTwo;
	
	public boolean isVideoTwoDisplayed()
	{
		return videoTwo.isDisplayed();
	}
}
