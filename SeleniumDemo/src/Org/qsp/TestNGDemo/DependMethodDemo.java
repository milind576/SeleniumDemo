package Org.qsp.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependMethodDemo {
	@Test(dependsOnMethods="m2")
	public void m1(){
		System.out.println("Hi1");
	}
	
	@Test()
	public void m2(){
		System.out.println("Hi2");
		Assert.fail();
		System.out.println("hifive");
	}
	
	@Test
	public void m3(){
		System.out.println("Hi3");
	}
	

}
