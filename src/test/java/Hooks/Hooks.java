package Hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BaseCode;

public class Hooks{
	@Before
	public void atStart()
	{
		BaseCode.driver=new ChromeDriver();
		BaseCode.driver.get("https://www.rediff.com/");
	}
	@After
	public void closePage()
	{
		BaseCode.driver.quit();
	}

}