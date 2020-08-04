package Org.qsp.TestNGDemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	public void m1(){
		String aName="Milind";
		String eName="Milind";
		Assert.assertEquals(aName, eName);
		System.out.println("matched");
		
		
		List<String> lst=new ArrayList<String>();
		lst.add("abc");
		lst.add("pqr");
		lst.add("xyz");
		
		List<String> lst1=new ArrayList<String>();
		lst1.add("abc");
		lst1.add("pqr");
		lst1.add("xyz");
		Assert.assertEquals(lst, lst1);
		System.out.println("List is matched");
	}
	
}
