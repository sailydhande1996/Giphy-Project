package GiphyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchObject{

	
	WebDriver driver;
	public SearchObject(WebDriver driver)
	{
		this.driver= driver;
	}
	By search= By.xpath("//input[@type='text']");
	By searchbt= By.xpath("//a[contains(@class,'SearchButtonContainer')]");
	By nogifmsg = By.xpath("//*[@id=\"react-target\"]/div/div[5]/div[2]/div/span[1]");
	By gifcount= By.xpath("//h1/span");
	
	public WebElement SearchBox()
	{
		return driver.findElement(search);
	}
	
	public WebElement SearchButton()
	{
		return driver.findElement(searchbt);
	}
	public WebElement NoGifMsg()
	{
	return driver.findElement(nogifmsg);
	
	}
	
	public WebElement GifsCount()
	{
	return driver.findElement(gifcount);
	
	
}
}
