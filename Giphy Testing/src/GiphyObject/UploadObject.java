package GiphyObject;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadObject {

	
	WebDriver driver;
	public UploadObject(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By uploadbt= By.xpath("//a[@class='_2bR0VNOr0505p4eSudMi0k']");
	By file= By.xpath("//*[@id=\"react-target\"]/div[5]/div/div[2]/div[2]/div/div[1]/div/input");
	By text= By.xpath("//p[contains(@class,'Text-sc')]");
	By privatebt = By.xpath("//*[@id=\"//*[@id=\"react-target\"]/div[5]/div/div[2]/div[1]/div[2]/div[1]/div[2]");
	By addinfo= By.xpath("//div/input[@type='text']");
	By uploadGIF= By.xpath("//div[contains(@class,'iJYefv')]");
	
	public WebElement Upload_Button()
	{
		return driver.findElement(uploadbt);
	}
	
	public WebElement Upload_Gif()
	{
		return driver.findElement(uploadGIF);
	}
	
	public List<WebElement> Add_Info()
	{
		return driver.findElements(addinfo);
	}
	
	
	public WebElement Visibility_Private()
	{
		return driver.findElement(privatebt);
	}
	
	public WebElement Choose_GifFile()
	{
		return driver.findElement(file);
	}
	public List<WebElement> ChooseText()
	{
		return driver.findElements(text);
	}
	
	
}
