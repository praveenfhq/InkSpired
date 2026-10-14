package org.page;

import org.base.BaseCls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeandpayment extends BaseCls {
	public Homeandpayment() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "(//a[text()='Home & Kitchen'])[1]")
	private WebElement home;
	
	@FindBy(xpath="//span[text()='Raptor Claw Bottle Opener']")
	private WebElement opener;
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addcart;
	@FindBy(id="drawer-checkout")
	private WebElement checkout;
	@FindBy(id="checkout-btn")
	private WebElement proceedcheckout;
	@FindBy(xpath = "(//span[@class='CurrencyAmount'])[2]")
	private WebElement currency;
	@FindBy(xpath = "//apple-pay-button[@id='apple-pay-button']")
	private WebElement apple;
	@FindBy(xpath = "//span[@class='LinkButton-inner']")
	private WebElement link;
	@FindBy(xpath = "//button[text()='Cancel payment']")
	private WebElement cancel;
	@FindBy(xpath = "//div[@id='financial-partner-app-container']")
	private WebElement amazon;
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	@FindBy (xpath = "//input[@id='shippingName']")
	private WebElement name;
	@FindBy(xpath = "//span[text()='Continue with Link']")
	private WebElement continuelink;
	@FindBy(xpath = "//input[@id='phoneNumber']")
	private WebElement phonenumber;
	@FindBy(xpath = "//span[text()='Verify']")
	private WebElement verify;
	@FindBy (xpath = "(//span[text()='Back'])[2]")
	private WebElement back;
	@FindBy (xpath = "//input[@id='shippingAddressLine1']")
	private WebElement address1;
	@FindBy(xpath="//input[@id='shippingAddressLine2']")
	private WebElement address2;
	@FindBy(xpath="//input[@id='shippingLocality']")
	private WebElement city;
	@FindBy(xpath = "//input[@id='shippingPostalCode']")
	private WebElement zip;
	@FindBy(xpath = "//select[@id='shippingAdministrativeArea']")
	private WebElement area;
	@FindBy(xpath = "//input[@id='cardNumber']")
	
	private WebElement cardnumber;
	@FindBy(xpath = "//input[@autocomplete='cc-exp']")
	private WebElement month;
	@FindBy (xpath = "//input[@id='cardCvc']")
	private WebElement cvv;
	public WebElement getHome() {
		return home;
	}
	public WebElement getOpener() {
		return opener;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getProceedcheckout() {
		return proceedcheckout;
	}
	public WebElement getCurrency() {
		return currency;
	}
	public WebElement getApple() {
		return apple;
	}
	public WebElement getLink() {
		return link;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getAmazon() {
		return amazon;
	}
	public WebElement getEmail(String string) {
		passTheValues(email, string);
		return email;
	}
	public WebElement getName(String string) {
		passTheValues(name, string);
		return name;
	}
	public WebElement getContinuelink() {
		return continuelink;
	}
	public WebElement getPhonenumber(String string) {
		passTheValues(phonenumber, string);
		return phonenumber;
	}
	public WebElement getVerify() {
		return verify;
	}
	public WebElement getBack() {
		return back;
	}
	public WebElement getAddress1(String string) {
		passTheValues(address1, string);
		return address1;
	}
	public WebElement getAddress2(String string) {
		passTheValues(address2, string);
		return address2;
	}
	public WebElement getCity(String string) {
		passTheValues(city, string);
		return city;
	}
	public WebElement getZip(String string) {
		passTheValues(zip, string);
		return zip;
	}
	public WebElement getArea() {
		return area;
	}
	public WebElement getCardnumber(String string) {
		passTheValues(cardnumber, string);
		return cardnumber;
	}
	public WebElement getMonth(String string) {
		passTheValues(month, string);
		return month;
	}
	public WebElement getCvv(String string) {
		passTheValues(cvv, string);
		return cvv;
	}
	
	
	
	
	
	
	

}
