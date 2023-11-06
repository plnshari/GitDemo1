package S16_FrameworkPart1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _131_RunningTestCasesUsingTestNG3 {
	
	@Test(groups = {"2"}, enabled = true) //Bug filed
	public void Demo() {
		System.out.println("Varma");
	}
	
	@Parameters({"URL","KEY"})
	@Test(groups = {"2"})
	public void Demo2test(String urlname, String Key) {
		System.out.println("srihari.varma.patsamatla@hexagon.com");
		System.out.println(urlname);
		System.out.println(Key);
	}
	
	@AfterTest
	public void postrequiste() {
		System.out.println("i am After test opereation (3)");
	}
	
	@BeforeSuite
	public void prerequiste() {
		System.out.println("i am Before suite opereation (3)");
	}
}
