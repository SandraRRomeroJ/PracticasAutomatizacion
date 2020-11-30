package StepsDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;

import java.util.concurrent.TimeUnit;

import javax.security.auth.spi.LoginModule;

import io.cucumber.java.en.*;


public class LoginStepsPOM {

	private static final LoginPage Login = null;
	
	WebDriver driver = null;
	
	LoginPage login;
	
	@SuppressWarnings("deprecation")
	@Given("Opens browser")
	public void opens_browser() {
		
			
		System.out.println("Inside step - browser is open");
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Hitss/Documents/Eclipse/practica/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("User is in the login page")
	public void user_is_in_the_login_page() {
		
		
		driver.navigate().to("http://mxsrvwasmui1t.alico.corp/ClienteUnico/login.jsp");
	}

	@When("^user enters(.*) and (.*)$")
	public void user_enters_valid_user_name_and_password(String username, String password)throws InterruptedException {
	   
		login = new LoginPage(driver);
		
//		Login.enterUserName(username);
//		Login.enterPassword(password);   
		
		driver.findElement(By.id("login_usuario")).sendKeys("N3414900");
		driver.findElement(By.id("login_contrasenya")).sendKeys("OWe7GtVy");
		
				
	}

		@And("clics on login button")
	public void clics_on_login_button() {
		
		login.clickLogin();
		
				
	}

	@Then("user is directed to the home page")
	public void user_is_directed_to_the_home_page() {
		
		System.out.println("Inside step - user is directed to the home page");
		
			
		
	driver.quit();
	
	}
	
	}