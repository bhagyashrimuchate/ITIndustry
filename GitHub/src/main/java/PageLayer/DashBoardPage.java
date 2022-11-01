package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class DashBoardPage extends TestBaseClass //comman login steps
{
  public DashBoardPage ()
  {
	  PageFactory.initElements(driver,this);
  }
  
  //-------Object Repository = declaration, encapsulation----
  //Encapsulation mean use private keyword before variable
  //By store in variable and its data type is by its class is By 
  // dont use any touching point in action repository all are handle in above repository
  //sites are dynamic the attribute will change so we can easily change and recheck so its good way to write in Object Repository
  // in industry We have many approach the use approach depend upon company
 
  private By SearchTextBox = By.xpath("//input[@type='text'][1]"); 
  
  @FindBy(xpath="(//div[@class='m-2 card-title'])[2]")//wipro hide logo
   private WebElement select_ComapnyName;
  
   private By transaction_Link = By.xpath("");
  
   //-----Action Repository=sendkeys click n all----
  public void enterCompanyName(String CompanyName) // string bcz we have to add words 
  {
	  //driver.findElement(By.xpath("//input[@type='text'][1]"));
       driver.findElement(SearchTextBox).sendKeys(CompanyName);
  } 
  public void clickOnCompanyOption()
  {
	  select_ComapnyName.click();
  }
  public void clickOnTransaction()
  {
	  driver.findElement(transaction_Link).click();
  }
  
  /* scenario Fetch the data from trahnsction page & print in console
     1 launch browser
     2 username
     3 enter password
     4 click on login button
     5 clik on transaction page
     6 get data from table
     7 print in console
      */
  
}
