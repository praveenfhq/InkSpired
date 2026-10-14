package org.stepdefinations;
import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;
import org.base.BaseCls;
import org.openqa.selenium.WebElement;
import org.page.Homeandpayment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeandPaymentSDC extends BaseCls {
	@Given("User navigates to Home and Kitchen")
	public void user_navigates_to_home_and_kitchen() {
		Homeandpayment hp = new Homeandpayment();
		WebElement home = hp.getHome();
		pressTheButton(home);
	}

	@When("User selects the Raptor Claw Bottle Opener & adds the product to the cart")
	public void user_selects_the_raptor_claw_bottle_opener_adds_the_product_to_the_cart() {
		Homeandpayment hp = new Homeandpayment();
		WebElement opener = hp.getOpener();
		pressTheButton(opener);
		WebElement addcart = hp.getAddcart();
		pressTheButton(addcart);
		WebElement checkout = hp.getCheckout();
		pressTheButton(checkout);
		WebElement proceedcheckout = hp.getProceedcheckout();
		pressTheButton(proceedcheckout);

	}

	@When("User proceeds to checkout & change currency from rupees to Doller")
	public void user_proceeds_to_checkout_change_currency_from_rupees_to_doller() {
		Homeandpayment hp = new Homeandpayment();
		WebElement currency = hp.getCurrency();
		pressTheButton(currency);

	}

	@When("User click & verifies the Apple Pay  payment option and cancel it")
	public void user_click_verifies_the_apple_pay_payment_option_and_cancel_it()
			throws InterruptedException, AWTException {
		Homeandpayment hp = new Homeandpayment();
		// conditionalWait(50);
		// WaitFrame(0);
		Thread.sleep(5000);
		switchframe(2);
		switchframe(0);
		WebElement apple = hp.getApple();
		WaitClick(apple);
		pressTheButton(apple);
		robotEscape();
		switchWindow(0);
		WebElement cancel = hp.getCancel();
		pressTheButton(cancel);
		conditionalWait(50);

		mainframe();
		switchframe(2);

	}

	@When("user click and verifies the link pay payment option and cancel it")
	public void user_click_and_verifies_the_link_pay_payment_option_and_cancel_it() {
		Homeandpayment hp = new Homeandpayment();
		WebElement link = hp.getLink();
		// WaitClick(link);
		pressTheButton(link);
		switchWindow(0);
		WebElement cancel = hp.getCancel();
		pressTheButton(cancel);
		mainframe();
		switchframe(2);
		switchframe(1);

	}

	@When("user click and verifies the amazon pay payment option and cancel it")
	public void user_click_and_verifies_the_amazon_pay_payment_option_and_cancel_it() {
		Homeandpayment hp = new Homeandpayment();
		WebElement amazon = hp.getAmazon();
		pressTheButton(amazon);
		switchWindow(0);
		WebElement cancel = hp.getCancel();
		pressTheButton(cancel);
		mainframe();

	}

	@When("User enters the email and shipping details")
	public void user_enters_the_email_and_shipping_details() throws IOException, AWTException {
		Homeandpayment hp = new Homeandpayment();
		hp.getEmail(readDataFromExcel("inkspired", "Sheet1", 1, 1));
		hp.getName(readDataFromExcel("inkspired", "Sheet1", 1, 2));
		WebElement continuelink = hp.getContinuelink();
		pressTheButton(continuelink);
		hp.getPhonenumber(readDataFromExcel("inkspired", "Sheet1", 1, 3));
		robotEnter();
		conditionalWait(50);
		WebElement verify = hp.getVerify();
		pressTheButton(verify);
		WebElement back = hp.getBack();
		pressTheButton(back);
		hp.getAddress1(readDataFromExcel("inkspired", "Sheet1", 1, 4));
		for (int i = 0; i <= 2; i++) {
			robotdown();
		}
		robotEnter();
		hp.getAddress2(readDataFromExcel("inkspired", "Sheet1", 1, 5));
		WebElement area = hp.getArea();
		selectvis(area, "Washington");
		hp.getCity(readDataFromExcel("inkspired", "Sheet1", 1, 6));
		hp.getZip(readDataFromExcel("inkspired", "Sheet1", 1, 7));
	}

	@When("User enters the card details")
	public void user_enters_the_card_details(io.cucumber.datatable.DataTable d) {
		Map<String, String> M = d.asMap();
		Homeandpayment hp = new Homeandpayment();
		hp.getCardnumber(M.get("CardNumber"));
		hp.getMonth(M.get("Month/year"));
		hp.getCvv(M.get("CVV"));

	}

	@Then("User completes the payment form")
	public void user_completes_the_payment_form() throws AWTException {
		for (int i = 0; i <= 2; i++) {
			robotEnter();
		}

	}

}
