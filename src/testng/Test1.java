package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
	@Test(priority=1,invocationCount=3)
	public void call() { Reporter.log("call",true);}
	
	@Test(priority=-1,invocationCount=2)
	public void chat() { Reporter.log("chat",true);}
	
	@Test(priority=1,invocationCount=1)
	public void setting() { Reporter.log("setting",true);}

}
