package org.page;

import org.base.BaseCls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PantryandGrocery extends BaseCls {
	public PantryandGrocery() {
		PageFactory.initElements(getDriver(), this);

	}

	public WebElement getPantry() {
		return pantry;
	}
	public WebElement getLemon() {
		return lemon;
	}
	public WebElement getShip() {
		return ship;
	}
	public WebElement getAcc() {
		return acc;
	}

	@FindBy(xpath = "(//a[text()='Pantry & Grocery'][1])[1]")
	private WebElement pantry;
	@FindBy(xpath = "//span[text()='Honey Lemon Throat Comfort Tea, 16 ct']")
	private WebElement lemon;
	@FindBy(xpath = "//summary[text()='Shipping & Returns']")
	private WebElement ship;
	@FindBy(xpath = "(//div[@class='acc-body'])[2]")
	private WebElement acc;
}
