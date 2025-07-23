package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class day2 {
	
	@Parameters({"URL", "username"})
	@Test(groups = {"Smoke"}, invocationCount=5)
	public void ploan(String urlname, String uname)
	{
		System.out.println("Loan paid");
		System.out.println(urlname);
		System.out.println(uname);
		//added for git 
		System.out.println("After Git");
		System.out.println("After Git1");
		System.out.println("After Git2	");
		
		//added for git
		System.out.println("Added by American guy1");
		System.out.println("Added by American guy2");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I will run first");
	}
}
