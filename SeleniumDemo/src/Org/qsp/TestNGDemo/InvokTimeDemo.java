package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvokTimeDemo {
	
	/*@BeforeMethod
	public void  bM(){
		Reporter.log("BM", true);
	}
	
	@Test(invocationCount = 3)
	public void m1(){
		Reporter.log("Hiiii", true);
	}
	
	@AfterMethod
	public void aF(){
		Reporter.log("AM", true);
	}
*/
	@Test(priority=5)
	public void  m1(){
		Reporter.log("Hiiiii", true);
	}
	
	@Test(enabled=false)
	public void m2(){
		Reporter.log("Hi", true);
	}
	
	@Test(priority=3)
	public void m3(){
		Reporter.log("Hiii", true);
	}
	
}
