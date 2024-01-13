package bestBuy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;	



public class bestBuy extends BaseFileConfig{
	WebDriver driver;

@FindBy(xpath = "//title")
WebElement Title;	
@FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/h4")
WebElement US;


@FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
WebElement accountLink;
@FindBy(xpath = "//a[normalize-space()='Create Account']")
WebElement createAccount;
@FindBy(xpath = "//input[@id='firstName']")
WebElement firstName;
@FindBy(xpath = "//input[@id='lastName']")
WebElement lastName;
@FindBy(xpath = "//input[@id='email']")
WebElement email;
@FindBy(xpath = "//input[@id='fld-p1']")
WebElement password;
@FindBy(xpath = "//input[@id='reenterPassword']")
WebElement confirmPassword;
@FindBy(xpath = "//input[@id='phone']")
WebElement mobileNumber;
@FindBy(xpath = "//input[@id='is-recovery-phone']")
WebElement accountRecovery;
@FindBy(xpath = "//button[@type='submit']")
WebElement submitButton;

@FindBy(xpath = "//*[@id=\"google-button\"]")
WebElement googleSignup;
@FindBy(xpath = "//div[@class='Xb9hP']")
WebElement googleID;
@FindBy(xpath = "//input[@name='password']")
WebElement googlePassword;
@FindBy(xpath = "//span[normalize-space()='Next']")
WebElement googlePasswordSignin;

@FindBy(xpath = "//a[normalize-space()='Laptops & Computers']")
WebElement lapTops;
@FindBy(xpath = "//a[normalize-space()='Shop laptops on sale']")
WebElement lapTopsList;


@FindBy(xpath = "//a[normalize-space()='Gaming Laptops']")
WebElement gaminglapTops;
@FindBy(xpath = "//a[contains(text(),'ASUS - ROG Zephyrus G14 14” 165Hz Gaming Laptop QH')]")
WebElement chooseAlapTop;
@FindBy(xpath = "//button[normalize-space()='Add to Cart']")
WebElement addToCart;
@FindBy(xpath = "//button[normalize-space()='Continue shopping']")
WebElement continueshopping;
@FindBy(xpath = "//span[@class='cart-label']")
WebElement goTocart;
@FindBy(xpath = "//button[normalize-space()='Checkout']")
WebElement checkOut;

@FindBy(xpath = "//button[normalize-space()='Continue as Guest']")
WebElement guestMode;
@FindBy(xpath = "//input[@id='user.emailAddress']")
WebElement BillingMailID;
@FindBy(xpath = "//input[@id='user.phone']")
WebElement BillingMobileNo;
@FindBy(xpath = "//span[normalize-space()='Continue to Payment Information']")
WebElement ContinuePayment;



@FindBy(xpath = "//button[@id='survey_invite_no']")
WebElement closeSurvey;

@FindBy(xpath = "//input[@id='first-name']")
WebElement BillingAddressName;
@FindBy(xpath = "//input[@id='last-name']")
WebElement BillingAddressLastName;
@FindBy(xpath = "//input[@id='address-input']")
WebElement BillingAddress;
@FindBy(xpath = "//input[@id='city']")
WebElement BillingAddressCity;
@FindBy(xpath = "//*[@id=\"state\"]/option[4]")
WebElement BillingState;
@FindBy(xpath = "//input[@id='postalCode']")
WebElement BillingAddressZipcode;
@FindBy(xpath = "//span[normalize-space()='Place Your Order']")
WebElement PlaceOrder;







private File screenshotFile;








public bestBuy(WebDriver driver) {	
		this.driver =driver;
		PageFactory.initElements(BaseFileConfig.driver, this);
      	}
   
public void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    wait.until(ExpectedConditions.elementToBeClickable(element));
}

public void waitForPresenceOfElement(WebElement element, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    wait.until(ExpectedConditions.visibilityOf(element));
}
public void waitForElementPresence(By locator, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}


public void takeScreenshot(WebDriver driver, String fileName) {
    // Convert the WebDriver instance to TakesScreenshot
    TakesScreenshot ts = ((TakesScreenshot) driver);

    // Capture the screenshot as a file
    File screenshot = ts.getScreenshotAs(OutputType.FILE);

    try {		
        // Copy the file to a desired location
        org.apache.commons.io.FileUtils.copyFile(screenshot, new File(fileName));
        System.out.println("Screenshot captured and saved as " + fileName);
    } catch (IOException e) {
        System.out.println("Failed to capture screenshot: " + e.getMessage());
    }
}

