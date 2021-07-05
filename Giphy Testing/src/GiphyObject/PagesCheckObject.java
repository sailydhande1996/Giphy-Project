package GiphyObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagesCheckObject {
	
	WebDriver driver;
	public PagesCheckObject(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By pagecheck= By.xpath("//*[@id=\"header\"]/div/div[1]/ul/li");
	By pagetitle= By.xpath("//h1/span");
	
	public List<WebElement> Pages()
	{
		return driver.findElements(pagecheck);
	}
	
	public WebElement PageTitle()
	{
		return driver.findElement(pagetitle);
	}


}
