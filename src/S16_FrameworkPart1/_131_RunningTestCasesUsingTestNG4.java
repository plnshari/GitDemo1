package S16_FrameworkPart1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _131_RunningTestCasesUsingTestNG4 {
	
	@Test(groups = {"2"},dependsOnMethods = { "Demo2test" })
	public void Demo() {
		System.out.println("108528");
	}
	
	@Parameters({"URL"})
	@Test(groups = {"2"})
	public void Demo2test(String urlname) {
		System.out.println("'slpatsam'");
		System.out.println(urlname);
	}
	
	@AfterTest 
	public void postrequiste() {
		System.out.println("i am After test opereation (4)");
	}
	
	@BeforeSuite
	public void prerequiste() {
		System.out.println("i am Before Suite opereation (4)");
		System.out.println("i am Before Suite opereation (4)");
	}
	
	@AfterClass
	public void postclassrequiste() {
		System.out.println("i am After class opereation (4)");
		System.out.println("i am Before Suite opereation (4)");
	}
}
