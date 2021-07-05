package Giphy_UI_Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import GiphyObject.DriverObject;
import GiphyObject.LoginTestObjects;
import GiphyObject.UploadObject;

public class Upload extends DriverObject {

	
	@Test
	public void Upload_gif() throws IOException
	{
		driver= test();     //select the object to use browser
		driver.get("https://giphy.com/");    //navigate to the url
		driver.manage().window().maximize();   //the window will maximize
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginTestObjects lto= new LoginTestObjects(driver);   //the object is created for LoginTestObjects
		UploadObject uo= new UploadObject(driver);    //the object is created for UploadObject
        lto.PageLoginBt().click();    //click on page login button
		lto.Email().sendKeys("saily.dhande96@gmail.com");    //enter the email id
		lto.Password().sendKeys("S@ily1996");   //enter the password
		lto.LoginButton().click();   //click on login button
		uo.Upload_Button().click();    //click on upload button
        uo.Choose_GifFile().sendKeys("/Users/sailydhande/Downloads/chicken.gif");    //click on choose file
    
        uo.Add_Info().get(0).sendKeys("chickens");   //enter the value in first information field
        uo.Add_Info().get(1).sendKeys("add chickens gif"); //enter the value in second information field
        uo.Upload_Gif().click();   //click on upload button
        
        
        
        
	
		
	
	}
}
