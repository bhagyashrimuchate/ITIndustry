package TestLayer;


import org.testng.Assert;
import org.testng.annotations.Test;
import TestBase.TestBaseClass;
import Utility.Utilclass;

public class TestScript extends TestBaseClass
{  
	String expected_url = "https://www.apps.dalalstreet.ai/dashboard";
	
	@Test
	public void toVerifyLogin() throws InterruptedException
	{   //add variable as a public  in loginpage bcz to see the access scope
		/* LogInPage Login = new LogInPage();
		Login.enterMailAddress();
		Login.enterPassword();
		Login.LogIn(); */
		
		Utilclass util = new Utilclass();

		Thread.sleep(1000);
		String actual_url=util.getUrl();
	    Thread.sleep(3000);
		Assert.assertEquals(actual_url, expected_url);
		System.out.println("success");
	}
	
}


 /* 1 launch browser
    2 enter username
    3 enter pssword
    4 click on login button
    5 enter company name
    6 select one option from dropdown
    7 click on buy
    8 enter quntity of share
    9 click on buy button
    10 verify order is succesfully placed or not */
