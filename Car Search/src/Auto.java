import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Auto 
{

	private WebDriver chromeDriver;
	
	@BeforeTest
	public void Autox()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Work-Elbit\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Adi\\Desktop\\app\\node_modules\\electron\\dist\\electron.exe");

		chromeDriver = new ChromeDriver(options);
		//chromeDriver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) chromeDriver;  
		js.executeScript("require('electron').remote.BrowserWindow.getFocusedWindow().maximize();");
		
		//chromeDriver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
		//chromeDriver.get("https://www.facebook.com/");

		/*
		try {
			 WebElement myDynamicElement = chromeDriver.findElement(By.id("myDynamicElement"));
			
		} catch (Exception e) {
			 System.out.println("asdsad");
		}

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));;
		*/
	}
	
	@Test
	public void mx()
	{
		
		System.out.println("asdasdasd");
		WebDriverWait wait = new WebDriverWait(chromeDriver, 10);
		
		WebElement div1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("div1")));
		div1.click();
		
		WebElement userName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName")));
		userName.sendKeys("Adi Arbili");
		
		WebElement btn1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn1")));
		btn1.click();	
		
			

		
	}
	//@Test
	public void m()
	{
		
		System.out.println("asdasdasd");
		WebDriverWait wait = new WebDriverWait(chromeDriver, 5);
		
		WebElement y = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/h2")));//*
		WebElement x = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
		x.sendKeys("adi_a_2@walla.com");
		y.click();
		y.click();
		//System.out.println("asdasdasd");
	}
	
	//public static void main(String[] args) 
	//{
		//new Auto("https://www.facebook.com/");
	//}
}
