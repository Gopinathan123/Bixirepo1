package mvnPracticePackage;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.Reporter;
//@Listeners(com.banking.bixi.GenericUtils.ListenerImplementation.class)
public class PracticeTest extends BaseExe{
	@Test(groups="smoke")
	public void practtest1() {
		Reporter.log("--Practice Test1--", true);
	}
	@Test
	public void practtest2() {
		Assert.fail();
		Reporter.log("--Practice Test2--", true);
	}
}
