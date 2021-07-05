package Giphy_UI_Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GiphyObject.DriverObject;
import GiphyObject.Gif_Creation_Test;
import GiphyObject.LoginTestObjects;

public class Gif_Creation extends DriverObject 
{
	
	@Test
  public void CreateGif() throws IOException, InterruptedException
  {
	    driver =test();     //method to use the chrome driver
		driver.get("https://giphy.com/");    //navigate to the url
		driver.manage().window().maximize();   //the window will be maximized
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //implicit wait is used here
		LoginTestObjects lto= new LoginTestObjects(driver);       // an object for the LoginTestObject is created
		lto.PageLoginBt().click();           //click on the login button
		lto.Email().sendKeys("saily.dhande96@gmail.com");      //enter the email id
		lto.Password().sendKeys("S@ily1996");// enter the password
		lto.LoginButton().click();     //click on the login //button
		Gif_Creation_Test gct= new Gif_Creation_Test(driver);   //an object for the Gif_Creation_Test is created
		gct.Create_Gif().click();      //click on the create button
		gct.Choose_GifFile().sendKeys("/Users/sailydhande/Downloads/chicken.gif");    //click on choose file 
        gct.TextAarea().sendKeys("chickens");    //set the caption for the gif
		gct.Colours().get(3).click();    //select the colour
		gct.Style().get(6).click();	    //select the style
		gct.Animations().get(2).click();     //select the animation
		
		
        
		
		driver.findElement(By.xpath("//div/span[2]")).click();       //navigate to next tab stickers
    	gct.Search_Sticker().sendKeys("chickens gifs");       //search the sticker
    	gct.Search_Sticker_Button().click();// click on search button
    	gct.Categories_Button().click();    // select the category
    	gct.Categories().get(6).click();      // select the category
        gct.Stickers().get(2).click();    // select the sticker
        
        driver.findElement(By.xpath("//div/span[3]")).click();     //navigate to filters tab
    	gct.Filters().get(9).click();   //select the filter
    	
    	driver.findElement(By.xpath("//div/span[4]")).click();   //navigate to draw tab
    	
    	gct.Draw_Colours().get(3).click();   //select the colour
    	
    	
    	//create webelement for a upload button
    	WebElement element= driver.findElement(By.xpath("//*[@id=\"react-target\"]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/div/div/canvas"));
    	
    	// Actions is used to move the element to draw on the canvas
    	Actions builder = new Actions(driver);
    	builder.moveToElement(element).perform();
        builder.clickAndHold(element).perform();
        builder.moveByOffset(150, 50).perform();
        builder.moveToElement(element).perform();
        builder.clickAndHold(element).perform();
        builder.moveByOffset(100, 50).perform();
        
        
        //click on button 
        driver.findElement(By.xpath("//*[@id=\"react-target\"]/div[5]/div[2]/div[2]/div[3]/div[2]/div"));
        
        //fill the url and tag and click on add button
        gct.Source_URL().sendKeys("chicken");
        gct.Tag().sendKeys("chicken");
        gct.Add().click();
        
        //select off and click on upload
        driver.findElement(By.linkText("Off")).click();
        gct.Upload_To_Gif().click();
        
         	
        	
        }
		
		
		
		
		 
  }
	
	

