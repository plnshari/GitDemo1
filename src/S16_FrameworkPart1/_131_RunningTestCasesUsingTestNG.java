package S16_FrameworkPart1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class _131_RunningTestCasesUsingTestNG {

	@Test(groups = {"2"},dependsOnMethods = { "Demo2test" }, enabled = true, timeOut = 4000) //time out waits 4000 milli sec to fail this method
	public void Demo() {
		System.out.println("Hello");
	}
	
	@Parameters({"URL","KEY"})
	@Test(groups = { "2" })
	public void Demo2test(String urlname, String Key) {
		System.out.println("World");
		System.out.println(urlname);
		System.out.println(Key);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object [] [] data = new Object [3][2]; //[times we have to run][values we are passing]
		
		//1st user login
				data [0][0] = "user1";
				data [0][1] = "Password1";
		//2nd user login
				data [1][0] = "user2";
				data [1][1] = "Password2";
		//3rd user login
				data [2][0] = "user3";
				data [2][1] = "Password3";
				
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void datafetch(String userName, String passWord) {
		System.out.println(userName + " + " + passWord);
	}

	@BeforeTest
	public void prerequiste() {
		System.out.println("i am before test opereation (1)");
	}

	@AfterSuite
	public void postrequiste() {
		System.out.println("i am After suite opereation (1)");
	}

	@BeforeMethod
	public void premethod() {
		System.out.println("i am Before every method in the class(1)");
	}

	@BeforeClass
	public void preclassrequiste() {
		System.out.println("i am After class opereation (1)");
	}
}
