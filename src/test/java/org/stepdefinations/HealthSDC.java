package org.stepdefinations;

import org.base.BaseCls;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.page.HealthandBeauty;
import org.page.ToysandGames;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthSDC extends BaseCls {
	@When("User scrolls & hovers over Health and Beauty menu and click it")
	public void user_scrolls_hovers_over_health_and_beauty_menu_and_click_it() {
		HealthandBeauty hb = new HealthandBeauty();
		WebElement health = hb.getHealth();
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(false);", health);
		moveTo(health);
		pressTheButton(health);
	}

	@When("User selects {int} Bandages product")
	public void user_selects_bandages_product(Integer int1) {
		HealthandBeauty hb = new HealthandBeauty();
		WebElement bandage = hb.getBandage();
		pressTheButton(bandage);

	}

	@When("User clicks Add to cart button")
	public void user_clicks_add_to_cart_button() {
		ToysandGames tg = new ToysandGames();
		WebElement addtocart = tg.getAddtocart();
		pressTheButton(addtocart);
		String actualTitle = getDriver().getTitle();

		System.out.println("Actual Page Title: " + actualTitle);

		Assert.assertTrue(actualTitle.contains("Eco First Aid"),
				"Page title does not contain Eco First Aid. Actual title: " + actualTitle);

	}

	@Then("User click the checkout button")
	public void user_click_the_checkout_button() {
		ToysandGames tg = new ToysandGames();
		WebElement checkout = tg.getCheckout();
		WaitClick(checkout);
		pressTheButton(checkout);

	}
}
