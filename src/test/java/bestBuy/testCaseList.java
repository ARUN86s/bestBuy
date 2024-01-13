package bestBuy;

import org.testng.annotations.Test;

public class testCaseList extends BaseFileConfig {
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
	bB.accountLink();
	}	
	
	
}
