/*package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefinition {
	

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
@Then("^user enters username and password$")
public void user_enters_username_and_password(DataTable creadentials){
	
	List<List<String>> data=creadentials.raw();
driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
driver.findElement(By.name("password")).sendKeys(data.get(1).get(1));
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
@Then("^user move to New Deal page$")
public void user_move_to_New_Deal_page()  {
	 driver.switchTo().frame("mainpanel");
	 WebElement deals=driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
    Actions obj=new Actions(driver);
    obj.moveToElement(deals).build().perform();
    driver.findElement(By.xpath("//*[@title='New Deal']")).click();
    driver.findElement(By.xpath("(//input[@type='submit' and @value='Save' and @class='button'])"));
}
@Then("^user Enters Deal Details$")
public void user_Enters_and_and(DataTable dealData)  {
	List<List<String>> dealvalues=dealData.raw();
	driver.findElement(By.id("title")).sendKeys(dealvalues.get(0).get(0));
	driver.findElement(By.id("amount")).sendKeys(dealvalues.get(0).get(1));
	driver.findElement(By.id("probability")).sendKeys(dealvalues.get(0).get(2));
	driver.findElement(By.id("commission")).sendKeys(dealvalues.get(0).get(3));
}

@Then("^Close The Browser$")
public void close_The_Browser()  {
   driver.quit();

}   
}*/