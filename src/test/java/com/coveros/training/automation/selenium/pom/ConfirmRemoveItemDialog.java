package com.coveros.training.automation.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.coveros.training.automation.selenium.SeleniumMobileHelper.Locator;

/**
 * Page Object representing the dialog that appears when an item is removed from
 * the shopping cart.
 * 
 * @author brian
 *
 */
public final class ConfirmRemoveItemDialog extends TargetWebsitePageObject {

	@FindBy(xpath = "//div[2]/div/div[2]/button")
	private WebElement removeButton;

	@Override
	protected boolean checkInitialPageState() {
		// try {
		// getSelenium().throwIfTextNotFoundInElement(Locator.XPATH,
		// "//div[@id='basicModal']/div[2]/div/div/h2",
		// "remove this item from your cart?", "Confirm Remove Item Dialog did
		// not appear properly");
		// } catch (PageLoadException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		return super.checkInitialPageState();
	}

	public ShoppingCartPage cancel() throws PageLoadException {
		return factory.newPage(ShoppingCartPage.class);
	}

	public ShoppingCartPage closeDialog() {
		return factory.newPage(ShoppingCartPage.class);
	}

	public EmptyCartPage clickRemoveButton() throws PageLoadException {
		removeButton.click();
		return factory.newPage(EmptyCartPage.class);
	}
}
