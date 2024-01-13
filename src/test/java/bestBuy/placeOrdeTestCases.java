package bestBuy;

import org.testng.annotations.Test;

public class placeOrdeTestCases extends BaseFileConfig {
	
	@Test
	public void testCase01() {
	bestBuy bB = new bestBuy(driver);
	bB.homepage();
	}	
	
	@Test
	public void testCase02() {
	bestBuy bB = new bestBuy(driver);
	bB.countrySelect();
	}
	
	@Test
	public void testCase03() {
	bestBuy bB = new bestBuy(driver);
	bB.homepageValidation();
	}

	@Test
	public void testCase04() {
	bestBuy bB = new bestBuy(driver);
	bB.shopping();
	}
	
	@Test
	public void testCase05() {
	bestBuy bB = new bestBuy(driver);
	bB.customerTypeGuest();
	}	

	@Test
	public void testCase06() {
	bestBuy bB = new bestBuy(driver);
	bB.billingDetails();
	}	
}
