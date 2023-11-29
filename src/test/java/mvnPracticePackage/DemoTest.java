package mvnPracticePackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest{
	@Test (groups="Smoke")
	public void demotest1() {
		Reporter.log("--Demo Test1--", true);
	}
	@Test (groups={"Smoke","Regresion"})
	public void demotest2() {
		Reporter.log("--Demo Test2--", true);
	}
}
