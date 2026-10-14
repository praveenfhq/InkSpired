package org.page;

import org.base.BaseCls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToysandGames extends BaseCls {
	public ToysandGames() {
		PageFactory.initElements(getDriver(),this);
	}
@FindBy(xpath = "//input[@type='search']")
private WebElement search ;
@FindBy(id="pdp-inc")
private WebElement inc;
@FindBy(xpath = "//button[text()='Add to cart']")
private WebElement addtocart;
@FindBy(xpath ="//button[text()='Remove']")
private WebElement remove;
@FindBy(xpath = "//button[@class='cart-close']")
private WebElement cartclose;
@FindBy (id="pdp-dec")
private WebElement dec;
@FindBy(xpath="//button[text()='Checkout']")
private WebElement checkout;
public WebElement getSearch() {
	return search;
}
public WebElement getInc() {
	return inc;
}
public WebElement getAddtocart() {
	return addtocart;
}
public WebElement getRemove() {
	return remove;
}
public WebElement getCartclose() {
	return cartclose;
}
public WebElement getDec() {
	return dec;
}
public WebElement getCheckout() {
	return checkout;
}

}
