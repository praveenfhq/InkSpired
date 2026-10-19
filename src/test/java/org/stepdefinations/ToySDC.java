
package org.stepdefinations;

import org.base.BaseCls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.page.ToysandGames;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToySDC extends BaseCls {

	@When("I search for {string} Figure\" and i select the product")
	public void i_search_for_figure_and_i_select_the_product(String string) {

		ToysandGames tg = new ToysandGames();
		WebElement search = tg.getSearch();
		passTheValues(search, string);
		conditionalWait(20);
		pressTheButton(tg.getSubmit());
		pressTheButton(tg.getToy1());
	
		

	}
	@When("I search for {string} and i select the product")
	public void i_search_for_and_i_select_the_product(String string) {

		ToysandGames tg = new ToysandGames();
		WebElement search = tg.getSearch();
		passTheValues(search, string);
		conditionalWait(20);
		pressTheButton(tg.getSubmit());
	
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
