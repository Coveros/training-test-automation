package com.coveros.training.automation.selenium.pom;

import com.coveros.test.selenium.pom.PageObject;
import com.coveros.training.automation.selenium.SeleniumMobileHelper;

/**
 * Superclass for all Target page objects.
 * 
 * @author brian
 *
 */
public abstract class TargetWebsitePageObject extends PageObject {

	private SeleniumMobileHelper selenium;

	/**
	 * @return the selenium
	 */
	protected SeleniumMobileHelper getSelenium() {
		if (selenium == null && driver != null) {
			selenium = new SeleniumMobileHelper(driver);
		}
		return selenium;
	}
}
