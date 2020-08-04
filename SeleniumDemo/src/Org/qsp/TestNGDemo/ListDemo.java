package Org.qsp.TestNGDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListDemo1.class)
public class ListDemo {
	@Test
	public void m1(){
		Reporter.log("Hi1", true);
	}
	
	@Test
	public void m2(){
		Reporter.log("Hi2", true);
		Assert.fail();
	}

}
