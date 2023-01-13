package org.testNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountManagerEx1 {
	@BeforeClass 
	 public void getaccounttestdata() {
		  System.out.println("get account test data");
	  }
	
	 @Test
	  public void createAccount() {
		  System.out.println("create Account");
	  }
	 @Test
	  public void updateAccount() {
		  System.out.println("update Account");
	  }
	 @Test
	  public void deleteAccount() {
		  System.out.println(" delete Account");
	  }
	 @AfterClass 
	 public void flushaccounttestdata() {
		  System.out.println("flush account test data");
	  }

}
