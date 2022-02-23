package steps;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	WebDriver driver;

@Given("User open chrome browser")
public void user_open_chrome_browser() {
    
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
}

@Given("User launch app using url {string}")
public void user_launch_app_using_url(String url) {
	
	driver.get(url);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
    
}

@When("User enters text {string} using xpath {string}")
public void user_enters_text_using_xpath(String text, String xpath) {
    
	driver.findElement(By.xpath(xpath)).sendKeys(text);
}

@When("User Click button using xpath {string}")
public void user_click_button_using_xpath(String xpath) {
    
	driver.findElement(By.xpath(xpath)).click();
}

@Then("User validate title to be {string}")
public void user_validate_title_to_be(String expValue) {
    
	Assert.assertEquals(driver.getTitle(), expValue);
}


@Then("User close the browser")
public void user_close_the_browser() {
    
	
	driver.quit();
}

@Then("User click link using xpath {string}")
public void user_click_link_using_xpath(String xpath) {
    
	driver.findElement(By.xpath(xpath)).click();
}



@Then("User enters details in New User Registration Form")
public void user_enters_details_in_new_user_registration_form(DataTable dataTable) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    
	/*
	 * List<List<String>> deatilsList=dataTable.asLists(String.class);
	 * 
	 * for(List<String> list:deatilsList) { System.out.println(list);
	 * 
	 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i));
	 * 
	 * driver.findElement(By.xpath("(//input[@class='reg_input'])["+(i+1)+"]")).
	 * sendKeys(list.get(i));
	 * 
	 * Thread.sleep(3000); } }
	 */
	
	
	List<Map<String, String>> listOfMaps=dataTable.asMaps();
	
	System.out.println(listOfMaps.size());
	
	System.out.println(listOfMaps.get(0).get("username"));
	System.out.println(listOfMaps.get(0).get("password"));
	System.out.println(listOfMaps.get(0).get("confirmPassword"));
	System.out.println(listOfMaps.get(0).get("fullName"));
	System.out.println(listOfMaps.get(0).get("email"));
	
	
	for(Map<String, String> map:listOfMaps)
	{
		System.out.println(map);
	}
	
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(listOfMaps.get(0).get("username"));
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(listOfMaps.get(0).get("password"));
	driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(listOfMaps.get(0).get("confirmPassword"));
	driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(listOfMaps.get(0).get("fullName"));
	driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(listOfMaps.get(0).get("email"));
	
	
}



}
