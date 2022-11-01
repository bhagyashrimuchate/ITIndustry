package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class ExchangePage extends TestBaseClass
{
	public ExchangePage()
	{
		PageFactory.initElements(driver,this); //in TestBaseClass we r declaring globaly driver so extends this class
	}
	   //when Null value come in driver bcz 2webdriver
 // ---------Obj Repository---
	
	private By buy_btn1 = By.xpath("//a[contains(text(),'Buy')]");
	private By qnty_txtBox = By.xpath("//input[@type='number'][1]");
	private By buy_btn2 = By.xpath("//button[contains(text(),'Buy')]");
	private By status =By.xpath("//div[text()='Order Created successfully']");
	
 //--------Action Rep-------
	public void clickOnBuyButton1()
	{
		driver.findElement(buy_btn1).click();
	}
	public void enterQnty(String count) ///sendkeys always accept string value not accept int value then use conversion
	{  
		//String countx = Integer.toString(count);
		WebElement quntity = driver.findElement(qnty_txtBox);
		quntity.click();
		quntity.sendKeys(count);
	    //dont pass hardcoded value
	}
	public void clickOnBuyButton2()
	{
		driver.findElement(buy_btn2).click();
	}
	public String statusmessage()
	{
		String msg = driver.findElement(status).getText();
	    return msg;
	   
	}
}  
