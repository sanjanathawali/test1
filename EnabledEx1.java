package org.testNG2;

import org.testng.annotations.Test;

public class EnabledEx1 {
	
	 @Test(priority=1,enabled=true)
	  public void login() {
		  System.out.println("login");
	  }
	 @Test(priority=5,enabled=true)
	  public void logout() {
		System.out.println("logout");
	  } 
	 @Test(priority=2)
	  public void createcust() {
		  System.out.println("create customer");
	  }
	 @Test(priority=3)
	  public void updatecust() {
		  System.out.println("update customer");
	  }
	 @Test(priority=4,enabled=false)
	  public void deletecust() {
		  System.out.println("delete customer");
	  }
}
	
