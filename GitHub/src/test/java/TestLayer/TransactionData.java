package TestLayer;

import org.testng.annotations.Test;

import PageLayer.DashBoardPage;
import PageLayer.TasactionPage;
import TestBase.TestBaseClass;

public class TransactionData extends TestBaseClass
{
	@Test
	public void getData() throws InterruptedException
   {
		TasactionPage Transaction = new TasactionPage();
		DashBoardPage dash = new DashBoardPage();
		Thread.sleep(2000);
		dash.clickOnTransaction();
		Thread.sleep(2000);
		System.out.println(Transaction.getTransactionData());

   }
}
