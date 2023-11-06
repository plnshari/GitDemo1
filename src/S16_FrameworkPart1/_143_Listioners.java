package S16_FrameworkPart1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is a interface which implements testing listeners

public class _143_Listioners implements ITestListener {

	 @Override
	 public void onTestStart(ITestResult result ) {
		 
	 }
	 
	 @Override
	 public void onTestSuccess(ITestResult result ) {
		 System.out.println("TestSuccess  : "+ result.getName());
	 }
	 
	 @Override
	 public void onTestFailure (ITestResult result ) {
		 System.out.println("TestFailure Screenshot  : " + result.getName());
	 }
	 
	 @Override
	 public void onTestSkipped(ITestResult result ) {
		 
	 }
	 
	 @Override
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result ) {
		 
	 }
	 
	 @Override
	 public void onStart(ITestContext context ) {
		 
	 }
	 
	 @Override
	 public void onFinish(ITestContext context) {
		 
	 }
}
