
package org.stepdefinations;

import java.awt.AWTException;
import java.awt.Robot;

import org.base.BaseCls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.page.ToysandGames;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToySDC extends BaseCls {
	Robot r;

	@When("I search for {string}")
	public void i_search_for(String product) {

		ToysandGames tg = new ToysandGames();
		WebElement search = tg.getSearch();
		passTheValues(search, product);
	}

	@When("I select the product")
	public void i_select_the_product() throws AWTException, InterruptedException {

		ToysandGames tg = new ToysandGames();
		WebElement search1 = tg.getSearch();

		pressTheButton(search1);

		Thread.sleep(5000);

		r = new Robot();

		for (int i = 0; i < 3; i++) {
			robotTab();
		}

	}
	@When("when the product passed into the search box then press enter")
	public void when_the_product_passed_into_the_search_box_then_press_enter() throws AWTException {
		
		r = new Robot();
		robotEnter();
		
	}

	@When("I increase the product quantity by {int}")
	public void i_increase_the_product_quantity_by(Integer quantity) {

		ToysandGames tg = new ToysandGames();
		WebElement inc = tg.getInc();

		for (int i = 0; i < quantity; i++) {
			pressTheButton(inc);
		}
	}

	@When("I add the product to the cart")
	public void i_add_the_product_to_the_cart() {

		ToysandGames tg = new ToysandGames();
		WebElement addtocart = tg.getAddtocart();

		pressTheButton(addtocart);
	}

	@When("I remove the product from the cart")
	public void i_remove_the_product_from_the_cart() {

		ToysandGames tg = new ToysandGames();
		WebElement remove = tg.getRemove();

		pressTheButton(remove);
	}

	@When("I close the cart")
	public void i_close_the_cart() {

		ToysandGames tg = new ToysandGames();
		WebElement cartclose = tg.getCartclose();

		pressTheButton(cartclose);
	}

	@When("I decrease the product quantity by {int}")
	public void i_decrease_the_product_quantity_by(Integer quantity) {

		ToysandGames tg = new ToysandGames();
		WebElement dec = tg.getDec();

		for (int i = 0; i < quantity; i++) {
			pressTheButton(dec);
		}
	}

	@Then("I proceed to checkout")
	public void i_proceed_to_checkout() {

		ToysandGames tg = new ToysandGames();
		WebElement checkout = tg.getCheckout();

		SoftAssert soft = new SoftAssert();

		soft.assertTrue(checkout.isEnabled(), "Checkout button is not enabled");

		soft.assertAll();

		WaitClick(checkout);
		pressTheButton(checkout);
	}

	@Then("I should see the message {string}")
	public void i_should_see_the_message(String expectedMessage) {

		WebElement message = getDriver().findElement(By.xpath("//h2[text()='No matches']"));

		String actualMessage = message.getText();

		Assert.assertEquals(actualMessage, expectedMessage, "The search result message does not match");
	}
}
