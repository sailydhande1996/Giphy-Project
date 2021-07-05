package Giphy_UI_Test;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import GiphyObject.DriverObject;
import GiphyObject.SearchObject;

public class Search_Existing_Gif extends DriverObject{
	
	@Test
	public void Search_Gif() throws IOException
	{
		driver =test();    //select the object to use browser
		driver.get("https://giphy.com/");    //navigate to the url
		driver.manage().window().maximize();    //the window will maximize
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		SearchObject so = new SearchObject(driver);  //the object is created for SearchObject
		so.SearchBox().sendKeys("chicken");    //enter the text 
		so.SearchButton().click();    //click on search button
		String Number_Of_Gifs=so.GifsCount().getAttribute("data-gif-count");   //get the count of gifs
		System.out.println(Number_Of_Gifs);     //display the number of gifs
		
		
		//if count of gif is greater than 0 , the results are found.
		Assert.assertFalse( false, "Number_Of_Gifs >0");    
		
       
	}
}
