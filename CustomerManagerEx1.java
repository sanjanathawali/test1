package org.testNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerManagerEx1 {
	@BeforeClass 
	 public void getcustomertestdata() {
		  System.out.println("get customer test data");
	  }
	 @Test
	  public void createcustomer() {
		  System.out.println("create customer");
	  }
	 @Test
	  public void updatecustomer() {
		  System.out.println("update customer");
	  }
	 @Test
	  public void deletecustomer() {
		  System.out.println(" delete customer");
	  }
	 @AfterClass 
	 public void flushcustomertestdata() {
		  System.out.println("flush customert test data");
	  }

}
