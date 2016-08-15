package com.coveros.training.automation.selenium;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ResponsiveFirefoxTest extends TargetShoppingCartTest {

	@Override
	protected PlatformType getPlatformType() {
		return PlatformType.FIREFOX;
	}

	@Override
	protected DesiredCapabilities getCapabilities() {
		// TODO Auto-generated method stub
		return DesiredCapabilities.firefox();
	}

}
