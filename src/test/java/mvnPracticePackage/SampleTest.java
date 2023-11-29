package mvnPracticePackage;

import org.testng.annotations.Test;


import org.testng.Reporter;

public class SampleTest{
	@Test(groups="Regresion")
	public void sampletest1() {
		Reporter.log("--Sample Test1--", true);
	}
	@Test
	public void sampletest2() {
		Reporter.log("--Sample Test2--", true);
	}
}
