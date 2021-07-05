package Giphy_UI_Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import GiphyObject.DriverObject;
import GiphyObject.LoginTestObjects;

public class Login_Test extends DriverObject {
	
	@Test
	public void Login() throws Exception
	{
	
		driver =test();     //select the object to use browser
		driver.get("https://giphy.com/");    //navigate to the url
		driver.manage().window().maximize();    //the window will maximize
		LoginTestObjects lt = new LoginTestObjects(driver);    //the object is created for LoginTestObjects  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //implicit wait is used
		lt.PageLoginBt().click();    //click on the login button
		lt.Email().sendKeys("saily.dhande96@gmail.com");      //enter the email id
		lt.Password().sendKeys("S@ily1996");  //enter the password
		lt.LoginButton().click();    //click on login button
		Assert.assertEquals(lt.Username().getText(), "sailydhande");     //check if the user is logged in or not
	}

}
