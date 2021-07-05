package GiphyObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gif_Creation_Test {

	
	WebDriver driver;
	public Gif_Creation_Test(WebDriver driver)
	{
		this.driver= driver;
	}
	
	//Objects used for creating the gif test
	By createbt=By.linkText("Create");
	By choosefile= By.xpath("//*[@id=\"react-target\"]/div[5]/div/div[2]/div[2]/div/div[1]/div/input");
	By textfield= By.xpath("//div/div[2]/div[1]/textarea");
	By selectcolour=By.xpath("//div[@class='_3wJhrhZlUYVk02aANMWnQj']/div/span");
	By animation= By.xpath("//div[@class='_3sXRFyZmARU5A-VR0iHwzn']/span");
	By sticker= By.xpath("//div[@class='_21i9prOBBMLnjP6qhMXo6m']");
	By search_sticker= By.xpath("//form/input");
	By search_sticker_bt= By.xpath("//button/i");
	By categoriesbt= By.xpath("//span[@class='j_GHPWcttXGAL3xKShxmE']");
	By categories= By.xpath("//div[@class='_1vuiGyU2HwCEqAAxiWKMcM']/div");
	By filters= By.xpath("//div[@class='_1cn6yGEM-5RNv1bgX4ei2e']/div");
	By clicktoupload= By.xpath("//div[@class='_1ZfAEkg3ERElPbwbqmAmTB']/div[2]");
	By style= By.xpath("//div[@class='_3sXRFyZmARU5A-VR0iHwzn']/span");
	By url= By.xpath("//input[@class='_2jgbCS5BbGLm53p_F-YsmU']");
	By tag= By.xpath("//div/input[@type='text']");
	By add= By.xpath("//span[contains(@class,'Tappable')]");
	By drawcolour= By.xpath("//div[@class='_1FACwheACX_PxiLww2eSSU']/span");
	By upload_to_gifbt= By.xpath("//div[@class='_1dh744zH6zWyao_XxTBJ7B']/div[2]");
	public WebElement Create_Gif() //
	{
		return driver.findElement(createbt);
	}
	
	
	public WebElement Upload_To_Gif()
	{
		return driver.findElement(upload_to_gifbt);
	}
	
	
	public List<WebElement> Draw_Colours()
	{
		return driver.findElements(drawcolour);
	}
	
	
	public WebElement ClickToUpload()
	{
		return driver.findElement(clicktoupload);
	}
	
	public List<WebElement> Style()
	{
		return driver.findElements(style);
	}
	
	public WebElement Choose_GifFile()
	{
		return driver.findElement(choosefile);
	}
	public WebElement Search_Sticker()
	{
	return driver.findElement(search_sticker);
	}
	
	public WebElement Search_Sticker_Button()
	{
	return driver.findElement(search_sticker_bt);
	}
	
	public WebElement Categories_Button()
	{
	return driver.findElement(categoriesbt);
	}
	
	public WebElement TextAarea()
	{
	return driver.findElement(textfield);
	}
	
	public List<WebElement> Colours()
	{
	return driver.findElements(selectcolour);
	}
	
	
	public List<WebElement> Animations()
	{
	return driver.findElements(animation);
	}
	
	public List<WebElement> Stickers()
	{
	return driver.findElements(sticker);
	}
	
	
	public List<WebElement> Categories()
	{
	return driver.findElements(categories);
	}
	
	public List<WebElement> Filters()
	{
	return driver.findElements(filters);
	}
	
	public WebElement Source_URL()
	{
		return driver.findElement(createbt);
	}
	
	public WebElement Tag()
	{
		return driver.findElement(tag);
	}
	
	public WebElement Add()
	{
		return driver.findElement(add);
	}
	
}
