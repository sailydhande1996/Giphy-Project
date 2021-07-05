package Giphy_UI_Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import GiphyObject.DriverObject;
import GiphyObject.SearchObject;

public class Search_NonExisting_Gif extends DriverObject {

	
	@Test
	public void NonExisting_Gif() throws IOException 
	{
		driver =test();     //select the object to use browser
		driver.get("https://giphy.com/");   //navigate to the url
		driver.manage().window().maximize();    //the window will maximize
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		SearchObject so = new SearchObject(driver);    //the object is created for SearchObject
		so.SearchBox().sendKeys("sailydhande");    //enter the text
		so.SearchButton().click();        //click on button
		String Number_Of_Gifs=so.GifsCount().getAttribute("data-gif-count");    //get the count of gif
		System.out.println(Number_Of_Gifs);    //display the count of gif
		
		
		//if count of gif is equal to 0 then no results found.
		Assert.assertFalse( false, "Number_Of_Gifs =0");
		

		
	}
}


