package org.hooks;

import org.base.BaseCls;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseCls {
	@Before
	public  void before() {
		openchrome();
		launchUrl("https://inkspiredstore.com/");
		maxWin();
		conditionalWait(100);
		
	}
	@After
	public void after( Scenario s) {
		if(s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)tldriver.get();
			byte[] pk = ts.getScreenshotAs(OutputType.BYTES);
			s.attach(pk,"image/png",s.getName());
			
		}
		
		quiteTheBrowser();
	}

}


