package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;


public class TasactionPage extends TestBaseClass
{
	public TasactionPage()
	   {   	
         PageFactory.initElements(driver, this);
	   }
	
	public String getTransactionData()
	{
		String data =driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
	    return data;
	    
	    
	}
	
}


