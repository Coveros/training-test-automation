package com.coveros.training.automation.selenium.pom;

import com.coveros.training.automation.selenium.SeleniumMobileHelper;
import com.coveros.training.automation.selenium.SeleniumMobileHelper.Locator;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

/**
 * Page Object representing the dialog that appears when an item is removed from
 * the shopping cart.
 * 
 * @author brian
 *
 */
public final class ConfirmRemoveItemDialog extends TargetWebsitePageObject {

	@Override
	protected boolean checkInitialPageState() {
//		try {
//			getSelenium().throwIfTextNotFoundInElement(Locator.XPATH, "//div[@id='basicModal']/div[2]/div/div/h2",
//					"remove this item from your cart?", "Confirm Remove Item Dialog did not appear properly");
//		} catch (PageLoadException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return super.checkInitialPageState();
	}

	public ShoppingCartPage cancel() throws PageLoadException {
		return factory.newPage(ShoppingCartPage.class);
	}

	public ShoppingCartPage closeDialog() {
		return factory.newPage(ShoppingCartPage.class);
	}

	public EmptyCartPage clickRemoveButton() throws PageLoadException {
		getSelenium().tapElement(Locator.XPATH, "//div[2]/div/div[2]/button");
		return factory.newPage(EmptyCartPage.class);
	}
}
