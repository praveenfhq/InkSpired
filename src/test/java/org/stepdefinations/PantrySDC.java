package org.stepdefinations;

import java.time.Duration;

import org.base.BaseCls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.page.PantryandGrocery;
import org.page.ToysandGames;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PantrySDC extends BaseCls {
	@When("I select the Pantry and Grocery category")
	public void i_select_the_pantry_and_grocery_category() {
		PantryandGrocery pg = new PantryandGrocery();
		WebElement pantry = pg.getPantry();
		pressTheButton(pantry);

	}

	@When("I select the Honey Lemon Throat Comfort Tea product")
	public void i_select_the_honey_lemon_throat_comfort_tea_product() {
		PantryandGrocery pg = new PantryandGrocery();
		WebElement lemon = pg.getLemon();
		pressTheButton(lemon);
		 String actualTitle = getDriver().getTitle();

		    System.out.println("Actual Page Title: " + actualTitle);

		    Assert.assertTrue(
		        actualTitle.contains("Honey Lemon"),
		        "Page title does not contain Honey Lemon. Actual title: " + actualTitle
		    );
	}

	@When("I open the Shipping and Returns section")
	public void i_open_the_shipping_and_returns_section() {
		PantryandGrocery pg = new PantryandGrocery();
		WebElement ship = pg.getShip();
		pressTheButton(ship);

	}

	@When("I should fetch and display the Shipping and Returns details")
	public void i_should_fetch_and_display_the_shipping_and_returns_details() {
		PantryandGrocery pg = new PantryandGrocery();
		WebElement acc = pg.getAcc();
		System.out.println(getTheText(acc));
		// String theText = getTheText(acc);
		// System.out.println(theText);

	}

	@Then("I add the product to the cart and checkout")
	public void i_add_the_product_to_the_cart_and_checkout() {
		ToysandGames tg = new ToysandGames();
		WebElement addtocart = tg.getAddtocart();
		pressTheButton(addtocart);
		// WebElement cartclose = tg.getCartclose();
		// pressTheButton(cartclose);
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
		WebElement checko = wait.until(ExpectedConditions.elementToBeClickable(tg.getCheckout()));
		pressTheButton(checko);
	}

}
