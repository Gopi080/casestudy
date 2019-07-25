package case2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case2stepdefn {
	WebDriver driver;
	@Given("opens TestMeApp")
	public void open_TestMeApp() {
		 System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
	  
	}
	@And("sign in")
	public void sign_in1() {
		
		driver.findElement(By.linkText("SignIn")).click();
	  	}



	@And("enter {string}")
	public void enter1(String username) {
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	@Then("enters {string}")
	public void enters1(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("validates login")
	public void validate_login() {
		driver.findElement(By.name("Login")).click();
	}

	/*@Given("sign in")
	public void sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	//@Given("enter {string}")
	public void enter(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	//@Then("enters {string}")
	public void enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/

@Then("search{string}")
public void search(String pro){
		driver.findElement(By.id("myInput")).sendKeys(pro);
		}
@Then("click search")
public void searching()
{
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
			
	}
@Then("signoff")
	public void signoff() {
		driver.close();
	  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Then("sign off")
	public void sign_off() {
		   driver.close(); 
	}


}
