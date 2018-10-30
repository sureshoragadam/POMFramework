package test.java;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestpom1 {
	
	@Test (groups = {"test1"})
	public void dummytesting1() {
		System.out.println("dummy testing 1");  
	  	Assert.assertTrue(Boolean.TRUE);
	} 
  
    @Test (groups = {"test2"})
    public void dummytesting2() {
    	System.out.println("dummy testing 2");
    	Assert.assertTrue(Boolean.TRUE);
    }
    
    @Test (groups = {"test1"})
	public void dummytesting3() {
    	System.out.println("dummy testing 3");
		Assert.assertTrue(Boolean.TRUE);
	}
    @Test (groups = {"test2"})
   	public void dummytesting4() {
       	System.out.println("dummy testing 4");
   		Assert.assertTrue(Boolean.TRUE);
   	}
    
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("befor method");
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
