package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseClass;

public class Utilclass extends TestBaseClass
{
  //comman class
   public Utilclass()
   {
	   PageFactory.initElements(driver,this);
   }
   
   // ------- url get
   public String getUrl()
   {   // written string current url
	   String current_url = driver.getCurrentUrl();
	   return current_url;    //must added sting in method bcz its string
   }
   
   //static method so we have to call static path dont fprgot to \\
   static String path = "G:\\Eclipse\\MyArtifactID\\ScreenShots\\";
   public static void ScreenShot(String Filename)
   {
	   try
	   {
		   TakesScreenshot SS = (TakesScreenshot)driver;
		   File Src =SS.getScreenshotAs(OutputType.FILE);
		   
		   //javapoint.com
		   DateTimeFormatter DTY = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		   LocalDateTime now = LocalDateTime.now();
		   String datetime = DTY.format(now);
		   
		   File Des = new File(path+Filename+System.currentTimeMillis()+".png");
		   FileHandler.copy(Src, Des);
	   }
	   catch(IOException e)
  	   {
	          System.out.println("use correct path");	   
	          e.printStackTrace();
  	   }
   }
}
