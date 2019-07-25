package case2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Case4 {
	
	
	WebDriver driver;
	int find;
	@Given("opens testmeapp")
	public void opens_testmeapp() {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.findElement(By.linkText("SignIn")).click();
	}

	@Given("enters username and password")
	public void enters_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
	}

	@When("searchs product")
	public void searchs_product() {
		driver.findElement(By.id("myInput")).sendKeys("Headphones");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("payment process without cart")
	public void payment_process_without_cart() {
		 find = driver.findElements(By.partialLinkText("Cart")).size();
	}

	@Then("test me app doesn't displays cart")
	public void test_me_app_doesn_t_displays_cart() {
		
		if(find>0)
		{	
		Assert.assertTrue(false);}
		else
		{
		Assert.assertTrue(true);}
		
		driver.close();
		
	   
	}

}
