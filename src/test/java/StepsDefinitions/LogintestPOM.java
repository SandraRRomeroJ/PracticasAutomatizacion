//package StepsDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Pages.loginpage;
//import io.cucumber.java.en.*;
//
//public class LogintestPOM {
//
//	WebDriver driver=null;
//	loginpage login;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//
//		System.out.println("        PRACTICA POM      ");
//		String projectPath=System.getProperty("user.dir");
//		System.out.println("Project path is : "+projectPath);
//
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//	}
//
//	@And("user is in log in page")
//	public void user_is_in_log_in_page() {
//
//
//
//		driver.navigate().to("http://mxsrvwasmui1t.alico.corp/ClienteUnico/login.jsp");
//
//
//	}
//
//	@When("^user enters valid (.*) and (.*)$")
//	public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException  {
//
//		login = new loginpage(driver);
//		
//		
//		login.enterUserName(username);
//		login.enterPassword(password);
//
//		Thread.sleep(2000);
//
//		//driver.findElement(By.id("login_usuario")).sendKeys(username);
//		//driver.findElement(By.id("login_contrasenya")).sendKeys(password);
//
//
//	}
//
//	@And("user clicks on login button")
//	public void user_clicks_on_login_button() {
//
//		login.clickLogin();
//
//		//driver.findElement(By.id("btn_label")).click();
//
//
//	}  
//
//	@Then("user is directed to the home page")
//	public void user_is_directed_to_the_home_page() throws InterruptedException {
//
//		login.Checkrfcisdisplayed();
//
//		//driver.findElement(By.id("div_completar")).isDisplayed();
//
//		Thread.sleep(2000);
//
//
//		//driver.close();
//
//	}
//
//	@Then("user clicks on cliente button")
//	public void user_clicks_on_cliente_button() throws InterruptedException {
//
//		login.clickcliente();
//		Thread.sleep(2000);
//	}
//
//	@And("user clicks on linea de negocio dropdown")
//	public void user_clicks_on_lineadenegocio_dropdown() {
//
//		login.clicklineadenegocio();
//
//		
//	}
//
//
//	@Then("user enters the linea de negocio")
//	public void user_enters_lineadenegocio() {
//
//		String lineanegocio = null;
//		login.EntersLNegocio(lineanegocio);
//	}
//
//}
