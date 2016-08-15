package com.coveros.training.automation.selenium;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ResponsiveChromeTest extends TargetShoppingCartTest {

	@Override
	protected PlatformType getPlatformType() {
		return PlatformType.CHROME;
	}

	@Override
	protected DesiredCapabilities getCapabilities() {
		return DesiredCapabilities.chrome();
	}

}
