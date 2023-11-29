package mvnPracticePackage;

import org.testng.annotations.Test;


import org.testng.Reporter;

public class SimpleTests {
	@Test (groups={"Smoke","Regresion"})
	public void simpltest1() {
		Reporter.log("--Simple Test1--", true);
	}
	@Test (groups={"Smoke","Regresion"})
	public void simpltest2() {
		Reporter.log("--Simple Test2--", true);
	}
}
