package test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import generics.BaseTest;
import pom.SampleFrameworkPage;

public class TestSubmit extends BaseTest
{
	@Test
	public void submit() throws IOException
	{
		Reporter.log("execution of test method started" , true);
		SampleFrameworkPage sample=new SampleFrameworkPage(driver);
		sample.submitdata();
		Reporter.log("execution of test method completed" , true);
	}
}