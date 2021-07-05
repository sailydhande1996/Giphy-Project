package GiphyObject;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverObject {
	
	public WebDriver driver;
	public WebDriver test() throws IOException
	{
	
	//method for chrome driver
		System.setProperty("webdriver.chrome.driver", "/Users/sailydhande/Downloads/chromedriver");

		return driver= new ChromeDriver();
	}
}

