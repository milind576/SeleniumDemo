package Org.qsp.TestNGDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListDemo1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult context) {
		System.out.println(context.getStatus());
		System.out.println(context.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getTestName());
		System.out.println(result.getStatus());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getStartDate()+"OS");
		System.out.println(context.getAllTestMethods()+" OS");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getEndDate()+" OF");
		System.out.println(context.getPassedTests()+" OF");
		System.out.println(context.getFailedTests()+" OF");
		System.out.println(context.getSkippedTests()+" OF");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.getName());
		// TODO Auto-generated method stub
		
	}

}
