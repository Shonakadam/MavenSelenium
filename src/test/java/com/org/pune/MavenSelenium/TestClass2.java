package com.org.pune.MavenSelenium;

import org.testng.annotations.Test;

import org.testng.annotations.AfterGroups;

import org.testng.annotations.BeforeGroups;


public class TestClass2 {
  @Test(groups= {"morning","evening"})
  public void a() {
	  System.out.println("Test a");

}
  @Test(groups= {"morning","evenig"})
  public void d() {
	  System.out.println("Test c");
  }
  
  @BeforeGroups("evening")
  public void beforetest() {
	  System.out.println("d");
  }
     @AfterGroups("evening")
     public void aftermethod() {
    	 System.out.println("aftermethod");
     }
}