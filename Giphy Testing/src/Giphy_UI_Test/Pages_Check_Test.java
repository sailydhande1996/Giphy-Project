package Giphy_UI_Test;


import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;

import GiphyObject.DriverObject;
import GiphyObject.PagesCheckObject;

public class Pages_Check_Test extends DriverObject
{
	
	@Test
	public void PagesCheck() throws Exception
	{
		
	driver =test();   //select the object to use browser
	driver.get("https://giphy.com/");    //navigate to the url
	driver.manage().window().maximize();    //the window will maximize
	
	String[] pagetext=  {"Reaction GIFs","Entertainment GIFs","Sports GIFs","Stickers"};
	PagesCheckObject pc = new PagesCheckObject(driver);    //the object is created for PagesCheckObject
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    //use implicit wait
	for(int i=0;i<4;i++)    //for loop is used to click on every tab
	{
		pc.Pages().get(i).click();
		String a= pc.PageTitle().getText();
		if(pagetext[i].contains(a))
		{
			continue;
		}
		System.out.println(a);   //display the page title
	}
}
}
