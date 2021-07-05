package Giphy_UI_Test;



import java.util.concurrent.TimeUnit;


import org.testng.Assert;
import org.testng.annotations.Test;

import GiphyObject.DriverObject;
import GiphyObject.LoginTestObjects;

public class Negative_Login_Test extends DriverObject{
	
	@Test
	public void Login() throws Exception
	{
	
		driver =test();    //select the object to use browser
		driver.get("https://giphy.com/");   //navigate to the url
		driver.manage().window().maximize();  //the window will maximize
		LoginTestObjects lt = new LoginTestObjects(driver);   //the object is created for LoginTestObjects
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    //implicit wait is used here
		lt.PageLoginBt().click();    //click on page login button    
		lt.Email().sendKeys("saily.dhande96@gmail.com");    //enter email id
		lt.Password().sendKeys("S@ily19");    //enter the password
		lt.LoginButton().click();      //click on login button
		
		//check if the error message matches and user is not logged in
		Assert.assertNotEquals(lt.Error().getText(), "{'level': 'error', 'message': 'Your email address was not recognized or your password was incorrect.'}");
	}


}
