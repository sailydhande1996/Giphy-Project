package GiphyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTestObjects {
	
	WebDriver driver;
	public LoginTestObjects(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By email= By.name("email");
	By password= By.name("password");
	By pagelogbt= By.xpath("//div/div[3]/a/div[2]");
	By account_login_bt= By.xpath("//div/button[1]");
	By username= By.xpath("//h1/span");
	By errormsg= By.xpath("//div[@id='messages']/div");
	public WebElement Email()
	{ 
		 return driver.findElement(email);
	}
	
	public WebElement Password()
	{ 
		 return driver.findElement(password);
	}
	
	public WebElement PageLoginBt()
	{ 
		 return driver.findElement(pagelogbt);
	}
	
	public WebElement LoginButton()
	{ 
		 return driver.findElement(account_login_bt);
	}
	
	public WebElement Username()
	{ 
		 return driver.findElement(username);
	}
	
	public WebElement Error()
	{ 
		 return driver.findElement(errormsg);
	}
	

	
	
}
