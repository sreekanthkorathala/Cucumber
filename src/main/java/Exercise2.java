import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Exercise2 {
	WebDriver driver;
	@Given("Open the browser and navigate to amazon")
	public void open_the_browser_and_navigate_to_amazon() {
		System.setProperty("webdriver.chrome.driver","D:/eclipse/Libs/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String baseurl="https://www.amazon.in/";
		driver.navigate().to(baseurl);
	
	}

	@When("user login to amazon account")
	public void user_login_to_amazon_account()  {
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("7997750351");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("sreekvkr@0910");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	}

	@When("add the item int cart")
	public void add_the_item_int_cart()  {
		
		 driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[5]/a")).click();
		
		 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	}

	@Then("logout to application")
	public void logout_to_application() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[29]/a")).click();
	}

}
