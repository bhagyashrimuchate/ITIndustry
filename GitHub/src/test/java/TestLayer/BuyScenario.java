package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageLayer.ExchangePage;
import TestBase.TestBaseClass;

public class BuyScenario extends TestBaseClass
{
 	//LogIn steps in TestBaseClass so dont need to add here
    String expected_msg = "Order Created successfully";
	
	@Test
    public void buyShare() throws InterruptedException
    {
    	Thread.sleep(2000); // add bcz site will take some tym so add this to load the page n the test case will execute
    	dash.enterCompanyName("Wipro"); // MouseHover+ctl & click = go on that method where it will defined
    	dash.clickOnCompanyOption();
    	logger.info("selected company option");
    	Thread.sleep(2000);
    	ExchangePage exchange = new ExchangePage();
        exchange.clickOnBuyButton1();
        exchange.enterQnty("3");
        exchange.clickOnBuyButton2();
    	logger.info("click on buy button");
        Thread.sleep(2000);
        String actual_msg = exchange.statusmessage();
    	Assert.assertEquals(actual_msg,expected_msg);
    }
}
