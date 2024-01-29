import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Listener {

    public static void main(String[] args) {

        // Set ChromeDriver options (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize the browser window

        // Set the path to the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dev\\Downloads\\chromedriver.exe");

        // Initialize the WebDriver with ChromeDriver and options
        WebDriver driver = new ChromeDriver(options);

        // Set up waits
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // For explicit waits

        // Set up implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit wait with a timeout of 10 seconds

        // Create an instance of MyWebDriverListener
        MyWebDriverListener myListener = new MyWebDriverListener();

        // Wrap the original WebDriver instance with EventFiringWebDriver
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        
        // Register the listener with EventFiringWebDriver
        eventDriver.register(myListener);

        // Step 1: Open the Yahoo login page
        System.out.println("Step 1: Opening Yahoo login page");
        eventDriver.get("https://login.yahoo.com");

        // Step 2: Enter the username
        WebElement usernameInput = eventDriver.findElement(By.xpath("//input[@id='login-username']"));
        System.out.println("Step 2: Entering username");
        usernameInput.sendKeys("edureka@yahoo.com");

        // Step 3: Click the 'Next' button
        WebElement nextButton = eventDriver.findElement(By.xpath("//input[@id='login-signin']"));
        System.out.println("Step 3: Clicking 'Next' button");
        nextButton.click();

        // Step 4: Close the browser
        System.out.println("Step 5: Closing the browser");
        eventDriver.quit();
    }
}

// Custom WebDriverEventListener
class MyWebDriverListener implements WebDriverEventListener {

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("Before clicking on element: " + element.toString());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("After clicking on element: " + element.toString());
    }

	@Override
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

    // Implement other methods from WebDriverEventListener interface if needed
}
