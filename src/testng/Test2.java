package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 
{
	@Test(priority=1,invocationCount=3)
	public void call() { Reporter.log("call",true);}
	
	@Test(enabled=false)//this will be skipped
	public void chat() { Reporter.log("chat",true);}
	
	@Test(priority=1,invocationCount=1)
	public void setting() { Reporter.log("setting",true);}

}