package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTestDemo {
	@Test(groups="functional")
	public void  m1(){
		Reporter.log("Hi1", true);
	}
	
	@Test(groups="integrational",dependsOnGroups="functional")
	public void m2(){
		Reporter.log("Hi2", true);
	}
	
	@Test(groups="functional")
	public void m3(){
		Reporter.log("Hi3", true);
	}
	
	@Test(groups="integrational",dependsOnGroups={"functional","unit"})
	public void  m4(){
		Reporter.log("Hi4", true);
	}
	
	@Test(groups="functional")
	public void m5(){
		Reporter.log("Hi5", true);
	}
	
	@Test(groups="unit")
	public void m6(){
		Reporter.log("Hi6", true);
	}

}
