package S16_FrameworkPart1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _131_RunningTestCasesUsingTestNG2 {
	
	@Test(dependsOnMethods = { "Demo2test" })
	public void Demo() {
		System.out.println("Patsamatla");
	}
	
	@Parameters({"URL"})
	@Test(groups = {"2"})
	public void Demo2test(String urlname) {
		System.out.println("Srihari");
		System.out.println(urlname);
	}
	
	@BeforeTest 
	public void prerequiste() {
		System.out.println("i am before test opereation (2)");
	}
	
	@AfterSuite
	public void postrequiste() {
		System.out.println("i am After suite opereation (2)");
	}
	
	@AfterMethod
	public void premethod() {
		System.out.println("i am After every method in the class(2)");
	}
}
