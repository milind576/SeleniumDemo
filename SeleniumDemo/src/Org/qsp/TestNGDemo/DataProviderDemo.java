package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider
	public String[][] getData(){
		String st[][]=new String[3][3];
		
		st[0][0]="ankit";
		st[0][1]="ankit@123";
		st[0][2]="ankit123@gmail.com";
		
		st[1][0]="milind";
		st[1][1]="milind@123";
		st[1][2]="milind123@gmail.com";
		
		st[2][0]="sanjay";
		st[2][1]="sanjay@123";
		st[2][2]="sanjay123@gmail.com";
		
		return st;
	}
	
	@Test(dataProvider="getData")
	public void m1(String un,String pw,String id){
		Reporter.log(un+" "+pw+" "+id, true);
	}
	

}
