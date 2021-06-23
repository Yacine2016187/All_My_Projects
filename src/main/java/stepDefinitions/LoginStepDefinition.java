/*package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition{

	 WebDriver driver;


 @Given("^user is already on Login Page$")
public void user_already_on_login_page(){
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Yacine\\Desktop\\CucumberSeleniumFramework-master\\Drivers\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.get("https://classic.freecrm.com/index.html");
 }


 @When("^title of login page is Free CRM$")
public void title_of_login_page_is_free_CRM(){
String title = driver.getTitle();
 System.out.println(title);
 Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", title);
 }
	
 @Then("^user enters \"(.*)\" and \"(.*)\"$")
 public void user_enters_username_and_password(String username,StringBuffer password){
driver.findElement(By.name("username")).sendKeys(username);
 driver.findElement(By.name("password")).sendKeys(password);
}
	
@Then("^user clicks on login button$")
 public void user_clicks_on_login_button() {
	 WebElement loginBtn =
driver.findElement(By.xpath("//input[@type='submit']"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", loginBtn);
 }
	
 @Then("^user is on home page$")
public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("CRMPRO", title);
	 }
 @Then("^user move to New contact page$")
 public void user_move_to_New_contact_page()  {
	 driver.switchTo().frame("mainpanel");
	 WebElement contacts=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
     Actions obj=new Actions(driver);
     obj.moveToElement(contacts).build().perform();
     driver.findElement(By.xpath("//*[@title='New Contact']")).click();
     driver.findElement(By.xpath("(//input[@type='submit' and @value='Save' and @class='button'])"));
 }

 @Then("^user Enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
 public void user_Enters_and_and(String firstName, String LastName, String Position)  {
     driver.findElement(By.id("first_name")).sendKeys(firstName);
     driver.findElement(By.id("surname")).sendKeys(LastName);
     driver.findElement(By.id("company_position")).sendKeys(Position);
 }

 @Then("^Close The Browser$")
 public void close_The_Browser()  {
    driver.quit();
 }
}*/