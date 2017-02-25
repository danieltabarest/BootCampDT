package com.BootCampDT.Globan;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class validationAnnotations {
  
	
  @Test(priority=2 ,groups="grop1")
  public void Login() {
	  System.out.println( "Hello Login!" );
  }
	
  @Test(priority=1,groups={"grop2","grop2"})
  public void singup() {
		  System.out.println( "sing up!" );
  }
	
  @Test(priority=1,groups={"grop2","grop2"},description="this open the browser")
  public void openbrowser() {
	  SoftAssert  softAssert = new  SoftAssert();
		  System.out.println( "openbrowser!" );
		  Assert.assertEquals("a", "bb");
		  softAssert.assertAll();
		 
  }
	
  
  @Test(priority=1,groups="grop2")
  public void Search() {
		  System.out.println( "Hello Search!" );
  }
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println( "Hello beforeMethod!" );
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println( "Hello World!" );
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println( "Hello beforeTest!" );
  }

  @AfterTest
  public void afterTest() {
	  System.out.println( "Hello afterTest!" );
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println( "Hello beforeSuite!" );
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println( "Hello afterSuite!" );
  }

}
