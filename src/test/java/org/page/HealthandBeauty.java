package org.page;

import org.base.BaseCls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthandBeauty extends BaseCls{
	public HealthandBeauty(){
		PageFactory.initElements(getDriver(),this);
	}
	@FindBy(xpath="(//a[text()='Health & Beauty'])[1]")
	private WebElement health;
	public WebElement getHealth() {
		return health;
	}
	public WebElement getBandage() {
		return bandage;
	}
	@FindBy (xpath="//span[contains(text(),'77 Bandages')]")
	private WebElement bandage;

}