public void	homepage() {
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 String actualTitle = (driver.getTitle());

     // Define the expected title
     String expectedTitle = "Best Buy International: Select your Country - Best Buy";

     // Validate the title Best Buy | Official Online Store | Shop Now & Save
     if (actualTitle.equals(expectedTitle)) {
         System.out.println("Title Validation Passed!");
     } else {
         System.out.println("Title Validation Failed. Actual title: " + actualTitle);
     }
     
}

public void countrySelect() {
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	US.click();
	
}

public void homepageValidation() {
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 String actualTitle = (driver.getTitle());

     // Define the expected title
     String expectedTitle = "Best Buy | Official Online Store | Shop Now & Save";

     // Validate the title 
     if (actualTitle.equals(expectedTitle)) {
         System.out.println("Homepage Validation Passed!");
     } else {
         System.out.println("Homepage Validation Failed. Actual title: " + actualTitle);
     }
     takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\PROJECT\\Bestbuy\\Screenshots\\homepagevalidation.jpg");
}

public void accountLink() {
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	waitForElementToBeClickable(accountLink,10);
   	accountLink.click();
   	waitForElementToBeClickable(createAccount,10);
   	createAccount.click();
   	waitForPresenceOfElement(firstName,6);
   	firstName.sendKeys("arun");
   	lastName.sendKeys("kumar");
   	email.sendKeys("s.arun_86@protonmail.com");
   	password.sendKeys("MYmailpass123!");
   	confirmPassword.sendKeys("MYmailpass123!");
   	mobileNumber.sendKeys("8668135376");
   	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 200);");
   	accountRecovery.click();
   	submitButton.click();
   	JavascriptExecutor js1 = (JavascriptExecutor) driver;
    js1.executeScript("window.scrollBy(0, 20);");
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\PROJECT\\Bestbuy\\Screenshots\\signuppage.jpg");
    }

public void googleSignup() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	waitForElementToBeClickable(accountLink,10);
   	accountLink.click();
   	waitForElementToBeClickable(createAccount,10);
   	createAccount.click();	
   	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 400);");
	waitForPresenceOfElement(googleSignup,6);
	googleSignup.click();
	// window handlying
	Set<String> handles = driver.getWindowHandles();
	ArrayList<String>  list = new ArrayList<String> (handles);
	System.out.println("ID :"+handles + '\n' + "Total :" +list.size());
	driver.switchTo().window(list.get(1));
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    //send google Login information
	waitForElementToBeClickable(googleID,15);
	googleID.click();

// Take the screenshot
	takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\PROJECT\\Bestbuy\\Screenshots\\googlesignup.jpg");
}



public void shopping() {
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	waitForElementToBeClickable(lapTops,10);
   	lapTops.click();
   	waitForElementToBeClickable(lapTopsList,10);
   	lapTopsList.click();
   	
   	waitForElementToBeClickable(gaminglapTops,10);
   	gaminglapTops.click();
	waitForElementToBeClickable(chooseAlapTop,10);
	chooseAlapTop.click();
	// popup handlying
	try {
		if (closeSurvey.isDisplayed()){
			closeSurvey.click();
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 400);");
	waitForElementToBeClickable(addToCart,10);
	addToCart.click();
	waitForElementToBeClickable(continueshopping,10);
	continueshopping.click();
	goTocart.click();
	waitForElementToBeClickable(checkOut,10);
	checkOut.click();


// Take the screenshot
	takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\PROJECT\\Bestbuy\\Screenshots\\checkout.jpg");
}


public void customerTypeGuest() {
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	guestMode.click();
}
public void billingDetails() {
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 400);");
   	waitForElementToBeClickable(BillingMailID,10);
   	BillingMailID.sendKeys("s.arun_86@protonmail.com");
	waitForElementToBeClickable(BillingMobileNo,10);
	BillingMobileNo.sendKeys("8668135376");
	waitForElementToBeClickable(ContinuePayment,10);
	ContinuePayment.click();

	takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\PROJECT\\Bestbuy\\Screenshots\\billing.jpg");
}




public void placeOrder() {
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	waitForElementToBeClickable(BillingAddressName,10);
	BillingAddressName.sendKeys("arun");
   	waitForElementToBeClickable(BillingAddressLastName,10);
   	BillingAddressLastName.sendKeys("kumar");
	waitForElementToBeClickable(BillingAddress,10);
	BillingAddress.sendKeys("5686 Grand Teton Loop, Anchorage, AK 99502");
	waitForElementToBeClickable(BillingAddressCity,10);
	BillingAddressCity.sendKeys("Alaska");
	BillingState.click();
	BillingAddressZipcode.sendKeys("99502");
	PlaceOrder.click();
	takeScreenshot(driver,"C:\\Users\\SHASWATH\\Documents\\arun\\PROJECT\\Bestbuy\\Screenshots\\placeorder.jpg");
}
}