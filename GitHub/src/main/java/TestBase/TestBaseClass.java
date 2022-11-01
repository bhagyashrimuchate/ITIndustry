package TestBase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

import PageLayer.DashBoardPage;
import PageLayer.LogInPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBaseClass 
{  //declare as a all class n show every where so we add public static

	public static WebDriver driver;
	//DashBoardPage dash = new DashBoardPage();
    public static DashBoardPage dash ;
    public static Logger logger;
    
    @BeforeClass()
    public void start()
    {
    	Logger logger = Logger.getLogger("Dalal StreeDt framework");    
    	PropertyConfigurator.configure("log4j.properties");
    
    	logger.info("framework excecution started");
    }
    @AfterClass()
    public void stop()
    {
    	logger.info("framework finished");
    }
    
    @Parameters("browser")
    
    @BeforeMethod
    public void setUp(String S) 
    {  
    	
       //String S = "chrome"; ///just replace this bracket name to execute this
                            //we have to execute that statement the give the condition for some silly mistake upper n lower case
       if(S.equalsIgnoreCase("chrome"))
       {
    	   WebDriverManager.chromedriver().setup();
    	   driver = new ChromeDriver();
       }
       else if(S.equalsIgnoreCase("Edge"))
       {
           WebDriverManager.edgedriver().setup();
           driver = new EdgeDriver(); 
       }
      
       else 
       {
    	   System.out.println("enter correct url");
       }
       logger.info("Browser launch");
       
      // System.setProperty("webdriver.chrome.driver", "G:\\Chrome Driver\\chromedriver.exe");
      
       //by using this we dont have add repeatedly add new version
       driver.get("https://www.apps.dalalstreet.ai/login");//hard coded data"" direct data - fixed data
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
     //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       logger.info("Open URL, Maximize window");
       
     //-------- Login steps are same then write here------
       LogInPage Login = new LogInPage();
	   Login.enterMailAddress();
	   Login.enterPassword();
	   Login.LogIn();
	   
	   //obj creation
	    dash = new DashBoardPage();
    }
  
       
    @AfterMethod
      public void setDown()
      {
   	     driver.quit(); //for using in this driver 1stly we hav to declare driver as a global
         logger.info("browser closed"); 
      }

}