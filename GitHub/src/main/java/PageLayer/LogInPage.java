package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class LogInPage extends TestBaseClass 
{
	public LogInPage()
   {   //we hav to add webdiver as a public static to add t=here other its ll show error
	   PageFactory.initElements(driver, this);
   }
	
   // object repository
   
   @FindBy(xpath="//input[@name='email']")
   private WebElement email_textBox;
   
   @FindBy (xpath="//input[@name='password']")
   private WebElement passWord_textBox;
   
   @FindBy (xpath="//button[@type='submit']")
   private WebElement logIn_button;
   
   // action Methods
   
   public void enterMailAddress()
   {
	   email_textBox.sendKeys("bmuchate10@gmail.com");
   }
   public void enterPassword()
   {
	   passWord_textBox.sendKeys("bhagyashri123");
   }
   public void LogIn()
   {
	   logIn_button.click();
   }
}
