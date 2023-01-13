package org.testNG2;

import org.testng.annotations.Test;

public class GroupingEx1 {
	 @Test(groups= {"smoke","regression","UAT"})
	  public void testmethod1() {
		  System.out.println("TEST METHOD 1");
	  }
	 @Test(groups= {"smoke","regression"})
	  public void testmethod2() {
		  System.out.println("TEST METHOD 2");
	  }
	 @Test(groups= {"smoke","UAT"})
	  public void testmethod3() {
		  System.out.println("TEST METHOD 3");
	  }
	 @Test(groups= {"regression","UAT"})
	  public void testmethod4() {
		  System.out.println("TEST METHOD 4");
	  }
	 @Test(groups= {"smoke"})
	  public void testmethod5() {
		  System.out.println("TEST METHOD 5");
	  }
	 @Test(groups= {"regression"})
	  public void testmethod6() {
		  System.out.println("TEST METHOD 6");
	  }
	 @Test(groups= {"UAT"})
	  public void testmethod8() {
		  System.out.println("TEST METHOD 8");
	  }
	 @Test
	  public void testmethod7() {
		  System.out.println("TEST METHOD 7");
	  }



}
