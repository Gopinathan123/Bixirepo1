package mvnPracticePackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice1 {
	@Test (groups="Smoke")
	public void demotest1() {
		Reporter.log("--Demo Test1--", true);
	}
	@Test (groups={"Smoke","Regression"})
	public void demotest2() {
		Reporter.log("--Demo Test2--", true);
	}
	@Test
	public void demotest3() {
		Reporter.log("--Demo Test3--", true);
	}

}
